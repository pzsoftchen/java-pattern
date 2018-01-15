package com.chen.java.pattern.chapter03.component;

/**
 * Beverage
 * 被装饰的对象基类
 * @author Chenpz
 * @package com.chen.java.pattern.chapter03.component
 * @date 2018/1/15/16:44
 */
public abstract class AbstractBeverage {

    String  description = "Base Beverage!";

    public String getDescription(){
        return description;
    }

    public abstract double cost();

}
