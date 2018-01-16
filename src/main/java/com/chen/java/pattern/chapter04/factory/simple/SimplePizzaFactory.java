package com.chen.java.pattern.chapter04.factory.simple;

import com.chen.java.pattern.chapter04.*;

/**
 * SimplePizzaFactory
 * 简单工厂
 * @author Chenpz
 * @package com.chen.java.pattern.chapter04.factory.simple
 * @date 2018/1/16/20:02
 */
public class SimplePizzaFactory {


    public AbstractPizza createPizza(PizzaTypeEnum pizzaType){
        if (pizzaType == PizzaTypeEnum.CHEESE){
            return new NYStyleCheesePizza();
        }else if (pizzaType == PizzaTypeEnum.VEGGIE){
            return new NYStyleVeggiePizza();
        }else if (pizzaType == PizzaTypeEnum.CLAM){
            return new NYStyleClamPizza();
        }else if(pizzaType == PizzaTypeEnum.PEPPERONI){
            return new NYStylePepperoniPizza();
        }
        return  null;

    }

}
