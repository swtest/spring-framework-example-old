/*******************************************************************************
 * Copyright(c) 2015 SWTEST. All rights reserved.
 * This software is the proprietary information of SWTEST.
 *******************************************************************************/
package kr.co.swtest.example.spring.bean.java.step03;

import kr.co.swtest.example.spring.bean.Computer;
import kr.co.swtest.example.spring.bean.IPhoneAppProgrammer;
import kr.co.swtest.example.spring.bean.MacBookProRetina;
import kr.co.swtest.example.spring.bean.Programmer;
import kr.co.swtest.example.spring.bean.ProjectMember;

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

    /** 생성자를 이용한 주입 */
    @Bean
    public ProjectMember programmer() {
        return new Programmer(12);
    }

    @Bean
    public Computer macbookProRetina() {
        return new MacBookProRetina();
    }

    /** 생성자로 객체 레퍼런스 주입하기 */
    @Bean
    public ProjectMember iPhoneAppProgrammer() {
        return new IPhoneAppProgrammer(10, macbookProRetina());
    }

}
