package java9.streamingapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamingAPI {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,40,7,18,23,30, null);
//        System.out.println(list.stream().filter(x-> x%5==0).collect(Collectors.toList()));
        //Java 9 - ez nem megy el csak addig amíg megfelel a felvételnek, utána eldobja a többit, eredm: 10,40
        System.out.println(list.stream().takeWhile(x->x%5==0).collect(Collectors.toList()));
        //Java 9 - ez pedig eldobja addig amíg megfelel a feltételnek, eredm: 7,18,23,30
        System.out.println(list.stream().dropWhile(x->x%5==0).collect(Collectors.toList()));

        // Java 9 - eldobja a null-t
        System.out.println(list.stream().flatMap(x-> Stream.ofNullable(x)).collect(Collectors.toList()));
    }
}
