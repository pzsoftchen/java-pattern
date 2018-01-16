package com.chen.java.pattern.chapter04;

import java.util.ArrayList;
import java.util.List;

/**
 * ChicagoStyleCheesePizza
 *
 * @author Chenpz
 * @package com.chen.java.pattern.chapter04
 * @date 2018/1/16/20:30
 */
public class ChicagoStyleCheesePizza extends AbstractPizza {

    public ChicagoStyleCheesePizza(){
        super("Chicago Style Sauce and Cheese Pizza","Thin Crust Dough", "Marinara Sauce");
        List<String> toppings = new ArrayList<>();
        toppings.add("Grated Reggiano Cheese");
        setToppings(toppings);
    }

    @Override
    public void cut(){
        System.out.println("Chicago Style Pizza cutting the pizza into square slices");
    }
}
