package com.mattycao.Chapter4.FactoryMethod;

/**
 * Created by caoyangkaka on 4/20/14.
 */
public class CheesePizza extends Pizza {
    public CheesePizza() {
        name = "Cheese Pizza";
        dough = "Regular Crust";
        sauce = "Marinara Pizza Sauce";
        toppings.add("Fresh Mozzarella");
        toppings.add("Parmesan");
    }
}

