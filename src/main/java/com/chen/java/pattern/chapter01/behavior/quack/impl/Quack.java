package com.chen.java.pattern.chapter01.behavior.quack.impl;

import com.chen.java.pattern.chapter01.behavior.quack.QuackBehavior;

/**
 * Quack
 *
 * @author Chenpz
 * @package com.chen.java.pattern.chapter01.behavior
 * @date 2017/11/7/23:04
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack! Quack! Quack!");
    }
}
