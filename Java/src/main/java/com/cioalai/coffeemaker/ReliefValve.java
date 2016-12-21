package com.cioalai.coffeemaker;

/**
 * Created by Alex on 12/19/2016.
 */
public abstract class ReliefValve implements ReliefValveObserver, WarmerPlateObserver {
    protected CoffeeMakerAPI api;

    public ReliefValve(CoffeeMakerAPI coffeeMakerAPI) {
        if (coffeeMakerAPI != null) {
            api = coffeeMakerAPI;
        }
    }
}
