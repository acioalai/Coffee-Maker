package com.cioalai.coffeemaker.M4;

import com.cioalai.coffeemaker.ReliefValveObserver;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by acioalai on 12/20/2016.
 */
public class M4reliefValveSensor {
    private int reliefValveState;
    private List<ReliefValveObserver> observerList;

    public M4reliefValveSensor() {
        observerList = new ArrayList<ReliefValveObserver>();
    }

    private int getReliefValveState() {
        return reliefValveState;
    }

    public void setReliefValveState(int status) {
        this.reliefValveState = status;
        this.notifyAllObservers(this.getReliefValveState());
    }

    public void addObserver(ReliefValveObserver o) {
        if (o != null)
            observerList.add(o);
    }

    public void removeObserver(ReliefValveObserver o) {
        if (o != null) {
            observerList.remove(observerList.indexOf(o));
        }
    }

    public void notifyAllObservers(int status) {
        for (ReliefValveObserver observer : observerList) {
            observer.update(status);
        }
    }

    @Override
    public String toString() {
        return "M4reliefValveSensor";
    }
}
