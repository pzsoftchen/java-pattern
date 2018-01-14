package com.chen.java.pattern.chapter02.self.subject;

import com.chen.java.pattern.chapter02.self.observer.Observer;

/**
 *
 * @author Administrator
 * @date 2018/1/14
 * 主题
 */
public interface Subject {

    /**
     * 观察者订阅主题
     * @param observer
     */
    void registerObserver(Observer observer);

    /**
     * 观察者取消订阅主题
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * 主题通知观察者变化信息
     */
    void notifyObservers();

}
