package com.chen.java.pattern.chapter03.decorator;

import com.chen.java.pattern.chapter03.component.AbstractBeverage;

/**
 * Condiment
 * 装饰器
 * @author Chenpz
 * @package com.chen.java.pattern.chapter03.decorator
 * @date 2018/1/15/16:47
 */
public abstract class AbstractCondiment extends AbstractBeverage {

    @Override
    public abstract String getDescription();
}
