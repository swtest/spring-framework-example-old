/*******************************************************************************
 * Copyright(c) 2012 SWTEST. All rights reserved.
 * This software is the proprietary information of SWTEST.
 *******************************************************************************/
package kr.co.swtest.example.spring.database.example02.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import kr.co.swtest.example.spring.database.example01.dto.CustomerDto;

/**
 * CustomerDtoMapper
 *
 * @author <a href="mailto:scroogy@swtest.co.kr">최영목</a>
 * @since 2012. 6. 14.
 */
public class CustomerDtoMapper implements JdbcTemplateResultMapper<CustomerDto> {

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomerDto mapping(ResultSet resultSet) {
        try {
            CustomerDto dto = new CustomerDto();
            dto.setId(resultSet.getInt("cust_id"));
            dto.setName(resultSet.getString("cust_nm"));
            dto.setEmail(resultSet.getString("cust_email"));
            return dto;
        } catch (SQLException e) {
            // 예외처리 필요
            throw new RuntimeException(e);
        }
    }

}
