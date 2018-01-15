package com.chen.java.pattern.chapter02.jdk;

import com.chen.java.pattern.chapter02.MessageData;

/**
 * MainTest
 *
 * @author Chenpz
 * @package com.chen.java.pattern.chapter02.jdk
 * @date 2018/1/15/16:03
 */
public class MainTest {

    public static void main(String[] args) {

        WeatherObservable observable = new WeatherObservable();
        CurrConditionObserver observer = new CurrConditionObserver(observable);
        MessageData messageData = MessageData.builder()
                .humidity(11.1f)
                .pressure(100f)
                .temperature(40.5f)
                .build();
       // observable.dataChanged(messageData);
        observable.deleteObserver(observer);
        observable.dataChanged(messageData);
    }
}
