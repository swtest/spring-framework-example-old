/*******************************************************************************
 * Copyright(c) 2015 SWTEST. All rights reserved.
 * This software is the proprietary information of SWTEST.
 *******************************************************************************/
package kr.co.swtest.example.spring.bean;

/**
 * 티켓
 *
 * @author <a href="mailto:scroogy@swtest.co.kr">최영목</a>
 */
public class Ticket {

    /** 티켓아이디 */
    private int id = 1;

    /**
     * @return 티켓아이디
     */
    public int getId() {
        return id;
    }

    /**
     * @param id 티켓아이디
     */
    public void setId(int id) {
        this.id = id;
    }

}
