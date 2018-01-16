package com.chen.java.pattern.chapter04;

import java.util.ArrayList;
import java.util.List;

/**
 * NYStyleClamPizza
 *
 * @author Chenpz
 * @package com.chen.java.pattern.chapter04
 * @date 2018/1/16/20:16
 */
public class NYStyleClamPizza extends AbstractPizza {

    public NYStyleClamPizza(){
        super("NY Style Clam Pizza","Thin Crust Dough", "Marinara Sauce");
        List<String> toppings = new ArrayList<>();
        toppings.add("Grated Reggiano Clam");
        setToppings(toppings);
    }

}
