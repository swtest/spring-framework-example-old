/*******************************************************************************
 * Copyright(c) 2012 SWTEST. All rights reserved.
 * This software is the proprietary information of SWTEST.
 *******************************************************************************/
package kr.co.swtest.example.spring.database.example03.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import kr.co.swtest.example.spring.database.example01.dto.CustomerDto;

import org.springframework.jdbc.core.RowMapper;

/**
 * CustomerDtoMapper2 <br/>
 * SimpleJdbcTemplate 용도
 *
 * @author <a href="mailto:scroogy@swtest.co.kr">최영목</a>
 * @since 2012. 6. 14.
 */
public class CustomerDtoMapper2 implements RowMapper<CustomerDto> {

    /**
     * {@inheritDoc}
     */
    @Override
    public CustomerDto mapRow(ResultSet rs, int rowNum) throws SQLException {
        try {
            CustomerDto dto = new CustomerDto();
            dto.setId(rs.getInt("cust_id"));
            dto.setName(rs.getString("cust_nm"));
            dto.setEmail(rs.getString("cust_email"));
            return dto;
        } catch (SQLException e) {
            // 예외처리 필요
            throw new RuntimeException(e);
        }
    }

}
