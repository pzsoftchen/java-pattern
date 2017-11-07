package com.chen.java.pattern.chapter01;

import com.chen.java.pattern.chapter01.behavior.FlyWithWings;
import com.chen.java.pattern.chapter01.behavior.Quack;

/**
 * RedDuck
 *
 * @author Chenpz
 * @package com.chen.java.pattern.chapter01
 * @date 2017/11/7/23:08
 */
public class RedDuck extends Duck {

    public RedDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'am a Red head Duck!");
    }
}
