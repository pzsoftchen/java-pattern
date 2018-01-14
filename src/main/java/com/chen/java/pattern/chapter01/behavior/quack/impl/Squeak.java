package com.chen.java.pattern.chapter01.behavior.quack.impl;

import com.chen.java.pattern.chapter01.behavior.quack.QuackBehavior;

/**
 * Sqeak
 *
 * @author Chenpz
 * @package com.chen.java.pattern.chapter01.behavior
 * @date 2017/11/7/23:06
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
