package kr.co.swtest.example.spring.bean;

/*******************************************************************************
 * Copyright(c) 2012 SWTEST. All rights reserved.
 * This software is the proprietary information of SWTEST.
 *******************************************************************************/

import kr.co.swtest.example.spring.bean.no2.IPhoneAppProgrammer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * No2_2 Main <br/>
 * 생성자로 객체 레퍼런스 주입하기
 *
 * @author <a href="mailto:scroogy@swtest.co.kr">최영목</a>
 * @since 2012. 6. 12.
 */
public class No2_2Main {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("no2-2-context.xml");

        IPhoneAppProgrammer iPhoneAppProgrammer = (IPhoneAppProgrammer) ctx.getBean("iPhoneAppProgrammer");
        iPhoneAppProgrammer.work();
    }

}
