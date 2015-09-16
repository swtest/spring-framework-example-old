/*******************************************************************************
 * Copyright(c) 2015 SWTEST. All rights reserved.
 * This software is the proprietary information of SWTEST.
 *******************************************************************************/
package kr.co.swtest.example.spring.bean.java;

import static org.junit.Assert.assertNotNull;
import kr.co.swtest.example.spring.bean.ServiceFactory;
import kr.co.swtest.example.spring.bean.java.step04.AppConfig;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 팩토리 메서드를 이용한 빈 생성
 *
 * @author <a href="mailto:scroogy@swtest.co.kr">최영목</a>
 */
public class Step04Test {

    @Test
    public void test() {
        @SuppressWarnings("resource")
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        ServiceFactory serviceFactory = (ServiceFactory) ctx.getBean("serviceFactory");
        assertNotNull(serviceFactory);
    }

}
