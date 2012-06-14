/*******************************************************************************
 * Copyright(c) 2012 SWTEST. All rights reserved.
 * This software is the proprietary information of SWTEST.
 *******************************************************************************/
package kr.co.swtest.example.spring.database.example02.dao.mapper;

import java.sql.ResultSet;

/**
 * JdbcTemplateResultMapper <br/>
 * JDBC ResultSet을 원하는 결과타입으로 변환하는 인터페이스
 *
 * @author <a href="mailto:scroogy@swtest.co.kr">최영목</a>
 * @since 2012. 6. 14.
 */
public interface JdbcTemplateResultMapper<T> {

    /**
     * ResultSet 결과를 원하는 결과타입으로 변환
     *
     * @param resultSet ResultSet
     * @return 원하는 결과타입
     */
    T mapping(ResultSet resultSet);

}
