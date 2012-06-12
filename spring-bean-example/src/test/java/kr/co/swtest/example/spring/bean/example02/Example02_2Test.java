/*******************************************************************************
 * Copyright(c) 2012 SWTEST. All rights reserved.
 * This software is the proprietary information of SWTEST.
 *******************************************************************************/
package kr.co.swtest.example.spring.bean.example02;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Example02_2Test <br/>
 * 생성자로 객체 레퍼런스 주입하기
 *
 * @author <a href="mailto:scroogy@swtest.co.kr">최영목</a>
 * @since 2012. 6. 13.
 */
public class Example02_2Test {

    @Test
    public void test() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("example02_2-applicationContext.xml");

        IPhoneAppProgrammer iPhoneAppProgrammer = (IPhoneAppProgrammer) ctx.getBean("iPhoneAppProgrammer");
        iPhoneAppProgrammer.work();
    }

}
