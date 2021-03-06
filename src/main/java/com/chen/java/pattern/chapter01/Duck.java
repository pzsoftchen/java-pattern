package com.chen.java.pattern.chapter01;

import com.chen.java.pattern.chapter01.behavior.fly.FlyBehavior;
import com.chen.java.pattern.chapter01.behavior.quack.QuackBehavior;

/**
 * Duck
 *
 * @author Chenpz
 * @package com.chen.java.pattern.chapter01
 * @date 2017/11/7/22:57
 */
public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public abstract void display();

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void swim(){
        System.out.println("All duck float!");
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
