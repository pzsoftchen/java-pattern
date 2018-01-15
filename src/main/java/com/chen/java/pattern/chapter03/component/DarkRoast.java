package com.chen.java.pattern.chapter03.component;

/**
 * DarkRoast
 *
 * @author Chenpz
 * @package com.chen.java.pattern.chapter03.component
 * @date 2018/1/15/16:53
 */
public class DarkRoast extends AbstractBeverage {

    public DarkRoast(){
        description = "DarkRoast";
    }

    @Override
    public double cost() {
        return 4.00d;
    }
}
