/*******************************************************************************
 * Copyright(c) 2012 SWTEST. All rights reserved.
 * This software is the proprietary information of SWTEST.
 *******************************************************************************/
package kr.co.swtest.example.spring.aop.example01.service.logic;

import kr.co.swtest.example.spring.aop.example01.service.CustomerService;

/**
 * 고객 서비스 구현체(01)
 *
 * @author <a href="mailto:scroogy@swtest.co.kr">최영목</a>
 * @since 2012. 6. 13.
 */
public class CustomerServiceLogic01 implements CustomerService {

    /**
     * {@inheritDoc}
     */
    @Override
    public void someProcess(int customerLevel) {
        System.out.println("transaction start");

        try {
            if (customerLevel < 2) {
                throw new RuntimeException();
            }

            System.out.println("고객 프로세스 처리");
            System.out.println("commit");
        } catch (Exception e) {
            System.out.println("rollback");
        }

        System.out.println("transaction end");
    }

}
