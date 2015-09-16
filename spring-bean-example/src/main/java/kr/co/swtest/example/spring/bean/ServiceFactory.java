/*******************************************************************************
 * Copyright(c) 2015 SWTEST. All rights reserved.
 * This software is the proprietary information of SWTEST.
 *******************************************************************************/
package kr.co.swtest.example.spring.bean;

/**
 * 서비스 팩토리
 *
 * @author <a href="mailto:scroogy@swtest.co.kr">최영목</a>
 */
public class ServiceFactory {

    /**
     * private 생성자
     */
    private ServiceFactory() {
        // 아무일도 하지 않음
    }

    /**
     * ServiceFactorySingletonHolder <br/>
     * 필요 시점에 초기화하는 홀더(initialization on demand holer) 기법
     *
     * @author <a href="mailto:scroogy@swtest.co.kr">최영목</a>
     */
    private static class ServiceFactorySingletonHolder {
        final static ServiceFactory INSTANCE = new ServiceFactory();
    }

    /**
     * @return ServiceFactory 인스턴스. <code>not null</code> 보장.
     */
    public static ServiceFactory getInstance() {
        return ServiceFactorySingletonHolder.INSTANCE;
    }

}
