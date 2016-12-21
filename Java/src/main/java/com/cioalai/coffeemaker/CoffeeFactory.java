package com.cioalai.coffeemaker;

import static org.mockito.Mockito.mock;
import com.cioalai.coffeemaker.M4.*;

/**
 * Created by Alexandru on 21-Dec-16.
 */
public class CoffeeFactory extends AbstractFactory {
    public Object getCoffeeMakerComponent(String o) {
        CoffeeMakerAPI api = mock(CoffeeMakerAPI.class);

        if (o == null)
            return null;

        if (o.equals("M4Boiler"))
            return new M4Boiler(api);

        if (o.equals("M4BoilerSensor"))
            return new M4BoilerSensor();

        if (o.equals("M4BrewButton"))
            return new M4BrewButton(api);

        if (o.equals("M4BrewButtonSensor"))
            return new M4BrewButtonSensor();

        if (o.equals("M4ReliefValve"))
            return new M4ReliefValve(api);

        if (o.equals("M4reliefValveSensor"))
            return new M4reliefValveSensor();

        if (o.equals("M4WarmerPlate"))
            return new M4WarmerPlate(api);

        if (o.equals("M4WarmerPlateSensor"))
            return new M4WarmerPlateSensor();

        return null;
    }

    public void brew(){
        M4Boiler m4Boiler = (M4Boiler) this.getCoffeeMakerComponent("M4Boiler");
        M4BoilerSensor m4BoilerSensor = (M4BoilerSensor) this.getCoffeeMakerComponent("M4BoilerSensor");
        M4BrewButton m4BrewButton = (M4BrewButton) this.getCoffeeMakerComponent("M4BrewButton");
        M4BrewButtonSensor m4BrewButtonSensor = (M4BrewButtonSensor) this.getCoffeeMakerComponent("M4BrewButtonSensor");
        M4ReliefValve m4ReliefValve = (M4ReliefValve) this.getCoffeeMakerComponent("M4ReliefValve");
        M4reliefValveSensor m4reliefValveSensor = (M4reliefValveSensor) this.getCoffeeMakerComponent("M4reliefValveSensor");
        M4WarmerPlate m4WarmerPlate = (M4WarmerPlate) this.getCoffeeMakerComponent("M4WarmerPlate");
        M4WarmerPlateSensor m4WarmerPlateSensor = (M4WarmerPlateSensor) this.getCoffeeMakerComponent("M4WarmerPlateSensor");

        m4BrewButtonSensor.addObserver(m4Boiler);
        m4BrewButtonSensor.addObserver(m4BrewButton);
        m4BoilerSensor.addObserver(m4Boiler);
        m4BoilerSensor.addObserver(m4BrewButton);
        m4WarmerPlateSensor.addObserver(m4WarmerPlate);
        m4WarmerPlateSensor.addObserver(m4ReliefValve);

        m4BrewButtonSensor.setAreWeMakingCoffe(CoffeeMakerAPI.BREW_BUTTON_PUSHED);
    }
}
