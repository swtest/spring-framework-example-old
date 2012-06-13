/*******************************************************************************
 * Copyright(c) 2012 SWTEST. All rights reserved.
 * This software is the proprietary information of SWTEST.
 *******************************************************************************/
package kr.co.swtest.example.spring.aop.example01.service.logic;

import kr.co.swtest.example.spring.aop.example01.service.CustomerService;
import kr.co.swtest.example.spring.aop.example01.util.AuthorityUtil;

/**
 * 고객 서비스 구현체
 *
 * @author <a href="mailto:scroogy@swtest.co.kr">최영목</a>
 * @since 2012. 6. 13.
 */
public class CustomerServiceLogic implements CustomerService {

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean someProcess(int customerLevel) {
        // 1. 권한처리
        if (!AuthorityUtil.check(customerLevel)) {
            System.out.println("권한이 없습니다.");
            return false;
        }

        // 2. 실제 프로세스 처리
        System.out.println("고객 프로세스 처리");
        return true;
    }

}
