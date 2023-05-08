package java10;

import java.util.List;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {
        List<Integer> list = List.of(15, 20, 17, 30);
        List<Integer> newList = list.stream().filter(i -> i % 3 == 0).collect(Collectors.toUnmodifiableList()); //Java 10
        System.out.println(newList);
        // newList.add(40); immutable, elszáll (Idea nem jelez hibát)

        List<Integer> copyOfList = List.copyOf(list);
        System.out.println(copyOfList);
        // copyOfList.add(4); - a második lista is immutable, itt is elszállna

    }
}
