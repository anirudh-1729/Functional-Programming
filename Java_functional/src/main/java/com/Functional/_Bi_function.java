package com.Functional;

import java.util.function.BiFunction;

//BiFunction takes 2 parameters as input and gives 1  output .
public class _Bi_function {

    public static void main(String[] args) {

        //
        System.out.println(Increment_and_mul.apply(5,5));

    }

    static BiFunction<Integer,Integer,Integer> Increment_and_mul = (num_incr,num_mul) -> (num_incr+1)*num_mul;
}
