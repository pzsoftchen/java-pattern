package com.chen.java.pattern.chapter03.component;

/**
 * HouseBlend
 *
 * @author Chenpz
 * @package com.chen.java.pattern.chapter03.component
 * @date 2018/1/15/16:52
 */
public class HouseBlend extends AbstractBeverage {

    public HouseBlend(){
        description = "HouseBlend";
    }


    @Override
    public double cost() {
        return 2.00d;
    }
}
