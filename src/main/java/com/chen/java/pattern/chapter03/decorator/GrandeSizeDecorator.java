package com.chen.java.pattern.chapter03.decorator;

import com.chen.java.pattern.chapter03.component.AbstractBeverage;

/**
 * GrandeSizeDecorator
 *
 * @author Chenpz
 * @package com.chen.java.pattern.chapter03.decorator
 * @date 2018/1/15/17:26
 */
public class GrandeSizeDecorator extends AbstractCondiment {

    private AbstractBeverage abstractBeverage;

    public GrandeSizeDecorator(AbstractBeverage abstractBeverage){
        this.abstractBeverage = abstractBeverage;
    }


    @Override
    public String getDescription() {
        return abstractBeverage.getDescription() + ", grande Size";
    }

    @Override
    public double cost() {
        return abstractBeverage.cost() + 0.15d;
    }
}
