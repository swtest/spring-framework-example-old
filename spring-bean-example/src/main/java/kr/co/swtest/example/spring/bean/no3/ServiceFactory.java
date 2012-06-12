/*******************************************************************************
 * Copyright(c) 2012 SWTEST. All rights reserved.
 * This software is the proprietary information of SWTEST.
 *******************************************************************************/
package kr.co.swtest.example.spring.bean.no3;

/**
 * ServiceFactory
 *
 * @author <a href="mailto:scroogy@swtest.co.kr">최영목</a>
 * @since 2012. 6. 12.
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
     * @since 2012. 6. 12.
     */
    private static class ServiceFactorySingletonHolder {
        static ServiceFactory INSTANCE = new ServiceFactory();
    }

    /**
     * @return ServiceFactory 인스턴스. <code>not null</code> 보장.
     */
    public static ServiceFactory getInstance() {
        return ServiceFactorySingletonHolder.INSTANCE;
    }

}
