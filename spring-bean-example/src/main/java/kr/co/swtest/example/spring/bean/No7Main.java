package kr.co.swtest.example.spring.bean;

/*******************************************************************************
 * Copyright(c) 2012 SWTEST. All rights reserved.
 * This software is the proprietary information of SWTEST.
 *******************************************************************************/

import kr.co.swtest.example.spring.bean.no6.AndroidAppProgrammer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * No7 Main <br/>
 * 빈 프로퍼티에 주입하기(p 네임스페이스)
 *
 * @author <a href="mailto:scroogy@swtest.co.kr">최영목</a>
 * @since 2012. 6. 12.
 */
public class No7Main {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("no7-context.xml");

        AndroidAppProgrammer androidAppProgrammer = (AndroidAppProgrammer) ctx.getBean("androidAppProgrammer");
        androidAppProgrammer.work();
    }

}
