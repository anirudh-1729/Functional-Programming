package Java_Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;


public class _Streams {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>(Arrays.asList(
                new Person("John", Gender.MALE),
                new Person("alex", Gender.FEMALE),
                new Person("Christie", Gender.FEMALE),
                new Person("Jake", Gender.MALE),
                new Person("Anil", Gender.MALE),
                new Person("Riya", Gender.FEMALE),
                new Person("Rafael",Gender.PREFER_NOT_TO_SAY)));

        System.out.println("//Declarative approach");

        //Declarative approach
//        Function<Person, String> personStringFunction = person -> person.name;
//        ToIntFunction<String> length = String::length;
//        IntConsumer println = x -> System.out.println(x);

        people.stream()
                .map(person -> person.name)
                .mapToInt(String::length)
                .forEach(x -> System.out.println(x));

        boolean contains_only_female = people.stream()
                .allMatch(person -> Gender.FEMALE.equals(person.gender));
        System.out.println(contains_only_female);

        boolean any_female = people.stream()
                .anyMatch(person -> Gender.FEMALE.equals(person.gender));
        System.out.println(any_female);

        boolean no_not_to_say = people.stream()
                .noneMatch(person -> Gender.PREFER_NOT_TO_SAY.equals(person.gender));

        System.out.println(no_not_to_say);

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

    enum Gender {MALE, FEMALE,PREFER_NOT_TO_SAY}
}
