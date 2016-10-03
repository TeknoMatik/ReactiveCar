package com.rustam.car.components.usual;

import rx.Observable;

public class FuelInjector {
    public static Observable<Integer> getFuel() {
        return Observable.just(1);
    }
}
