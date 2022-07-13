package com.jeachnuy.til.toby.chapter01;

import java.util.Arrays;

public class Dispatch {
    static abstract class Service {
        abstract void run();
    }
    static class MyService1 extends Service {
        @Override
        void run() {
            System.out.println("run1");
        }
    }

    static class MyService2 extends Service {
        @Override
        void run() {
            System.out.println("run2");
        }
    }

    public static void main(String[] args) {
        var svc = new MyService1();
        svc.run(); //receiver parameter

        var svc2 = new MyService2();
        svc2.run();

        var svcc = Arrays.asList(new MyService1(), new MyService2());
        svcc.forEach(Service::run);
    }
}
