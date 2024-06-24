package com.Functional;
import java.util.*;
import java.util.function.Predicate;

//Represents a predicate (boolean-valued function) of one argument.
public class _Predicate {

    public static void main(String[] args) {

        //Default way
        System.out.println(isph_no_valid("0900000000"));
        System.out.println(isph_no_valid("090000"));
        System.out.println(is_phno_valid_predicate.test("0900000000") + " :Predicate ");
        System.out.println(is_phno_valid_predicate.test("090000")+ " :Predicate ");
        System.out.println(is_phno_valid_predicate.and(contain_3).test("0900003000"));

    }

    static Predicate<String> is_phno_valid_predicate =  ph_no ->
            ph_no.startsWith("09")&&ph_no.length() ==10;
    static Predicate<String> contain_3 = ph_no ->
            ph_no.contains("3");
    static boolean isph_no_valid(String number){

        return number.startsWith("09")&&number.length() ==10;
    }
}
