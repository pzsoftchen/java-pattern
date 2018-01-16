package com.chen.java.pattern.chapter04.factory.simple;

import com.chen.java.pattern.chapter04.PizzaTypeEnum;

/**
 * MainTest
 *
 * @author Chenpz
 * @package com.chen.java.pattern.chapter04.factory.simple
 * @date 2018/1/16/20:21
 */
public class MainTest {

    public static void main(String[] args) {
        // 简单工厂
        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(simplePizzaFactory);
        pizzaStore.orderPizza(PizzaTypeEnum.CHEESE);
        System.out.println("==============================");
        pizzaStore.orderPizza(PizzaTypeEnum.CLAM);
    }

}
