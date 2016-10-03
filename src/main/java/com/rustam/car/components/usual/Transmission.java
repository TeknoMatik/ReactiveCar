package com.rustam.car.components.usual;

import rx.Observable;


public class Transmission {
    public static Observable<String> spinTheWheels(Observable<Integer> engine1, Observable<Integer> engine2) {
        return Observable.zip(engine1, engine2, (power1, power2) -> String.format("spin wheels with %d horse powers", (power1 + power2)));
    }
}
