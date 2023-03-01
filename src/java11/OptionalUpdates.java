package java11;

import java.util.Optional;

public class OptionalUpdates {
    public static void main(String[] args) {
        Optional<String> str = Optional.empty();
        System.out.println(str.isEmpty()); // Java 11 - az isPresent helyett lehet egyból használni az isEmpty-t és nem kell dupla vizsgálat
        System.out.println(str.isPresent());

    }
}
