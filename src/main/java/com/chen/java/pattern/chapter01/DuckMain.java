package com.chen.java.pattern.chapter01;

/**
 * DuckMain
 *
 * @author Chenpz
 * @package com.chen.java.pattern.chapter01
 * @date 2017/11/12/22:07
 */
public class DuckMain {


    public static void main(String[] args) {

        Duck duck = new GreenDuck();
        duck.performQuack();
        duck.performFly();

        duck = new RedDuck();
        duck.performQuack();
        duck.performFly();

        duck = new ModelDuck();
        duck.performQuack();
        duck.performFly();

    }


}
