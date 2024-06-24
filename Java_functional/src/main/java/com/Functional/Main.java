package com.Functional;

import java.util.ArrayList;
import java.util.*;
import java.util.stream.Collectors;

import static com.Functional.Main.Gender.FEMALE;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>(Arrays.asList(
                new Person("John", Gender.MALE),
                new Person("alex", FEMALE),
                new Person("Christie", FEMALE),
                new Person("Jake", Gender.MALE),
                new Person("Anil",Gender.MALE),
                new Person("Riya", FEMALE)));

        System.out.println("//imperative approach");
        //imperative approach
        List<Person> females = new ArrayList<>();
        for (Person person : people) {
            if (FEMALE.equals(person.gender)) {
                females.add(person);
            }
        }

        for (Person female : females) {
            System.out.println(female);
        }

        System.out.println();
        System.out.println("//Declarative approach");

        //Declarative approach
        List<Person> females2 =  people.stream()
                .filter(person -> FEMALE.equals(person.gender))
                .collect(Collectors.toList());

                females2.forEach(System.out::println);
    }

    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" + "name='" + name + '\'' + ", gender='" + gender + '\'' + '}';
        }
    }

    enum Gender {MALE, FEMALE}
}