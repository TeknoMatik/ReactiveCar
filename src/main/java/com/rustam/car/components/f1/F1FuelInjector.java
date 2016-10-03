package com.rustam.car.components.f1;

import rx.Observable;

public class F1FuelInjector {
    public static Observable<Integer> getFuel() {
        return Observable.just(10);
    }
}
