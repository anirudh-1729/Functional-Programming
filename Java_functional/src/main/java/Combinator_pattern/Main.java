package Combinator_pattern;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Customer cust_1 =
                new Customer("Alex",
                        "Alexgmail.com",
                        "0999123456",
                        LocalDate.of(2000,01,12) );


        System.out.println(new CustomerValidatorService().isValid_cust(cust_1));
    }



}
