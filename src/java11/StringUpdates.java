package java11;

import java.util.stream.Collectors;

public class StringUpdates {
    public static void main(String[] args) {
        String str = "                  ";
        System.out.println(str.isBlank()); // Java 11 feature

        str = "I\nam\nthe\ncreator of my destiny";
        System.out.println(str.lines().collect(Collectors.toList())); // Java 11 - stream of lines

        char c ='\u2000';
        str=c+str;
        System.out.println(str.trim());
        System.out.println(str.strip()); // Java 11 - a szó előtti space-eket és a szó mögötti space-eket is törli
        System.out.println(str.stripLeading()); // Java 11 - a szó előtti space-eket törli
        System.out.println(str.stripTrailing()); // Java 11 - a szó mögötti space-eket törli

        System.out.println("-".repeat(30)); // Java 11 - ismétli a karaktereket

    }
}
