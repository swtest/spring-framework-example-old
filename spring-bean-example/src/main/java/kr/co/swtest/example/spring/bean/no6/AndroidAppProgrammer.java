/*******************************************************************************
 * Copyright(c) 2012 SWTEST. All rights reserved.
 * This software is the proprietary information of SWTEST.
 *******************************************************************************/
package kr.co.swtest.example.spring.bean.no6;

import kr.co.swtest.example.spring.bean.example01.Programmer;
import kr.co.swtest.example.spring.bean.example02.Computer;

/**
 * 안드로이드 앱 프로그래머
 *
 * @author <a href="mailto:scroogy@swtest.co.kr">최영목</a>
 * @since 2012. 6. 12.
 */
public class AndroidAppProgrammer extends Programmer {

    /** 컴퓨터 */
    private Computer computer;

    /** 추가 작업시간 */
    private int addWorkTime;

    /**
     * {@inheritDoc}
     */
    @Override
    public void work() {
        super.work();
        System.out.println(this.addWorkTime + "시간 더 일을 합니다.");
        System.out.println(this.computer.name() + "으로 일을 합니다.");
    }

    /**
     * @return 컴퓨터
     */
    public Computer getComputer() {
        return computer;
    }

    /**
     * @param computer 컴퓨터
     */
    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    /**
     * @return 추가 작업시간
     */
    public int getAddWorkTime() {
        return addWorkTime;
    }

    /**
     * @param addWorkTime 추가 작업시간
     */
    public void setAddWorkTime(int addWorkTime) {
        this.addWorkTime = addWorkTime;
    }

}
