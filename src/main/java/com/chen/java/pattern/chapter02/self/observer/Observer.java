package com.chen.java.pattern.chapter02.self.observer;

import com.chen.java.pattern.chapter02.self.MessageData;

/**
 *
 * @author Administrator
 * @date 2018/1/14
 * 观察者
 */
public interface Observer {

    /**
     * 被主题调用通知
     * @param messageData
     */
    void notified(MessageData messageData);

    /**
     * 取消订阅
     */
    void cancelSubject();

    /**
     * 重新订阅
     */
    void registerSubject();

}
