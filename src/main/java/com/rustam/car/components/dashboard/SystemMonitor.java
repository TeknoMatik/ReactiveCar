package com.rustam.car.components.dashboard;

import rx.Observable;
import rx.functions.Func1;

public class SystemMonitor {
    public static Func1<Integer, Observable<? extends String>> engineMessages() {
        return power -> Observable.just(String.format("Engine has: %d horse power", power));
    }
}
