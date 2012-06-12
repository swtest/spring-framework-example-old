/*******************************************************************************
 * Copyright(c) 2012 SWTEST. All rights reserved.
 * This software is the proprietary information of SWTEST.
 *******************************************************************************/
package kr.co.swtest.example.spring.bean.example02;

import kr.co.swtest.example.spring.bean.example01.Programmer;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Example02_1Test <br/>
 * 생성자를 이용한 주입
 *
 * @author <a href="mailto:scroogy@swtest.co.kr">최영목</a>
 * @since 2012. 6. 13.
 */
public class Example02_1Test {

    @Test
    public void test() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("example02_1-applicationContext.xml");

        Programmer programmer = (Programmer) ctx.getBean("programmer");
        programmer.work();
    }

}
