package com.chen.java.pattern.chapter04.factory.method;

import com.chen.java.pattern.chapter04.AbstractPizza;
import com.chen.java.pattern.chapter04.ChicagoStyleCheesePizza;
import com.chen.java.pattern.chapter04.PizzaTypeEnum;

/**
 * ChicagoStylePizzaStore
 *
 * @author Chenpz
 * @package com.chen.java.pattern.chapter04.factory.method
 * @date 2018/1/16/20:28
 */
public class ChicagoStylePizzaStore extends AbstractPizzaStore {

    @Override
    public AbstractPizza createPizza(PizzaTypeEnum type) {
        return new ChicagoStyleCheesePizza();
    }
}
