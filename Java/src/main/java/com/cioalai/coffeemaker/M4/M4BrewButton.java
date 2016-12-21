package com.cioalai.coffeemaker.M4;

import com.cioalai.coffeemaker.BoilerObserver;
import com.cioalai.coffeemaker.BrewButton;
import com.cioalai.coffeemaker.BrewButtonObserver;
import com.cioalai.coffeemaker.CoffeeMakerAPI;

/**
 * Created by Alexandru on 21-Dec-16.
 */
public class M4BrewButton extends BrewButton {
    private boolean boilerIsNotEmpty;
    private boolean weAreMakingCoffe;

    public M4BrewButton(CoffeeMakerAPI coffeeMakerAPI) {
        super(coffeeMakerAPI);
    }

    public void update(BoilerObserver observer, int status) {
        if (status == CoffeeMakerAPI.BOILER_NOT_EMPTY && weAreMakingCoffe) {
            this.boilerIsNotEmpty = true;
            api.setIndicatorState(CoffeeMakerAPI.INDICATOR_ON);
            this.weAreMakingCoffe = false;
        }
    }

    public void update(BrewButtonObserver o, int status) {
        if (status == CoffeeMakerAPI.BREW_BUTTON_PUSHED && boilerIsNotEmpty) {
            api.setIndicatorState(CoffeeMakerAPI.INDICATOR_OFF);
            this.weAreMakingCoffe = true;
        }
    }

    public boolean isBoilerIsNotEmpty() {
        return boilerIsNotEmpty;
    }

    public void setBoilerIsNotEmpty(boolean boilerIsNotEmpty) {
        this.boilerIsNotEmpty = boilerIsNotEmpty;
    }

    public boolean isWeAreMakingCoffe() {
        return weAreMakingCoffe;
    }

    public void setWeAreMakingCoffe(boolean weAreMakingCoffe) {
        this.weAreMakingCoffe = weAreMakingCoffe;
    }

    @Override
    public String toString() {
        return "M4BrewButton";
    }
}