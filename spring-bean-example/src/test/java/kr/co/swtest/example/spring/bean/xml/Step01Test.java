/*******************************************************************************
 * Copyright(c) 2015 SWTEST. All rights reserved.
 * This software is the proprietary information of SWTEST.
 *******************************************************************************/
package kr.co.swtest.example.spring.bean.xml;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 메타데이터 선언
 *
 * @author <a href="mailto:scroogy@swtest.co.kr">최영목</a>
 */
public class Step01Test {

    @Test
    public void test() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("xml/step01/applicationContext.xml");
        assertNotNull(ctx);
    }

}
