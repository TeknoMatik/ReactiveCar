package com.rustam.car.components.usual;

import rx.Observable;
import rx.schedulers.Schedulers;

public class Filter {
    public static Observable<Integer> filteredFuel(Observable<Integer> fuel) {
        return fuel
                .flatMap(integer -> {
                    if (integer < 0) {
                        return Observable.error(new Throwable("Bad fuel"));
                    } else {
                        return Observable.just(integer);
                    }
                });
    }
}
