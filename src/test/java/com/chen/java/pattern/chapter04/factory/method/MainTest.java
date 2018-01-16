package com.chen.java.pattern.chapter04.factory.method;

import com.chen.java.pattern.chapter04.AbstractPizza;
import com.chen.java.pattern.chapter04.PizzaTypeEnum;

/**
 * MainTest
 *
 * @author Chenpz
 * @package com.chen.java.pattern.chapter04.factory.method
 * @date 2018/1/16/20:32
 */
public class MainTest {

    public static void main(String[] args) {

        AbstractPizzaStore nyStylePizzaStore = new NYStylePizzaStore();
        AbstractPizzaStore chicagoStylePizzaStore = new ChicagoStylePizzaStore();

        AbstractPizza pizza = nyStylePizzaStore.orderPizza(PizzaTypeEnum.CHEESE);
        System.out.println(pizza.getName());
        System.out.println("======================");
        AbstractPizza pizza1 = chicagoStylePizzaStore.orderPizza(PizzaTypeEnum.CHEESE);
        System.out.println(pizza1.getName());
        System.out.println("======================");
    }
}
