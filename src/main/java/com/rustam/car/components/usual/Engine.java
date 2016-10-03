package com.rustam.car.components.usual;


import rx.Observable;

public class Engine {
    private Engine() {
    }

    public static Engine startUp() {
        return new Engine();
    }

    public Observable<Integer> producePowerFrom(Observable<Integer> injector) {
        return injector
                .flatMap(
                        fuel -> Observable.just(fuel * 10)
                );
    }
}
