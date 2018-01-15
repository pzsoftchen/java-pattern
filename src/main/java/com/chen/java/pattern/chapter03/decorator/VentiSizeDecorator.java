package com.chen.java.pattern.chapter03.decorator;

import com.chen.java.pattern.chapter03.component.AbstractBeverage;

/**
 * VentiSizeDecorator
 *
 * @author Chenpz
 * @package com.chen.java.pattern.chapter03.decorator
 * @date 2018/1/15/17:28
 */
public class VentiSizeDecorator extends AbstractCondiment {

    private AbstractBeverage abstractBeverage;

    public VentiSizeDecorator(AbstractBeverage abstractBeverage){
        this.abstractBeverage = abstractBeverage;
    }

    @Override
    public String getDescription() {
        return abstractBeverage.getDescription() +", venti size";
    }

    @Override
    public double cost() {
        return abstractBeverage.cost() + 0.2d;
    }
}
