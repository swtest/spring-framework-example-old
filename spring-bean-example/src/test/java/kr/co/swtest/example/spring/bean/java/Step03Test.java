/*******************************************************************************
 * Copyright(c) 2015 SWTEST. All rights reserved.
 * This software is the proprietary information of SWTEST.
 *******************************************************************************/
package kr.co.swtest.example.spring.bean.java;

import kr.co.swtest.example.spring.bean.ProjectMember;
import kr.co.swtest.example.spring.bean.java.step03.AppConfig;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 생성자 주입
 *
 * @author <a href="mailto:scroogy@swtest.co.kr">최영목</a>
 */
public class Step03Test {

    @Test
    public void test() {
        @SuppressWarnings("resource")
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        ProjectMember programmer = (ProjectMember) ctx.getBean("programmer");
        programmer.work();

        ProjectMember iPhoneAppProgrammer = (ProjectMember) ctx.getBean("iPhoneAppProgrammer");
        iPhoneAppProgrammer.work();
    }

}
