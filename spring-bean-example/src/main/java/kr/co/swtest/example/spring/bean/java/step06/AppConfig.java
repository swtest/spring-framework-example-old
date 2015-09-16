/*******************************************************************************
 * Copyright(c) 2015 SWTEST. All rights reserved.
 * This software is the proprietary information of SWTEST.
 *******************************************************************************/
package kr.co.swtest.example.spring.bean.java.step06;

import kr.co.swtest.example.spring.bean.Room;

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

    /** 빈의 초기화와 정리작업 */
    @Bean(initMethod = "turnOnLights", destroyMethod = "turnOffLights")
    public Room room() {
        return new Room();
    }

}
