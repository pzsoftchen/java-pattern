package com.chen.java.pattern.chapter01.behavior.fly.impl;

import com.chen.java.pattern.chapter01.behavior.fly.FlyBehavior;

/**
 * FlyNoWay
 *
 * @author Chenpz
 * @package com.chen.java.pattern.chapter01.behavior
 * @date 2017/11/7/23:03
 */
public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I can't fly");
    }

}
