package com.jeachnuy.til.spring.reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Dispatcher {

    public static void main(String[] args) {
        var userController = new UserController();

        var methods = userController.getClass().getDeclaredMethods();
        Arrays.stream(methods)
                .map(Method::getName)
                .forEach(System.out::println);

        System.out.println("-".repeat(50));

        String[] url = {"save", "delete", "update", "find"};

        Arrays.stream(methods).forEachOrdered(method -> {
            Arrays.stream(url).filter(function -> function.equals(method.getName()))
                    .forEachOrdered(function -> {
                try {
                    method.invoke(userController);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
        });

        System.out.println("-".repeat(50));

        for (Method method:methods) {
            Annotation annotation = method.getDeclaredAnnotation(RequestMapping.class);
            var requestMapping = (RequestMapping) annotation;
            System.out.println(requestMapping.value());

            if(requestMapping.value().equals("/find")) {
                try {
                    method.invoke(userController);
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            }
        }
    }
}
