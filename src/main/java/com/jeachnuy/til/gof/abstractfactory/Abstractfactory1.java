package com.jeachnuy.til.gof.abstractfactory;

public interface Abstractfactory1 {
    sealed interface Vehice permits Bus, Car {
        static Vehice create(String name) {
            return switch (name) {
                case "bus" -> new Bus("Yellow");
                case "car" -> new Car();
                default -> throw new IllegalArgumentException("unknown " + name);
            };
        };
    }

    record Bus(String color) implements Vehice {}
    record Car() implements  Vehice {}

    public static void main(String[] args) {
        var vehicle1 = Vehice.create("bus");
        System.out.println(vehicle1);
        var vehicle2 = Vehice.create("car");
        System.out.println(vehicle2);
    }
}
