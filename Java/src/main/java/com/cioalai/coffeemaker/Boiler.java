package com.cioalai.coffeemaker;

/**
 * Created by Alex on 12/19/2016.
 */
public abstract class Boiler implements BoilerObserver, BrewButtonObserver {
    protected CoffeeMakerAPI api;

    public Boiler(CoffeeMakerAPI coffeeMakerAPI) {
        if (coffeeMakerAPI != null)
            api = coffeeMakerAPI;
    }
}