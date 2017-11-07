package com.chen.java.pattern.chapter01;

import com.chen.java.pattern.chapter01.behavior.FlyNoWay;
import com.chen.java.pattern.chapter01.behavior.MuteQuack;

/**
 * ModelDuck
 *
 * @author Chenpz
 * @package com.chen.java.pattern.chapter01
 * @date 2017/11/7/23:12
 */
public class ModelDuck extends Duck {

    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("I'am a model duck!");
    }
}
