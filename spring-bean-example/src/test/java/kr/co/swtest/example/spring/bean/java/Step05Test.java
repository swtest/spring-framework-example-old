/*******************************************************************************
 * Copyright(c) 2015 SWTEST. All rights reserved.
 * This software is the proprietary information of SWTEST.
 *******************************************************************************/
package kr.co.swtest.example.spring.bean.java;

import static org.junit.Assert.assertEquals;
import kr.co.swtest.example.spring.bean.Ticket;
import kr.co.swtest.example.spring.bean.java.step05.AppConfig;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 빈 유효범위 지정
 *
 * @author <a href="mailto:scroogy@swtest.co.kr">최영목</a>
 */
public class Step05Test {

    /** ApplicationContext */
    private static ApplicationContext CTX;

    @BeforeClass
    public static void beforeClass() {
        CTX = new AnnotationConfigApplicationContext(AppConfig.class);
    }

    /**
     * scope : singleton 테스트
     */
    @Test
    public void testSingleton() {
        // 1. ticket 1_1 확인
        Ticket ticket1_1 = (Ticket) CTX.getBean("ticket1");
        int id = 1;
        assertEquals(id, ticket1_1.getId());

        // 2. ticket 1_1 id 변경
        int newId = 99;
        ticket1_1.setId(newId);

        // 3. ticket 1_2 확인
        Ticket ticket1_2 = (Ticket) CTX.getBean("ticket1");
        assertEquals(newId, ticket1_2.getId());
    }

    /**
     * scope : prototype 테스트
     */
    @Test
    public void testPrototype() {
        // 1. ticket 2_1 확인
        Ticket ticket2_1 = (Ticket) CTX.getBean("ticket2");
        int id = 1;
        assertEquals(id, ticket2_1.getId());

        // 2. ticket 2_1 id 변경
        int newId = 99;
        ticket2_1.setId(newId);

        // 3. ticket 2_2 확인
        Ticket ticket2_2 = (Ticket) CTX.getBean("ticket2");
        assertEquals(id, ticket2_2.getId());
    }

}
