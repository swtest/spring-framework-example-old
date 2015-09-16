/*******************************************************************************
 * Copyright(c) 2015 SWTEST. All rights reserved.
 * This software is the proprietary information of SWTEST.
 *******************************************************************************/
package kr.co.swtest.example.spring.bean.xml;

import kr.co.swtest.example.spring.bean.component.CustomerController;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 자동 빈 설정
 *
 * @author <a href="mailto:scroogy@swtest.co.kr">최영목</a>
 */
public class Step08Test {

    @Test
    public void test() {
        @SuppressWarnings("resource")
        ApplicationContext ctx = new ClassPathXmlApplicationContext("xml/step08/applicationContext.xml");

        CustomerController customerController = ctx.getBean(CustomerController.class);
        customerController.readCustomer();
    }

}
