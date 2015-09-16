/*******************************************************************************
 * Copyright(c) 2015 SWTEST. All rights reserved.
 * This software is the proprietary information of SWTEST.
 *******************************************************************************/
package kr.co.swtest.example.spring.bean.java;

import kr.co.swtest.example.spring.bean.ProjectMember;
import kr.co.swtest.example.spring.bean.java.step02.AppConfig;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 간단한 빈 선언
 *
 * @author <a href="mailto:scroogy@swtest.co.kr">최영목</a>
 */
public class Step02Test {

    @Test
    public void test() {
        @SuppressWarnings("resource")
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        ProjectMember programmer = (ProjectMember) ctx.getBean("programmer");
        programmer.work();
    }

}
