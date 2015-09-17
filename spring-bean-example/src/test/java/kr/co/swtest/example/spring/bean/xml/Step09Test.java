/*******************************************************************************
 * Copyright(c) 2015 SWTEST. All rights reserved.
 * This software is the proprietary information of SWTEST.
 *******************************************************************************/
package kr.co.swtest.example.spring.bean.xml;

import kr.co.swtest.example.spring.bean.component.CustomerController;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Spring Test
 *
 * @author <a href="mailto:scroogy@swtest.co.kr">최영목</a>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextHierarchy({ @ContextConfiguration("/xml/step08/applicationContext.xml") })
// @WebAppConfiguration
public class Step09Test {

    @Autowired
    private CustomerController customerController;

    @Test
    public void test() {
        customerController.readCustomer();
    }

}
