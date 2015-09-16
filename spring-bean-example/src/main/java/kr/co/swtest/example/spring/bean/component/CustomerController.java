/*******************************************************************************
 * Copyright(c) 2015 SWTEST. All rights reserved.
 * This software is the proprietary information of SWTEST.
 *******************************************************************************/
package kr.co.swtest.example.spring.bean.component;

import kr.co.swtest.example.spring.bean.component.service.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * 고객 컨트롤러
 *
 * @author <a href="mailto:scroogy@swtest.co.kr">최영목</a>
 */
@Controller
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    public void readCustomer() {
        this.customerService.readCustomer();
        System.out.println("CustomerController의 readCustomer() 호출");
    }

}
