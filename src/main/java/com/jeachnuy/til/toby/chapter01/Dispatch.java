package com.jeachnuy.til.toby.chapter01;

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
        svc.run();

        var svc2 = new MyService2();
        svc2.run();
    }
}
