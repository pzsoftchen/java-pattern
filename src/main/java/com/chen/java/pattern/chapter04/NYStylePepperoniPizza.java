package com.chen.java.pattern.chapter04;

import java.util.ArrayList;
import java.util.List;

/**
 * NYStylePepperoniPizza
 *
 * @author Chenpz
 * @package com.chen.java.pattern.chapter04
 * @date 2018/1/16/20:16
 */
public class NYStylePepperoniPizza extends AbstractPizza {


    public NYStylePepperoniPizza(){
        super("NY Style Pepperoni Pizza","Thin Crust Dough", "Marinara Sauce");
        List<String> toppings = new ArrayList<>();
        toppings.add("Grated Reggiano Pepperoni");
        setToppings(toppings);
    }

}
