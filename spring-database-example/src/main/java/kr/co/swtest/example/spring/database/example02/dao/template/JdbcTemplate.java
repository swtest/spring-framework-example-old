/*******************************************************************************
 * Copyright(c) 2012 SWTEST. All rights reserved.
 * This software is the proprietary information of SWTEST.
 *******************************************************************************/
package kr.co.swtest.example.spring.database.example02.dao.template;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import kr.co.swtest.example.spring.database.example02.dao.mapper.JdbcTemplateResultMapper;

/**
 * JDBC 템플릿 <br/>
 * JDBC 코드에서 반복되는 DB Connection, Transaction, 자원반환, 예외처리에 대한 코드를 처리하기 위한 클래스.
 *
 * @author <a href="mailto:scroogy@swtest.co.kr">최영목</a>
 * @since 2012. 6. 14.
 */
public class JdbcTemplate {

    /** Connection */
    private Connection connection;

    /** PreparedStatement */
    private PreparedStatement preparedStatement;

    /** ResultSet */
    private ResultSet resultSet;

    // -------------------------------------------------------------------------
    // Public Method
    // -------------------------------------------------------------------------

    /**
     * 쿼리실행 (select, 단건조회)
     *
     * @param mapper 객체매핑매퍼
     * @param sql 쿼리(preparedStatement 용도)
     * @param params preparedStatement에 들어갈 파라미터값 목록
     * @return 결과값. 없을 경우 <code>null</code>을 리턴한다.
     */
    protected final <T> T getSingleResult(JdbcTemplateResultMapper<T> mapper, String sql, Object... params) {
        try {
            this.connection = createConnection();
            this.preparedStatement = this.connection.prepareStatement(sql);

            int parameterIndex = 1;
            for (Object param : params) {
                this.preparedStatement.setObject(parameterIndex++, param);
            }

            this.resultSet = this.preparedStatement.executeQuery();

            T t = null;
            if (resultSet.next()) {
                t = mapper.mapping(this.resultSet);
            }
            return t;
        } catch (Exception e) {
            // 예외처리 필요
            throw new RuntimeException(e);
        } finally {
            close();
        }
    }

    /**
     * 쿼리실행 (select, 단건조회)
     *
     * @param mapper 객체매핑매퍼
     * @param sql 쿼리(preparedStatement 용도)
     * @param params preparedStatement에 들어갈 파라미터값 목록
     * @return 결과값. 없을 경우 빈목록을 리턴한다.
     */
    protected final <T> List<T> getResults(JdbcTemplateResultMapper<T> mapper, String sql, Object... params) {
        try {
            this.connection = createConnection();
            this.preparedStatement = this.connection.prepareStatement(sql);

            int parameterIndex = 1;
            for (Object param : params) {
                this.preparedStatement.setObject(parameterIndex++, param);
            }

            this.resultSet = this.preparedStatement.executeQuery();

            List<T> results = new ArrayList<T>();
            while (resultSet.next()) {
                T t = mapper.mapping(this.resultSet);
                results.add(t);
            }
            return results;
        } catch (Exception e) {
            // 예외처리 필요
            throw new RuntimeException(e);
        } finally {
            close();
        }
    }

    /**
     * 쿼리실행 (insert, update, delete)
     *
     * @param sql 쿼리(preparedStatement 용도)
     * @param params preparedStatement에 들어갈 파라미터값 목록
     */
    protected final void executeUpdate(String sql, Object... params) {
        try {
            this.connection = createConnection();
            this.preparedStatement = this.connection.prepareStatement(sql);

            int parameterIndex = 1;
            for (Object param : params) {
                this.preparedStatement.setObject(parameterIndex++, param);
            }

            this.preparedStatement.executeUpdate();
        } catch (Exception e) {
            // 예외처리 필요
        } finally {
            close();
        }
    }

    /**
     * autoCommit 설정
     * @param autoCommit 오토커밋여부
     */
    protected final void setAutoCommit(boolean autoCommit) {
        try {
            this.connection.setAutoCommit(autoCommit);
        } catch (SQLException e) {
            // 예외처리 필요
        }
    }

    /**
     * commit
     */
    protected final void commit() {
        try {
            this.connection.commit();
        } catch (SQLException e) {
            // 예외처리 필요
        }
    }

    /**
     * rollback
     */
    protected final void rollback() {
        try {
            this.connection.rollback();
        } catch (SQLException e) {
            // 예외처리 필요
        }
    }

    // -------------------------------------------------------------------------
    // Private Method
    // -------------------------------------------------------------------------

    /**
     * connection 생성
     *
     * @return connection
     */
    private Connection createConnection() throws ClassNotFoundException, SQLException {
        Class.forName("org.hsqldb.jdbcDriver");
        return DriverManager.getConnection("jdbc:hsqldb:mem:test", "SA", "");
    }

    /**
     * close
     */
    private void close() {
        closeResultSet();
        closePreparedStatement();
        closeConnection();
    }

    /**
     * ResultSet close
     */
    private void closeResultSet() {
        if (this.resultSet == null) return;

        try {
            this.resultSet.close();
        } catch (SQLException e) {
            // 예외처리 필요
        } finally {
            this.resultSet = null;
        }
    }

    /**
     * PreparedStatement close
     */
    private void closePreparedStatement() {
        if (this.preparedStatement == null) return;

        try {
            this.preparedStatement.close();
        } catch (SQLException e) {
            // 예외처리 필요
        } finally {
            this.preparedStatement = null;
        }
    }

    /**
     * Connection close
     */
    private void closeConnection() {
        if (this.connection == null) return;

        try {
            this.connection.close();
        } catch (SQLException e) {
            // 예외처리 필요
        } finally {
            this.connection = null;
        }
    }

}
