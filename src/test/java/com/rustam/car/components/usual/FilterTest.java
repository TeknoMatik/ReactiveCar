package com.rustam.car.components.usual;

import com.rustam.car.components.usual.broken.BadFuelInjector;
import org.junit.Test;
import rx.observers.TestSubscriber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class FilterTest {
    @Test
    public void test_filter_with_good_fuel() throws Exception {
        //given
        TestSubscriber<Integer> testSubscriber = new TestSubscriber<>();

        //when
        Filter.filteredFuel(FuelInjector.getFuel()).subscribe(testSubscriber);

        //then
        List<Integer> result = new ArrayList<>();
        result.add(1);

        testSubscriber.assertNoErrors();
        testSubscriber.assertReceivedOnNext(result);
    }

    @Test
    public void test_filter_with_bad_fuel() throws Exception {
        //given
        TestSubscriber<Integer> testSubscriber = new TestSubscriber<>();

        //when
        Filter.filteredFuel(BadFuelInjector.getFuel()).subscribe(testSubscriber);

        //then
        testSubscriber.assertError(Throwable.class);
        testSubscriber.assertReceivedOnNext(Collections.emptyList());
    }
}