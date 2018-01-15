package com.chen.java.pattern.chapter03.decorator;

import com.chen.java.pattern.chapter03.component.AbstractBeverage;

/**
 * TallSizeDecorator
 *
 * @author Chenpz
 * @package com.chen.java.pattern.chapter03.decorator
 * @date 2018/1/15/17:25
 */
public class TallSizeDecorator extends AbstractCondiment {

    private AbstractBeverage abstractBeverage;

    public TallSizeDecorator(AbstractBeverage abstractBeverage){
        this.abstractBeverage = abstractBeverage;
    }

    @Override
    public String getDescription() {
        return abstractBeverage.getDescription() + ", tall size";
    }

    @Override
    public double cost() {
        return abstractBeverage.cost() + 0.10d;
    }
}
