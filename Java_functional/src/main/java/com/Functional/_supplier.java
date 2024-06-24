package com.Functional;
import java.util.*;
import java.util.function.Supplier;

public class _supplier {

    public static void main(String[] args) {

        System.out.println(sup_1.get());
        System.out.println(sup_2.get());

    }

    static Supplier<String> sup_1 = () -> "Hello world";
    static Supplier<List<String>> sup_2 = () -> List.of("Hello world","Hello ANirudh");
}
