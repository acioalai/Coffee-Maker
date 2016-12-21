package com.cioalai.coffeemaker.M4;

import com.cioalai.coffeemaker.CoffeeMakerAPI;
import com.cioalai.coffeemaker.ReliefValve;

/**
 * Created by Alex on 12/19/2016.
 */
public class M4ReliefValve extends ReliefValve {

    public M4ReliefValve(CoffeeMakerAPI coffeeMakerAPI) {
        super(coffeeMakerAPI);
    }

    public void update(int status) {
        if (status == CoffeeMakerAPI.WARMER_EMPTY) {
            api.setReliefValveState(CoffeeMakerAPI.VALVE_OPEN);
            System.out.println("The Valve is now OPEN");
        } else {
            api.setReliefValveState(CoffeeMakerAPI.VALVE_CLOSED);
            System.out.println("The Valve is now CLOSED");
        }
    }

    @Override
    public String toString() {
        return "M4ReliefValve";
    }
}
