package com.chen.java.pattern.chapter03.component;

/**
 * Espesso
 * 浓缩咖啡
 * @author Chenpz
 * @package com.chen.java.pattern.chapter03.component
 * @date 2018/1/15/16:50
 */
public class Espresso extends AbstractBeverage {

    public Espresso(){
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.00d;
    }
}
