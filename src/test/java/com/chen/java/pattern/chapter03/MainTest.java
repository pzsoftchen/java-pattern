package com.chen.java.pattern.chapter03;

import com.chen.java.pattern.chapter03.component.DarkRoast;
import com.chen.java.pattern.chapter03.component.Espresso;
import com.chen.java.pattern.chapter03.decorator.*;
import com.chen.java.pattern.chapter03.io.LowerCaseInputStream;

import java.io.ByteArrayInputStream;

/**
 * MainTest
 *
 * @author Chenpz
 * @package com.chen.java.pattern.chapter03
 * @date 2018/1/15/17:07
 */
public class MainTest {

    public static void main(String[] args) throws Exception{

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


        LowerCaseInputStream inputStream = new LowerCaseInputStream(new ByteArrayInputStream("DAFADSREWGDFA".getBytes()));
        int a = 0;
        while ((a = inputStream.read()) > 0){
            System.out.print((char)a);
        }
        inputStream.close();
    }

}
