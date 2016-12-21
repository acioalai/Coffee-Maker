package com.cioalai.coffeemaker.M4;

import com.cioalai.coffeemaker.BoilerObserver;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alex on 12/19/2016.
 */
public class M4BoilerSensor {
    private int boilerStatus;
    private List<BoilerObserver> observerList;

    public M4BoilerSensor(){
        observerList = new ArrayList<BoilerObserver>();
    }

    public int getBoilerStatus() {
        return boilerStatus;
    }

    public void setBoilerStatus(int status) {
        this.boilerStatus = status;
        this.notifyAllObservers(this.boilerStatus);
    }

    public void addObserver(BoilerObserver o) {
        if (o != null)
            observerList.add(o);
    }

    public void removeObserver(BoilerObserver o) {
        if (o != null) {
            observerList.remove(observerList.indexOf(o));
        }
    }

    public void notifyAllObservers(int status) {
        for (BoilerObserver observer : observerList) {
            observer.update(observer, status);
        }
    }

    @Override
    public String toString() {
        return "M4BoilerSensor";
    }
}