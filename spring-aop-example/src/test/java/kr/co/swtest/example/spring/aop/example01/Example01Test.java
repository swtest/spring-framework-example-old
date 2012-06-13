/*******************************************************************************
 * Copyright(c) 2012 SWTEST. All rights reserved.
 * This software is the proprietary information of SWTEST.
 *******************************************************************************/
package kr.co.swtest.example.spring.aop.example01;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import kr.co.swtest.example.spring.aop.example01.service.CustomerService;
import kr.co.swtest.example.spring.aop.example01.service.logic.CustomerServiceLogic;

import org.junit.Before;
import org.junit.Test;

/**
 * Example01Test <br/>
 * 권한적용 : POJO
 *
 * @author <a href="mailto:scroogy@swtest.co.kr">최영목</a>
 * @since 2012. 6. 13.
 */
public class Example01Test {

    /** CustomerService */
    private CustomerService customerService;

    @Before
    public void before() {
        this.customerService = new CustomerServiceLogic();
    }

    // -------------------------------------------------------------------------
    // Test Method
    // -------------------------------------------------------------------------

    /**
     * 성공 케이스
     */
    @Test
    public void testSuccess() {
        assertTrue(this.customerService.someProcess(2));
    }

    /**
     * 실패 케이스
     */
    @Test
    public void testFail() {
        assertFalse(this.customerService.someProcess(1));
    }

}
