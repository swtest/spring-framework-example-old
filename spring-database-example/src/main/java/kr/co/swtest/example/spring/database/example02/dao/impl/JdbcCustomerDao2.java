/*******************************************************************************
 * Copyright(c) 2012 SWTEST. All rights reserved.
 * This software is the proprietary information of SWTEST.
 *******************************************************************************/
package kr.co.swtest.example.spring.database.example02.dao.impl;

import java.util.ArrayList;
import java.util.List;

import kr.co.swtest.example.spring.database.example01.dao.CustomerDao;
import kr.co.swtest.example.spring.database.example01.dto.CustomerDto;
import kr.co.swtest.example.spring.database.example02.dao.mapper.CustomerDtoMapper;
import kr.co.swtest.example.spring.database.example02.dao.template.JdbcTemplate;

/**
 * JdbcCustomerDao2
 *
 * @author <a href="mailto:scroogy@swtest.co.kr">√÷øµ∏Ò</a>
 * @since 2012. 6. 14.
 */
public class JdbcCustomerDao2 extends JdbcTemplate implements CustomerDao {

    /**
     * {@inheritDoc}
     */
    @Override
    public void createCustomer(CustomerDto customer) {
        StringBuffer sql = new StringBuffer("insert into customer (cust_id, cust_nm, cust_email) values ?, ?, ?");
        executeUpdate(sql.toString(), customer.getId(), customer.getName(), customer.getEmail());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomerDto readCustomerById(int customerId) {
        StringBuffer sql = new StringBuffer("select cust_id, cust_nm, cust_email from customer where cust_id = ?");
        return getSingleResult(new CustomerDtoMapper(), sql.toString(), customerId);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<CustomerDto> readCustomersByCondition(CustomerDto customer) {
        StringBuffer sql = new StringBuffer("select cust_id, cust_nm, cust_email from customer where 1 = 1");
        if (customer != null && customer.getId() != null) {
            sql.append("and cust_id = ?");
        }
        if (customer != null && customer.getName() != null) {
            sql.append("and cust_nm like ?");
        }
        if (customer != null && customer.getEmail() != null) {
            sql.append("and cust_email = ?");
        }

        List<Object> params = new ArrayList<Object>();
        if (customer != null && customer.getId() != null) {
            params.add(customer.getId());
        }
        if (customer != null && customer.getName() != null) {
            params.add(customer.getName());
        }
        if (customer != null && customer.getEmail() != null) {
            params.add(customer.getEmail());
        }

        return getResults(new CustomerDtoMapper(), sql.toString(), params.toArray());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void updateCustomer(CustomerDto customer) {
        StringBuffer sql = new StringBuffer("update customer set cust_nm = ?, cust_email = ? where cust_id = ?");
        executeUpdate(sql.toString(), customer.getName(), customer.getEmail(), customer.getId());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void deleteCustomerById(int customerId) {
        StringBuffer sql = new StringBuffer("delete from customer where cust_id = ?");
        executeUpdate(sql.toString(), customerId);
    }

}
