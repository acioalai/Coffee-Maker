package com.cioalai.coffeemaker.M4;

import com.cioalai.coffeemaker.CoffeeMakerAPI;
import com.cioalai.coffeemaker.WarmerPlate;

/**
 * Created by Alex on 12/19/2016.
 */
public class M4WarmerPlate extends WarmerPlate {

    public M4WarmerPlate(CoffeeMakerAPI coffeeMakerAPI) {
        super(coffeeMakerAPI);
    }

    public void update(int status) {
        if (status == CoffeeMakerAPI.POT_NOT_EMPTY) {
            api.setWarmerState(CoffeeMakerAPI.WARMER_ON);
            System.out.println("The Warmer Plate is now ON because POT_NOT_EMPTY");
        }
        else if (status == CoffeeMakerAPI.POT_EMPTY) {
            api.setWarmerState(CoffeeMakerAPI.WARMER_OFF);
            System.out.println("The Warmer Plate is now OFF because POT_EMPTY");
        }
    }

    @Override
    public String toString() {
        return "M4WarmerPlate";
    }
}
