/*******************************************************************************
 * Copyright(c) 2012 SWTEST. All rights reserved.
 * This software is the proprietary information of SWTEST.
 *******************************************************************************/
package kr.co.swtest.example.spring.aop.example02;

import kr.co.swtest.example.spring.aop.example01.service.CustomerService;
import kr.co.swtest.example.spring.aop.example02.proxy.TransactionServiceProxy;
import kr.co.swtest.example.spring.aop.example02.service.logic.CustomerServiceLogic02;

import org.junit.Before;
import org.junit.Test;

/**
 * Example02Test <br/>
 * with Proxy
 *
 * @author <a href="mailto:scroogy@swtest.co.kr">최영목</a>
 * @since 2012. 6. 13.
 */
public class Example02Test {

    /** CustomerService */
    private CustomerService customerService;

    @Before
    public void before() {
        this.customerService = (CustomerService) TransactionServiceProxy.newInstance(new CustomerServiceLogic02());
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
