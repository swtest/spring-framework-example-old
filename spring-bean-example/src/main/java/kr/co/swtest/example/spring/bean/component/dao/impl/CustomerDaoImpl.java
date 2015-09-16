/*******************************************************************************
 * Copyright(c) 2015 SWTEST. All rights reserved.
 * This software is the proprietary information of SWTEST.
 *******************************************************************************/
package kr.co.swtest.example.spring.bean.component.dao.impl;

import kr.co.swtest.example.spring.bean.component.dao.CustomerDao;

import org.springframework.stereotype.Repository;

/**
 * 고객 DAO 구현체
 *
 * @author <a href="mailto:scroogy@swtest.co.kr">최영목</a>
 */
@Repository
public class CustomerDaoImpl implements CustomerDao {

    /**
     * {@inheritDoc}
     */
    @Override
    public void readCustomer() {
        System.out.println("CustomerDaoImpl의 readCustomer() 호출");
    }

}
