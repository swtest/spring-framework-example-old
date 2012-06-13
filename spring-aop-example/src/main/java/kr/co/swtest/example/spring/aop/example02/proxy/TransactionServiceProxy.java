/*******************************************************************************
 * Copyright(c) 2012 SWTEST. All rights reserved.
 * This software is the proprietary information of SWTEST.
 *******************************************************************************/
package kr.co.swtest.example.spring.aop.example02.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 트랜잭션 서비스 프록시 <br/>
 * 서비스 호출시 트랜잭션을 관리해준다.
 *
 * @author <a href="mailto:scroogy@swtest.co.kr">최영목</a>
 * @since 2012. 6. 13.
 */
public class TransactionServiceProxy implements ServiceProxy, InvocationHandler {

    /** 서비스 호출 대상 */
    private Object targetService;

    // -------------------------------------------------------------------------
    // Constructor
    // -------------------------------------------------------------------------

    /**
     * private 생성자
     *
     * @param targetService 서비스 호출 대상
     */
    private TransactionServiceProxy(Object targetService) {
        this.targetService = targetService;
    }

    // -------------------------------------------------------------------------
    // Public Method
    // -------------------------------------------------------------------------

    /**
     * 서비스 호출 대상(targetService)의 프록시 인스턴스 생성
     *
     * @param targetService 서비스 호출 대상
     * @return 서비스 호출 대상(targetService)의 프록시 인스턴스
     */
    public static Object newInstance(Object targetService) {
        return Proxy.newProxyInstance(targetService.getClass().getClassLoader(), targetService.getClass().getInterfaces(),
                new TransactionServiceProxy(targetService));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void before() {
        System.out.println("transaction start");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void after() {
        System.out.println("transaction end");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void afterReturning() {
        System.out.println("commit");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void afterThrowing() {
        System.out.println("rollback");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();

        Object result = null;
        try {
            result = method.invoke(this.targetService, args);
            afterReturning();
        } catch (Exception e) {
            afterThrowing();
        }

        after();
        return result;
    }

}
