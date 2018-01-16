package com.chen.java.pattern.chapter04;

import java.util.ArrayList;
import java.util.List;

/**
 * NYStyleCheesePizza
 *
 * @author Chenpz
 * @package com.chen.java.pattern.chapter04
 * @date 2018/1/16/20:10
 */
public class NYStyleCheesePizza extends AbstractPizza {

    public NYStyleCheesePizza(){
        super("NY Style Sauce and Cheese Pizza","Thin Crust Dough", "Marinara Sauce");
        List<String> toppings = new ArrayList<>();
        toppings.add("Grated Reggiano Cheese");
        setToppings(toppings);
    }

}
