package com.chen.java.pattern.chapter02.self;

import com.chen.java.pattern.chapter02.MessageData;
import com.chen.java.pattern.chapter02.self.observer.CurrConditionObserver;
import com.chen.java.pattern.chapter02.self.observer.Observer;
import com.chen.java.pattern.chapter02.self.observer.StatisticsDisplay;
import com.chen.java.pattern.chapter02.self.subject.WeatherSubject;

/**
 * MainTest
 *
 * @author Chenpz
 * @package com.chen.java.pattern.chapter02.self
 * @date 2018/1/14/22:13
 */
public class MainTest {

    public static void main(String[] args) {

        WeatherSubject weatherSubject = new WeatherSubject();
        Observer currConditionObserver =  new CurrConditionObserver(weatherSubject); // 订阅主题
        Observer statisticsDisplay =  new StatisticsDisplay(weatherSubject); // 订阅主题
        weatherSubject.weatherChanged(
                MessageData.builder()
                        .humidity(80f)
                        .temperature(65f)
                        .pressure(30.4f)
                        .build());
        System.out.println("=================================");
        currConditionObserver.cancelSubject(); // 取消订阅
        weatherSubject.weatherChanged(
                MessageData.builder()
                        .humidity(85f)
                        .temperature(66f)
                        .pressure(33.4f)
                        .build());

        System.out.println("=================================");
        currConditionObserver.registerSubject(); // 重新订阅
        statisticsDisplay.cancelSubject(); // 取消订阅
        weatherSubject.weatherChanged(
                MessageData.builder()
                        .humidity(88f)
                        .temperature(68f)
                        .pressure(35.4f)
                        .build());

        System.out.println("=================================");
    }
}
