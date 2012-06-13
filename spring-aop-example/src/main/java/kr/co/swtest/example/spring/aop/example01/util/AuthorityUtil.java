/*******************************************************************************
 * Copyright(c) 2012 SWTEST. All rights reserved.
 * This software is the proprietary information of SWTEST.
 *******************************************************************************/
package kr.co.swtest.example.spring.aop.example01.util;

/**
 * 권한 유틸
 *
 * @author <a href="mailto:scroogy@swtest.co.kr">최영목</a>
 * @since 2012. 6. 13.
 */
public class AuthorityUtil {

    /**
     * private 생성자
     */
    private AuthorityUtil() {
        // 아무일도 하지 않음
    }

    /**
     * 권한 체크 <br/>
     *
     * @param customerLevel 고객레벨
     * @return 고객레벨이 2이상이면 <code>true</code>, 아니면 <code>false</code>를 리턴한다.
     */
    public static boolean check(int customerLevel) {
        if (customerLevel < 2) return false;
        return true;
    }

}
