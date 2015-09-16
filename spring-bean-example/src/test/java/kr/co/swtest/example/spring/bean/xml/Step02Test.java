/*******************************************************************************
 * Copyright(c) 2015 SWTEST. All rights reserved.
 * This software is the proprietary information of SWTEST.
 *******************************************************************************/
package kr.co.swtest.example.spring.bean.xml;

import kr.co.swtest.example.spring.bean.ProjectMember;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 간단한 빈 선언
 *
 * @author <a href="mailto:scroogy@swtest.co.kr">최영목</a>
 */
public class Step02Test {

    @Test
    public void test() {
        @SuppressWarnings("resource")
        ApplicationContext ctx = new ClassPathXmlApplicationContext("xml/step02/applicationContext.xml");

        ProjectMember programmer = (ProjectMember) ctx.getBean("programmer");
        programmer.work();
    }

}
