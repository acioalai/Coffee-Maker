package com.cioalai.coffeemaker;

/**
 * Created by Alexandru on 21-Dec-16.
 */
public abstract class BrewButton implements BrewButtonObserver, BoilerObserver{
    protected CoffeeMakerAPI api;

    public BrewButton(CoffeeMakerAPI coffeeMakerAPI) {
        if (coffeeMakerAPI != null)
            api = coffeeMakerAPI;
    }
}
