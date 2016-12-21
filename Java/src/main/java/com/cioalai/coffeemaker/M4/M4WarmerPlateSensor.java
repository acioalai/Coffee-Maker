package com.cioalai.coffeemaker.M4;

import com.cioalai.coffeemaker.WarmerPlateObserver;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alex on 12/19/2016.
 */
public class M4WarmerPlateSensor {
    private int warmerState;
    private List<WarmerPlateObserver> observerList;

    public M4WarmerPlateSensor() {
        observerList = new ArrayList<WarmerPlateObserver>();
    }

    public int getWarmerState() {
        return warmerState;
    }

    public void setWarmerState(int warmerState) {
        this.warmerState = warmerState;
        this.notifyAllObservers(getWarmerState());
    }

    public void addObserver(WarmerPlateObserver o) {
        if (o != null)
            observerList.add(o);
    }

    public void removeObserver(WarmerPlateObserver o) {
        if (o != null) {
            observerList.remove(observerList.indexOf(o));
        }
    }

    public void notifyAllObservers(int status) {
        for (WarmerPlateObserver observer : observerList) {
            observer.update(status);
        }
    }

    @Override
    public String toString() {
        return "M4WarmerPlateSensor";
    }
}
