package com.cioalai.coffeemaker;

/**
 * Created by Alex on 12/19/2016.
 */
public abstract class WarmerPlate implements WarmerPlateObserver{
    protected CoffeeMakerAPI api;

    public WarmerPlate(CoffeeMakerAPI coffeeMakerAPI) {
        if (coffeeMakerAPI != null) {
            api = coffeeMakerAPI;
        }
    }
}
