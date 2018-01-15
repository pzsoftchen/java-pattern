package com.chen.java.pattern.chapter03.decorator;

import com.chen.java.pattern.chapter03.component.AbstractBeverage;

/**
 * WhipDecorator
 *
 * @author Chenpz
 * @package com.chen.java.pattern.chapter03.decorator
 * @date 2018/1/15/17:03
 */
public class WhipDecorator extends AbstractCondiment {

    private AbstractBeverage abstractBeverage;

    public WhipDecorator(AbstractBeverage abstractBeverage){
        this.abstractBeverage = abstractBeverage;
    }

    @Override
    public String getDescription() {
        return abstractBeverage.getDescription()+" , Whip";
    }

    @Override
    public double cost() {
        return abstractBeverage.cost() + 0.8d;
    }
}
