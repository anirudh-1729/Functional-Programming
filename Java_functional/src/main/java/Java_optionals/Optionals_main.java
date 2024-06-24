package Java_optionals;
import java.util.*;

public class Optionals_main {

    public static void main(String[] args) {

        Object val = Optional.ofNullable("Hello World")
                .orElseGet(() -> "Default value");
        System.out.println(val);

        Object val2 = Optional.ofNullable("null")
                .orElseThrow(() -> new IllegalArgumentException("exception"));
        System.out.println(val2);

        Optional.ofNullable(null)
                .ifPresentOrElse(email ->
                        System.out.println("Sending mail to " + email),
                                () -> System.out.println("Cannot send mail"));
    }
}
