/*******************************************************************************
 * Copyright(c) 2015 SWTEST. All rights reserved.
 * This software is the proprietary information of SWTEST.
 *******************************************************************************/
package kr.co.swtest.example.spring.bean.java.step05;

import kr.co.swtest.example.spring.bean.Ticket;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * 자바 기반 설정
 *
 *<p>
 * 스프링에 내장된 기본 유효범위 값
 * </p>
 * <ul>
 * <li>singleton       : 스프링 컨터이너당 하나의 인스턴스(기본값)</li>
 * <li>prototype       : 사용할 때마다 새 인스턴스 생성</li>
 * <li>request         : HTTP 요청당 하나의 인스턴스. Spring MVC같이 웹 환경에서 사용할 때만 유효함.</li>
 * <li>session         : HTTP 세션당 하나의 인스턴스. Spring MVC같이 웹 환경에서 사용할 떄만 유효함.</li>
 * <li>global-session  : 전역 HTTP 세션(global HTTP session)당 하나의 인스턴스. 포틀릿 환경에서 사용할 때만 유효함.</li>
 * </ul>
 *
 * @author <a href="mailto:scroogy@swtest.co.kr">최영목</a>
 * @since spring 3.0
 * @see ConfigurableBeanFactory#SCOPE_PROTOTYPE
 * @see ConfigurableBeanFactory#SCOPE_SINGLETON
 * @see org.springframework.web.context.WebApplicationContext#SCOPE_REQUEST
 * @see org.springframework.web.context.WebApplicationContext#SCOPE_SESSION
 */
@Configuration
public class AppConfig {

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    public Ticket ticket1() {
        return new Ticket();
    }

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Ticket ticket2() {
        return new Ticket();
    }

}
