/*******************************************************************************
 * Copyright(c) 2015 SWTEST. All rights reserved.
 * This software is the proprietary information of SWTEST.
 *******************************************************************************/
package kr.co.swtest.example.spring.bean.java;

import static org.junit.Assert.assertNotNull;
import kr.co.swtest.example.spring.bean.java.step01.AppConfig;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 메타데이터 선언
 *
 * @author <a href="mailto:scroogy@swtest.co.kr">최영목</a>
 */
public class Step01Test {

    @Test
    public void test() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        assertNotNull(ctx);
    }

}
