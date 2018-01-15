package com.chen.java.pattern.chapter03.decorator;

import com.chen.java.pattern.chapter03.component.AbstractBeverage;

/**
 * SoyDecorator
 *
 * @author Chenpz
 * @package com.chen.java.pattern.chapter03.decorator
 * @date 2018/1/15/17:02
 */
public class SoyDecorator extends AbstractCondiment {

    private AbstractBeverage abstractBeverage;

    public SoyDecorator(AbstractBeverage abstractBeverage){
        this.abstractBeverage = abstractBeverage;
    }


    @Override
    public String getDescription() {
        return abstractBeverage.getDescription()+" , Soy";
    }

    @Override
    public double cost() {
        return abstractBeverage.cost() + 0.7d;
    }
}
