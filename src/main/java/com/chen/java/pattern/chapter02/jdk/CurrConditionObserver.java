package com.chen.java.pattern.chapter02.jdk;

import com.chen.java.pattern.chapter02.DisplayStyle;
import com.chen.java.pattern.chapter02.MessageData;

import java.util.Observable;
import java.util.Observer;

/**
 * CurrConditionObserver
 *
 * @author Chenpz
 * @package com.chen.java.pattern.chapter02.jdk
 * @date 2018/1/15/16:01
 */
public class CurrConditionObserver implements Observer,DisplayStyle {

    private Observable observable;

    public CurrConditionObserver(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof MessageData) {
            display((MessageData) arg);
        }
    }

    @Override
    public void display(MessageData messageData) {
        System.out.println(messageData.toString());
    }
}
