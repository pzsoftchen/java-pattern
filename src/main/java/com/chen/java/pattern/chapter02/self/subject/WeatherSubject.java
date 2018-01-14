package com.chen.java.pattern.chapter02.self.subject;

import com.chen.java.pattern.chapter02.self.MessageData;
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
        for (Observer observer: observers){
            observer.notified(messageData);
        }
    }

    public void weatherChanged(MessageData messageData){
        this.messageData = messageData;
        notifyObservers();
    }

}
