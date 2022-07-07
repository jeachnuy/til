package com.jeachnuy.til.java17.genesis;

import java.sql.SQLOutput;

public class RecordTest {
    record Light(String color, double intensity) {}
    final record Light1(String color, double intensity) {}
//    record final Light2(String color, double intensity) {}

    public static void main(String[] args) {
        var bluLight1 = new Light("blue", 1.0);
        var bluLight2 = new Light("blue", 1.0);
        System.out.println(bluLight1);
        var redLight = new Light1("red", 2.0);
        System.out.println(redLight);
//        redLight.color("gray");
//        bluLight.color = "gray";
        System.out.println(bluLight1.color);
        System.out.println(bluLight1.toString());

        System.out.println(bluLight1.equals(bluLight2));
        System.out.println(bluLight1.hashCode());
        System.out.println(bluLight2.hashCode());

    }
}
