/*******************************************************************************
 * Copyright(c) 2012 SWTEST. All rights reserved.
 * This software is the proprietary information of SWTEST.
 *******************************************************************************/
package kr.co.swtest.example.spring.aop.example03;

import kr.co.swtest.example.spring.aop.example01.service.CustomerService;
import kr.co.swtest.example.spring.aop.example02.service.logic.CustomerServiceLogic02;
import kr.co.swtest.example.spring.aop.example03.proxy.TransactionServiceProxy02;
import net.sf.cglib.proxy.Enhancer;

import org.junit.Before;
import org.junit.Test;

/**
 * Example03Test <br/>
 * with cglib
 *
 * @author <a href="mailto:scroogy@swtest.co.kr">최영목</a>
 * @since 2012. 6. 13.
 */
public class Example03Test {

    /** CustomerService */
    private CustomerService customerService;

    @Before
    public void before() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(CustomerServiceLogic02.class);
        enhancer.setCallback(new TransactionServiceProxy02());
        this.customerService = (CustomerService) enhancer.create();
    }

    // -------------------------------------------------------------------------
    // Test Method
    // -------------------------------------------------------------------------

    /**
     * 성공 케이스
     */
    @Test
    public void testSuccess() {
        this.customerService.someProcess(2);
    }

    /**
     * 실패 케이스
     */
    @Test
    public void testFail() {
        this.customerService.someProcess(1);
    }

}
