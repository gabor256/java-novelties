package java9.immutablecollections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Demo {
    // Ezek itt mind immutable collection-ök, ez egy Java9 újítás
    public static void main(String[] args) {
        List<String> list = List.of("abc", "xyz", "123");
//        list.add("alma"); // Ez itt egy exception mert immutable a lista így generálva

        Set<String> set = Set.of("abc", "xyz"); // Ez is immutable lesz és nem lehet hozzáadni

        Map.of("key1", "v1");
        Map.ofEntries();


    }
}
