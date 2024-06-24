package Combinator_pattern;

import java.time.LocalDate;

public class Customer {

    private  String name;
    private  String email;
    private  String ph_no;

    private  LocalDate dob;


    public Customer(String name, String email, String ph_no, LocalDate dob) {
        this.name = name;
        this.email = email;
        this.ph_no = ph_no;
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPh_no() {
        return ph_no;
    }

    public void setPh_no(String ph_no) {
        this.ph_no = ph_no;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", ph_no='" + ph_no + '\'' +
                ", dob=" + dob +
                '}';
    }

}
