package com.chen.java.pattern.chapter03.decorator;

import com.chen.java.pattern.chapter03.component.AbstractBeverage;

/**
 * Milk
 *
 * @author Chenpz
 * @package com.chen.java.pattern.chapter03.decorator
 * @date 2018/1/15/16:55
 */
public class MilkDecorator extends AbstractCondiment {

    private AbstractBeverage abstractBeverage;

    public MilkDecorator(AbstractBeverage abstractBeverage){
        this.abstractBeverage = abstractBeverage;
    }

    @Override
    public String getDescription() {
        return abstractBeverage.getDescription()+", Milk";
    }

    @Override
    public double cost() {
        return abstractBeverage.cost() + 0.5d;
    }
}
