package com.rustam.car.components.usual.broken;

import rx.Observable;

public class BadFuelInjector {
    public static Observable<Integer> getFuel() {
        return Observable.just(-10);
    }
}
