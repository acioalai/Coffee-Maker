package com.cioalai.coffeemaker;

/**
 * Created by Alexandru on 20-Dec-16.
 */
public interface BoilerObserver {
    void update(BoilerObserver observer, int status);
}
