package java10;

import java.util.List;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {
        List<Integer> list = List.of(15, 20, 17, 30);
        List<Integer> newList = list.stream().filter(i -> i % 3 == 0).collect(Collectors.toUnmodifiableList()); //Java 10
        newList.add(40); // És itt nincs hibajelzés de szétszáll az egész

    }
}
