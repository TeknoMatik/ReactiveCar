package com.rustam.car;

import com.rustam.car.components.usual.Engine;
import com.rustam.car.components.usual.Filter;
import com.rustam.car.components.usual.broken.BadFuelInjector;

import static com.rustam.car.components.dashboard.SystemMonitor.engineMessages;

public class Car {
    public static void main(String[] args) throws InterruptedException {
        Engine.startUp()
                .producePowerFrom(Filter.filteredFuel(BadFuelInjector.getFuel().repeat(10)))
                .flatMap(engineMessages())
                .subscribe(
                        System.out::println,
                        throwable -> System.out.println(throwable.getMessage())
                );
    }
}