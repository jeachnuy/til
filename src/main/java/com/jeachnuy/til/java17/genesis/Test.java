package com.jeachnuy.til.java17.genesis;

import java.util.Locale;

public class Test {
    public static void main(String[] args) {
        var maxIntensity = 1.0;
        var colorName = "black";

        System.out.println(maxIntensity);
        System.out.println(colorName);

        System.out.println("the value of colorName is " + colorName);

        long longValue = 1_000_000_000_000L;
        int intValue = (int) longValue;
        System.out.println(intValue);

        var multilineText = """
            This is
            a multilines string
            indented by two spaces
        """;
        System.out.println(multilineText);

        System.out.println("hello".length());

        System.out.println("hello".toUpperCase(Locale.KOREAN));
        System.out.println("hello".toLowerCase(Locale.JAPANESE));

        System.out.println(""+ 4 + 5);

        System.out.println(new int[] {42}.equals(new int[] {42}));

        var resultAsInt = java.lang.Integer.parseInt("42");
        System.out.println(resultAsInt);
    }
}
