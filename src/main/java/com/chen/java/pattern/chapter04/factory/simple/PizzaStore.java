package com.chen.java.pattern.chapter04.factory.simple;

import com.chen.java.pattern.chapter04.AbstractPizza;
import com.chen.java.pattern.chapter04.PizzaTypeEnum;

/**
 * PizzaStore
 *
 * @author Chenpz
 * @package com.chen.java.pattern.chapter04.factory.simple
 * @date 2018/1/16/20:01
 */
public class PizzaStore {

    private SimplePizzaFactory simplePizzaFactory;

    public PizzaStore(SimplePizzaFactory simplePizzaFactory){
        this.simplePizzaFactory = simplePizzaFactory;
    }

    public AbstractPizza orderPizza(PizzaTypeEnum type){
        AbstractPizza pizza;
        pizza = simplePizzaFactory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

}
