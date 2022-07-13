package com.jeachnuy.til.designpattern.gof.abstractfactory;

import java.util.HashMap;
import java.util.function.Supplier;

public interface Abstractfactory2 {
    interface Vehicle {}

    record Bus(String color) implements Vehicle {}

    record Car() implements Vehicle {}

    class Registry {
        private final HashMap<String, Supplier<? extends Vehicle>> map = new HashMap<>();

        public void register(String name, Supplier<? extends Vehicle> supplier) {
            map.put(name, supplier);
        }

        public Vehicle create(String name) {
            //map에 key가 없을때 value값을 넣어 준다 첫번째 key, 두번쨰 value
            return map.computeIfAbsent(name, n -> {throw new IllegalArgumentException("Unknown " + n);})
                    .get();
        }
    }

    public static void main(String[] args) {
        var registry = new Registry();

        registry.register("car", Car::new);

        var yellowBus = new Bus("yellow");
        registry.register("bus", () -> yellowBus);

        var vehicle1 = registry.create("bus");
        var vehicle2 = registry.create("car");

        System.out.println(vehicle1);
        System.out.println(vehicle2);

        System.out.println(vehicle1.hashCode());
        System.out.println(yellowBus.hashCode());
    }
}
