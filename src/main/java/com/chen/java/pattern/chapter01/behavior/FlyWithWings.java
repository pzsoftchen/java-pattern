package com.chen.java.pattern.chapter01.behavior;

/**
 * FlyWithWings
 *
 * @author Chenpz
 * @package com.chen.java.pattern.chapter01.behavior
 * @date 2017/11/7/23:03
 */
public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm fly, use wings fly!");
    }
}
