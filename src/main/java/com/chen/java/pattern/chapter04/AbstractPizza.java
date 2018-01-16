package com.chen.java.pattern.chapter04;

import java.util.ArrayList;
import java.util.List;

/**
 * AbstracePizza
 * pizza 类
 * @author Chenpz
 * @package com.chen.java.pattern.chapter04
 * @date 2018/1/16/19:52
 */
public abstract class AbstractPizza {

    private String name;
    private String dough;
    private String sauce;

    private List<String> toppings = new ArrayList<>();

    public AbstractPizza(){}

    public AbstractPizza(String name, String dough, String sauce){
        this.name = name;
        this.dough = dough;
        this.sauce = sauce;
    }

    public void setToppings(List<String> toppings){
        this.toppings = toppings;
    }

    public void prepare(){
        System.out.println("Preparing name: "  + name);
        System.out.println("Preparing dough: " + dough);
        System.out.println("Preparing sauce: " + sauce);
        for (String str: toppings){
            System.out.println("  " + str);
        }
    }

    public void bake(){
        System.out.println("bake for 25 minutes at 350");
    }

    public void cut(){
        System.out.println("");
    }

    public void box(){
        System.out.println("");
    }

    public String getName(){
        return name;
    }

}
