package com.chen.java.pattern.chapter04;

import java.util.ArrayList;
import java.util.List;

/**
 * NYStyleVeggiePizza
 *
 * @author Chenpz
 * @package com.chen.java.pattern.chapter04
 * @date 2018/1/16/20:15
 */
public class NYStyleVeggiePizza extends AbstractPizza{

    public NYStyleVeggiePizza(){
        super("NY Style Veggie Pizza","Thin Crust Dough", "Marinara Sauce");
        List<String> toppings = new ArrayList<>();
        toppings.add("Grated Reggiano Veggie");
        setToppings(toppings);
    }

}
