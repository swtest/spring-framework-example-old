/*******************************************************************************
 * Copyright(c) 2012 SWTEST. All rights reserved.
 * This software is the proprietary information of SWTEST.
 *******************************************************************************/
package kr.co.swtest.example.spring.bean.example02;

import kr.co.swtest.example.spring.bean.example01.Programmer;

/**
 * 아이폰 앱 프로그래머
 *
 * @author <a href="mailto:scroogy@swtest.co.kr">최영목</a>
 * @since 2012. 6. 12.
 */
public class IPhoneAppProgrammer extends Programmer {

    /** 컴퓨터 */
    private Computer computer;

    /**
     * 생성자
     *
     * @param computer 컴퓨터
     */
    public IPhoneAppProgrammer(Computer computer) {
        super();
        this.computer = computer;
    }

    /**
     * 생성자
     *
     * @param workTime 작업시간
     * @param computer 컴퓨터
     */
    public IPhoneAppProgrammer(int workTime, Computer computer) {
        super(workTime);
        this.computer = computer;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void work() {
        super.work();
        System.out.println(this.computer.name() + "으로 일을 합니다.");
    }

}
