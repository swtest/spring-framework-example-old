/*******************************************************************************
 * Copyright(c) 2012 SWTEST. All rights reserved.
 * This software is the proprietary information of SWTEST.
 *******************************************************************************/
package kr.co.swtest.example.spring.bean.no1;

/**
 * 프로그래머
 *
 * @author <a href="mailto:scroogy@swtest.co.kr">최영목</a>
 * @since 2012. 6. 12.
 */
public class Programmer implements ProjectMember {

    /** 작업시간 */
    private int workTime = 8;

    /**
     * 기본 생성
     */
    public Programmer() {
    }

    /**
     * 생성자
     *
     * @param workTime 작업시
     */
    public Programmer(int workTime) {
        this.workTime = workTime;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void work() {
        System.out.println(this.workTime + "시간 프로그래밍 작업을 합니다.");
    }

}
