/*******************************************************************************
 * Copyright(c) 2015 SWTEST. All rights reserved.
 * This software is the proprietary information of SWTEST.
 *******************************************************************************/
package kr.co.swtest.example.spring.bean.java;

import static org.junit.Assert.assertTrue;
import kr.co.swtest.example.spring.bean.Room;
import kr.co.swtest.example.spring.bean.java.step06.AppConfig;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 빈의 초기화와 정리작업
 *
 * @author <a href="mailto:scroogy@swtest.co.kr">최영목</a>
 */
public class Step06Test {

    /** ApplicationContext */
    private AnnotationConfigApplicationContext ctx;

    @Before
    public void before() {
        this.ctx = new AnnotationConfigApplicationContext(AppConfig.class);
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
