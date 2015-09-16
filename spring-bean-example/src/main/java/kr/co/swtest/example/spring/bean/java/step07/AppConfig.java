/*******************************************************************************
 * Copyright(c) 2015 SWTEST. All rights reserved.
 * This software is the proprietary information of SWTEST.
 *******************************************************************************/
package kr.co.swtest.example.spring.bean.java.step07;

import kr.co.swtest.example.spring.bean.AndroidAppProgrammer;
import kr.co.swtest.example.spring.bean.Computer;
import kr.co.swtest.example.spring.bean.IPhoneAppProgrammer;
import kr.co.swtest.example.spring.bean.MacBookProRetina;
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

    @Bean
    public Computer macbookProRetina() {
        return new MacBookProRetina();
    }

    /** 빈 프로퍼티에 주입하기 */
    @Bean
    public ProjectMember androidAppProgrammer() {
        AndroidAppProgrammer programmer = new AndroidAppProgrammer();
        programmer.setAddWorkTime(3);
        programmer.setComputer(macbookProRetina());
        return programmer;
    }

    /** 빈 프로퍼티에 주입하기(내부 빈 주입) */
    @Bean
    public ProjectMember androidAppProgrammer2() {
        AndroidAppProgrammer programmer = new AndroidAppProgrammer();
        programmer.setAddWorkTime(3);
        programmer.setComputer(new MacBookProRetina());
        return programmer;
    }

    /** 생성자를 통한 내부 빈 주입하기 */
    @Bean
    public ProjectMember iPhoneAppProgrammer() {
        return new IPhoneAppProgrammer(10, new MacBookProRetina());
    }

}
