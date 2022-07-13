package com.jeachnuy.til.gof.adapter;

public interface Adapter1 {
    interface Logger {
        void log(String message);
    }

    static void sayHello(Logger logger) {
        logger.log("hello");
    }

    public static void main(String[] args) {
        Logger logger = System.out::println;
        sayHello(logger);
    }
}
