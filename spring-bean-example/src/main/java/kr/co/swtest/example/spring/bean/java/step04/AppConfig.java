/*******************************************************************************
 * Copyright(c) 2015 SWTEST. All rights reserved.
 * This software is the proprietary information of SWTEST.
 *******************************************************************************/
package kr.co.swtest.example.spring.bean.java.step04;

import kr.co.swtest.example.spring.bean.ServiceFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 자바 기반 설정
 *
 * @author <a href="mailto:scroogy@swtest.co.kr">최영목</a>
 * @since spring 3.0
 */
@Configuration
public class AppConfig {

    /** 팩토리 메서드를 이용한 빈 생성 */
    @Bean
    public ServiceFactory serviceFactory() {
        return ServiceFactory.getInstance();
    }

}
