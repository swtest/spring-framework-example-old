/*******************************************************************************
 * Copyright(c) 2015 SWTEST. All rights reserved.
 * This software is the proprietary information of SWTEST.
 *******************************************************************************/
package kr.co.swtest.example.spring.bean.xml;

import static org.junit.Assert.assertNotNull;
import kr.co.swtest.example.spring.bean.ServiceFactory;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 팩토리 메서드를 이용한 빈 생성
 *
 * @author <a href="mailto:scroogy@swtest.co.kr">최영목</a>
 */
public class Step04Test {

    @Test
    public void test() {
        @SuppressWarnings("resource")
        ApplicationContext ctx = new ClassPathXmlApplicationContext("xml/step04/applicationContext.xml");

        ServiceFactory serviceFactory = (ServiceFactory) ctx.getBean("serviceFactory");
        assertNotNull(serviceFactory);
    }

}
