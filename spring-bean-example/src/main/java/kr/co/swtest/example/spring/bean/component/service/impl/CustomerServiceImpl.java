/*******************************************************************************
 * Copyright(c) 2015 SWTEST. All rights reserved.
 * This software is the proprietary information of SWTEST.
 *******************************************************************************/
package kr.co.swtest.example.spring.bean.component.service.impl;

import kr.co.swtest.example.spring.bean.component.dao.CustomerDao;
import kr.co.swtest.example.spring.bean.component.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 고객 서비스 구현체
 *
 * @author <a href="mailto:scroogy@swtest.co.kr">최영목</a>
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDao customerDao;

    /**
     * {@inheritDoc}
     */
    @Override
    public void readCustomer() {
        this.customerDao.readCustomer();
        System.out.println("CustomerServiceImpl의 readCustomer() 호출");
    }

}
