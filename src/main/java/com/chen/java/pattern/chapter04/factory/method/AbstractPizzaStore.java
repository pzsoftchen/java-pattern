package com.chen.java.pattern.chapter04.factory.method;

import com.chen.java.pattern.chapter04.AbstractPizza;
import com.chen.java.pattern.chapter04.PizzaTypeEnum;

/**
 * AbstractPizzaStore
 *
 * @author Chenpz
 * @package com.chen.java.pattern.chapter04.factory.method
 * @date 2018/1/16/20:24
 */
public abstract class AbstractPizzaStore {

    public AbstractPizza orderPizza(PizzaTypeEnum type){
        AbstractPizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    /**
     *
     * @param type
     * @return
     */
   public abstract AbstractPizza createPizza(PizzaTypeEnum type);

}
