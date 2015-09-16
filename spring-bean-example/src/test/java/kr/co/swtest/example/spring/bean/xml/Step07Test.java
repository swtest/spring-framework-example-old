/*******************************************************************************
 * Copyright(c) 2015 SWTEST. All rights reserved.
 * This software is the proprietary information of SWTEST.
 *******************************************************************************/
package kr.co.swtest.example.spring.bean.xml;

import kr.co.swtest.example.spring.bean.AndroidAppProgrammer;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 빈 프로퍼티에 주입하기
 *
 * @author <a href="mailto:scroogy@swtest.co.kr">최영목</a>
 */
public class Step07Test {

    @Test
    public void test() {
        @SuppressWarnings("resource")
        ApplicationContext ctx = new ClassPathXmlApplicationContext("xml/step07/applicationContext.xml");

        AndroidAppProgrammer androidAppProgrammer = (AndroidAppProgrammer) ctx.getBean("androidAppProgrammer");
        androidAppProgrammer.work();

        AndroidAppProgrammer androidAppProgrammer2 = (AndroidAppProgrammer) ctx.getBean("androidAppProgrammer2");
        androidAppProgrammer2.work();

        AndroidAppProgrammer androidAppProgrammer3 = (AndroidAppProgrammer) ctx.getBean("androidAppProgrammer3");
        androidAppProgrammer3.work();
    }

}
