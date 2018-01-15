package com.chen.java.pattern.chapter02.jdk;

import com.chen.java.pattern.chapter02.MessageData;

import java.util.Observable;

/**
 * WeatherObserverable
 *
 * @author Chenpz
 * @package com.chen.java.pattern.chapter02.jdk
 * @date 2018/1/15/15:58
 */
public class WeatherObservable extends Observable {

    private MessageData messageData;

    public void dataChanged(MessageData messageData){
        setChanged();
        this.messageData = messageData;
        notifyObservers(messageData);
    }

}
