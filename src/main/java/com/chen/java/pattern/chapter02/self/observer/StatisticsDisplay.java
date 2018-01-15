package com.chen.java.pattern.chapter02.self.observer;

import com.chen.java.pattern.chapter02.DisplayStyle;
import com.chen.java.pattern.chapter02.MessageData;
import com.chen.java.pattern.chapter02.self.subject.Subject;

/**
 * StatisticsDisplay
 *
 * @author Chenpz
 * @package com.chen.java.pattern.chapter02.self.observer
 * @date 2018/1/14/22:18
 */
public class StatisticsDisplay implements Observer, DisplayStyle {

    private Subject subject;

    public StatisticsDisplay(Subject subject){
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void display(MessageData messageData) {
        System.out.println("StatisticsDisplay display: " +messageData.toString());
    }

    @Override
    public void notified(MessageData messageData) {
        display(messageData);
    }

    @Override
    public void cancelSubject() {
        subject.removeObserver(this);
    }

    @Override
    public void registerSubject() {
        subject.registerObserver(this);
    }
}
