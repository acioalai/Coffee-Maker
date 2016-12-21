package com.cioalai.coffeemaker.M4;

import com.cioalai.coffeemaker.BrewButtonObserver;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alexandru on 21-Dec-16.
 */
public class M4BrewButtonSensor {
    private List<BrewButtonObserver> observerList;
    private int areWeMakingCoffe;

    public M4BrewButtonSensor(){
        observerList = new ArrayList<BrewButtonObserver>();
    }

    public int getAreWeMakingCoffe() {
        return areWeMakingCoffe;
    }

    public void setAreWeMakingCoffe(int areWeMakingCoffe) {
        this.areWeMakingCoffe = areWeMakingCoffe;
        notifyAllObservers(this.areWeMakingCoffe);
    }

    public void addObserver(BrewButtonObserver o) {
        if (o != null)
            observerList.add(o);
    }

    public void removeObserver(BrewButtonObserver o) {
        if (o != null) {
            observerList.remove(observerList.indexOf(o));
        }
    }

    public void notifyAllObservers(int areWeMakingCoffe) {
        for (BrewButtonObserver observer : observerList) {
            observer.update(observer, areWeMakingCoffe);
        }
    }

    @Override
    public String toString() {
        return "M4BrewButtonSensor";
    }

}
