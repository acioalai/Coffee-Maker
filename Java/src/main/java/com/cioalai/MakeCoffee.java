package com.cioalai;

import com.cioalai.coffeemaker.CoffeeFactory;
import com.cioalai.coffeemaker.CoffeeMakerAPI;
import com.cioalai.coffeemaker.M4.*;

/**
 * Created by Alexandru on 21-Dec-16.
 */
public class MakeCoffee {
    public static void main(String[] args) {
        CoffeeFactory coffeeFactory = new CoffeeFactory();
        coffeeFactory.brew();
    }
}
