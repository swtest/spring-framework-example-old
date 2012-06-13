/*******************************************************************************
 * Copyright(c) 2012 SWTEST. All rights reserved.
 * This software is the proprietary information of SWTEST.
 *******************************************************************************/
package kr.co.swtest.example.spring.aop.example01.service;

/**
 * 고객 서비스
 *
 * @author <a href="mailto:scroogy@swtest.co.kr">최영목</a>
 * @since 2012. 6. 13.
 */
public interface CustomerService {

    /**
     * 특정 프로세스 처리
     *
     * @param level 고객레벨
     * @return 처리결과
     */
    public boolean someProcess(int customerLevel);

}
