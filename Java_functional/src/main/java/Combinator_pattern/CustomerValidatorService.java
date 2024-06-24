package Combinator_pattern;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidatorService {

    public boolean isEmailValid(String email){
        return email.contains("@");
    }

    public boolean isNumberValid(String number){
        return number.startsWith("0");
    }

    public boolean isAdult(LocalDate dob){

        return Period.between(dob,LocalDate.now()).getYears() > 16;
    }

    public boolean isValid_cust(Customer cust){
        return isEmailValid(cust.getEmail())
                &&isNumberValid(cust.getPh_no())
                &&isAdult(cust.getDob());
    }
}
