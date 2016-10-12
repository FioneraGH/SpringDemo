package com.fionera.test.event;

import org.springframework.context.ApplicationEvent;

/**
 * Created by fionera on 16-10-8.
 */
public class DemoEvent extends ApplicationEvent{

    private String msg;

    public DemoEvent(Object source,String msg) {
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
