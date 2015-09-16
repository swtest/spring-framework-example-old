/*******************************************************************************
 * Copyright(c) 2015 SWTEST. All rights reserved.
 * This software is the proprietary information of SWTEST.
 *******************************************************************************/
package kr.co.swtest.example.spring.bean.java.step01;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 자바 기반 설정
 *
 * @author <a href="mailto:scroogy@swtest.co.kr">최영목</a>
 * @since spring 3.0
 */
@Configuration
@Import({ AppDaoConfig.class, AppServiceConfig.class })
public class AppConfig {

}
