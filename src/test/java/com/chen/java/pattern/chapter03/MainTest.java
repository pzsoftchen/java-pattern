package com.chen.java.pattern.chapter03;

import com.chen.java.pattern.chapter03.component.DarkRoast;
import com.chen.java.pattern.chapter03.component.Espresso;
import com.chen.java.pattern.chapter03.decorator.*;

/**
 * MainTest
 *
 * @author Chenpz
 * @package com.chen.java.pattern.chapter03
 * @date 2018/1/15/17:07
 */
public class MainTest {

    public static void main(String[] args) {

        Espresso espresso = new Espresso();
        MilkDecorator milkDecorator = new MilkDecorator(espresso);
        System.out.println(milkDecorator.getDescription());
        System.out.println(milkDecorator.cost());
        MochaDecorator mochaDecorator = new MochaDecorator(milkDecorator);
        System.out.println(mochaDecorator.getDescription());
        System.out.println(mochaDecorator.cost());

        AbstractCondiment abstractCondiment = new MilkDecorator(new MochaDecorator(new SoyDecorator(new WhipDecorator(new DarkRoast()))));
        System.out.println(abstractCondiment.getDescription());
        System.out.println(abstractCondiment.cost());

        abstractCondiment = new MilkDecorator(new MochaDecorator(new SoyDecorator(new WhipDecorator(new VentiSizeDecorator(new DarkRoast())))));
        System.out.println(abstractCondiment.getDescription());
        System.out.println(abstractCondiment.cost());


    }

}
