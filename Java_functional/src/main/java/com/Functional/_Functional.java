package com.Functional;
import java.util.*;
import java.util.function.Function;

//Function implementation from
public class _Functional {

    public static void main(String[] args) {

        //Increment func
        int num = Increment_by_one.apply(5);
        System.out.println("Increment func "+num);

        //Multiply func
        int Mul = Multiply_by_five.apply(5);
        System.out.println("Multiply func " + Mul);

        //String func
        System.out.println("Sring func");
        String str = Str_output.apply(25);
        System.out.println( str);

        //Function chaining
        //Multiply after increment
        int val = Increment_by_one.apply(Mul);
        System.out.println("Multiply after increment(Chaining) " + val);

        Function<Integer,Integer> add_then_mul = Increment_by_one.andThen(Multiply_by_five);
        System.out.println("Chaining add then multiply " + add_then_mul.apply(1));


    }

    static Function<Integer,Integer> Increment_by_one = number -> number +1;
    static Function<Integer,Integer> Multiply_by_five = value -> value*5;
    static Function<Integer,String> Str_output = value -> "Value of number is " + value;


}
