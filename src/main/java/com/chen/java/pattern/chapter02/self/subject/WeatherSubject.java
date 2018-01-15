package com.chen.java.pattern.chapter02.self.subject;

import com.chen.java.pattern.chapter02.MessageData;
import com.chen.java.pattern.chapter02.self.observer.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * WeatherSubject
 *
 * @author Chenpz
 * @package com.chen.java.pattern.chapter02.self.subject
 * @date 2018/1/14/21:59
 */
public class WeatherSubject implements Subject {

    private List<Observer> observers;
    private MessageData messageData;

    public WeatherSubject(){
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {

        // 使用临时变量避免并发时对同一个List即添加又查询而可能出现的异常问题
        Observer[] observerArr = new Observer[observers.size()];
        observers.toArray(observerArr);

        for (Observer observer: observerArr){
            observer.notified(messageData);
        }
    }

    public void weatherChanged(MessageData messageData){
        this.messageData = messageData;
        notifyObservers();
    }

}
