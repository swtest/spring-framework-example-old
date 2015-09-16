/*******************************************************************************
 * Copyright(c) 2015 SWTEST. All rights reserved.
 * This software is the proprietary information of SWTEST.
 *******************************************************************************/
package kr.co.swtest.example.spring.bean.xml;

import static org.junit.Assert.assertTrue;
import kr.co.swtest.example.spring.bean.Room;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 빈의 초기화와 정리작업
 *
 * @author <a href="mailto:scroogy@swtest.co.kr">최영목</a>
 */
public class Step06Test {

    /** ApplicationContext */
    private ClassPathXmlApplicationContext ctx;

    @Before
    public void beforeClass() {
        this.ctx = new ClassPathXmlApplicationContext("xml/step06/applicationContext.xml");
    }

    @After
    public void after() {
        this.ctx.close();
    }

    @Test
    public void test() {
        assertTrue(this.ctx.getBean("room") instanceof Room);
    }

}
