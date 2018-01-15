package com.chen.java.pattern.chapter03.decorator;

import com.chen.java.pattern.chapter03.component.AbstractBeverage;

/**
 * MockaDecorator
 *
 * @author Chenpz
 * @package com.chen.java.pattern.chapter03.decorator
 * @date 2018/1/15/17:01
 */
public class MochaDecorator extends AbstractCondiment {

    private AbstractBeverage abstractBeverage;

    public MochaDecorator(AbstractBeverage abstractBeverage){
        this.abstractBeverage = abstractBeverage;
    }

    @Override
    public String getDescription() {
        return abstractBeverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return abstractBeverage.cost() + 0.6d;
    }
}
