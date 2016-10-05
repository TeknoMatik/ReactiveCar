package com.rustam.car.components.usual.bad;

import rx.Observable;

public class BadFuelInjector {
    public static Observable<Integer> getFuel() {
        return Observable.just(-10);
    }
}
