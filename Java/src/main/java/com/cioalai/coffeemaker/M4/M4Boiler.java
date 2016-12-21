package com.cioalai.coffeemaker.M4;

import com.cioalai.coffeemaker.Boiler;
import com.cioalai.coffeemaker.BoilerObserver;
import com.cioalai.coffeemaker.BrewButtonObserver;
import com.cioalai.coffeemaker.CoffeeMakerAPI;

/**
 * Created by Alex on 12/19/2016.
 */
public class M4Boiler extends Boiler {
    private boolean boilerIsNotEmpty;

    public M4Boiler(CoffeeMakerAPI coffeeMakerAPI) {
        super(coffeeMakerAPI);
    }

    public void update(BoilerObserver observer, int status) {
        if (status == CoffeeMakerAPI.BOILER_NOT_EMPTY) {
            this.boilerIsNotEmpty = true;
        } else {
            api.setBoilerState(CoffeeMakerAPI.BOILER_OFF);
            System.out.println("The Boiler is now OFF because BOILER_EMPTY");
        }
    }

    public void update(BrewButtonObserver o, int status) {
        if (status == CoffeeMakerAPI.BREW_BUTTON_PUSHED && boilerIsNotEmpty) {
            api.setBoilerState(CoffeeMakerAPI.BOILER_ON);
            System.out.println("The Boiler is now ON");
        } else {
            api.setBoilerState(CoffeeMakerAPI.BOILER_OFF);
            System.out.println("The Boiler is now OFF");
        }
    }

    @Override
    public String toString() {
        return "M4Boiler";
    }
}