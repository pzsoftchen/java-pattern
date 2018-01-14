package com.chen.java.pattern.chapter01;

import com.chen.java.pattern.chapter01.behavior.fly.FlyBehavior;
import com.chen.java.pattern.chapter01.behavior.quack.QuackBehavior;

/**
 * GreenDuck
 *
 * @author Chenpz
 * @package com.chen.java.pattern.chapter01
 * @date 2017/11/7/23:11
 */
public class GreenDuck extends Duck {

    public GreenDuck(){}

    public GreenDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior){
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    @Override
    public void display() {
        System.out.println("I'am a Green head duck!");
    }
}
