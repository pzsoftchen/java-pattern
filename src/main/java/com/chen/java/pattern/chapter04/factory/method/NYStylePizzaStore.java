package com.chen.java.pattern.chapter04.factory.method;

import com.chen.java.pattern.chapter04.*;

/**
 * NYStylePizzaStore
 *
 * @author Chenpz
 * @package com.chen.java.pattern.chapter04.factory.method
 * @date 2018/1/16/20:28
 */
public class NYStylePizzaStore extends AbstractPizzaStore {

    @Override
    public AbstractPizza createPizza(PizzaTypeEnum pizzaType) {
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
