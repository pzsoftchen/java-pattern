package com.chen.java.pattern.chapter01;

import com.chen.java.pattern.chapter01.behavior.FlyWithWings;
import com.chen.java.pattern.chapter01.behavior.MuteQuack;

/**
 * GreenDuck
 *
 * @author Chenpz
 * @package com.chen.java.pattern.chapter01
 * @date 2017/11/7/23:11
 */
public class GreenDuck extends Duck {

    public GreenDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("I'am a Green head duck!");
    }
}
