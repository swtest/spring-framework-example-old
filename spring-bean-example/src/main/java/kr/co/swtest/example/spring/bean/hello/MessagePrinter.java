/*******************************************************************************
 * Copyright(c) 2015 SWTEST. All rights reserved.
 * This software is the proprietary information of SWTEST.
 *******************************************************************************/
package kr.co.swtest.example.spring.bean.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 메시지 프린터
 *
 * @author <a href="mailto:scroogy@swtest.co.kr">최영목</a>
 */
@Component
public class MessagePrinter {

    private MessageService service;

    @Autowired
    public MessagePrinter(MessageService service) {
        this.service = service;
    }

    public void printMessage() {
        System.out.println(this.service.getMessage());
    }

}
