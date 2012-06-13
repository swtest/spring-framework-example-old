/*******************************************************************************
 * Copyright(c) 2012 SWTEST. All rights reserved.
 * This software is the proprietary information of SWTEST.
 *******************************************************************************/
package kr.co.swtest.example.spring.aop.example04;

import kr.co.swtest.example.spring.aop.example01.service.CustomerService;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Example04Test <br/>
 * with spring aop
 *
 * @author <a href="mailto:scroogy@swtest.co.kr">최영목</a>
 * @since 2012. 6. 13.
 */
public class Example04Test {

    /** CustomerService */
    private CustomerService customerService;

    @Before
    public void before() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("example04-applicationContext.xml");
        this.customerService = (CustomerService) ctx.getBean("customerServiceLogic02");
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
    @Test(expected = RuntimeException.class)
    public void testFail() {
        this.customerService.someProcess(1);
    }

}
