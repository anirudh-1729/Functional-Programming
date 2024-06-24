package com.Functional;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

//Represents an operation that accepts a single input argument and returns no result.
public class _Consumer {

    public static void main(String[] args) {

        Customer rajesh = new Customer("Rajesh", 987654321);
        //default way
        greet_cust(rajesh);

        //Functional way
        greet_cust_func.accept(rajesh);

        greet_cust_funcV2.accept(rajesh,true);

    }

    static BiConsumer<Customer,Boolean> greet_cust_funcV2 = (customer,showPhNo) ->
            System.out.println("Hi " + customer.cust_name+ " , your contact number: " +
                    (showPhNo ? customer.cust_ph_no: "******")+ "  <-- BiConsumer");
    static Consumer<Customer> greet_cust_func = customer ->
            System.out.println("Hi " + customer.cust_name+" , " +
                    "your contact number: " + customer.cust_ph_no + "  <-- Funcional way");
    static void greet_cust(Customer cust){
        System.out.println("Hi " + cust.cust_name+" , your contact number: " + cust.cust_ph_no);
    }
    static class Customer{

        private final String cust_name;
        private final int cust_ph_no;

        Customer(String cust_name, int cust_ph_no){
            this.cust_name = cust_name;
            this.cust_ph_no = cust_ph_no;
        }
    }
}
