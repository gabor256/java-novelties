package java10;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class VarDemo {

    // var nem használható osztály szintjén
    public static void main(String[] args) {
        var x = 10;

        // Java 10 - Komplex változókhoz jó a var, főleg pl. egy ciklus belsejében
        Map<String, List<String>> map = new HashMap<String, List<String>>();
        var map2 = new HashMap<String, List<String>>();
        for (Map.Entry<String, List<String>> entry:map.entrySet()) {

        }
        for (var entry:map.entrySet()) {
            var value = entry.getValue();

        }

        // Ezt sem lehet használni mert nem ismeri fel a compiler
        // var m = null;

        // Itt nem lehet használni a var-t a lambda miatt
        Consumer<Integer> l = (i) -> {
            System.out.println(i);
        };

    }
}
