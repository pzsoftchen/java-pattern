package com.chen.java.pattern.chapter01;

import com.chen.java.pattern.chapter01.behavior.fly.FlyBehavior;
import com.chen.java.pattern.chapter01.behavior.fly.impl.FlyNoWay;
import com.chen.java.pattern.chapter01.behavior.fly.impl.FlyWithWings;
import com.chen.java.pattern.chapter01.behavior.quack.QuackBehavior;
import com.chen.java.pattern.chapter01.behavior.quack.impl.MuteQuack;
import com.chen.java.pattern.chapter01.behavior.quack.impl.Quack;
import com.chen.java.pattern.chapter01.behavior.quack.impl.Squeak;

/**
 * DuckMain
 *
 * @author Chenpz
 * @package com.chen.java.pattern.chapter01
 * @date 2017/11/12/22:07
 */
public class MainTest {


    public static void main(String[] args) {

        FlyBehavior flyBehavior = new FlyWithWings();
        QuackBehavior quackBehavior = new Quack();

        Duck duck = new GreenDuck(flyBehavior, quackBehavior);
        duck.performQuack();
        duck.performFly();
        duck.display();

        System.out.println("========================");

        quackBehavior = new Squeak();
        duck = new RedDuck(flyBehavior, quackBehavior);
        duck.performQuack();
        duck.performFly();
        duck.display();

        System.out.println("========================");

        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
        duck = new ModelDuck(flyBehavior, quackBehavior);
        duck.performQuack();
        duck.performFly();
        duck.display();

    }


}
