package com.rustam.car;

import com.rustam.car.components.f1.F1FuelInjector;
import com.rustam.car.components.usual.Engine;
import com.rustam.car.components.usual.Filter;
import com.rustam.car.components.usual.Transmission;
import com.rustam.car.components.usual.broken.BadFuelInjector;

public class Car4x4 {
    public static void main(String[] args) {
        Transmission.spinTheWheels(
                Engine.startUp().producePowerFrom(Filter.filteredFuel(BadFuelInjector.getFuel())),
                Engine.startUp().producePowerFrom(Filter.filteredFuel(F1FuelInjector.getFuel()))
        ).subscribe(
                System.out::println,
                throwable -> System.out.println(throwable.getMessage())
        );
    }
}
