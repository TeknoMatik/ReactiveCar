package com.rustam.car.components.f1;

import rx.Observable;
import rx.schedulers.Schedulers;

public class F1Filter {
    public static Observable<Integer> filteredFuel(Observable<Integer> fuel) {
        return fuel
                .last()
                .flatMap(integer -> {
                    if (integer < 0) {
                        return Observable.error(new Throwable("Engine exploded"));
                    } else {
                        return Observable.just(integer + 5);
                    }
                });
    }
}
