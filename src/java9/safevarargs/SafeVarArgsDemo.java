package java9.safevarargs;

import java.util.Arrays;
import java.util.List;

public class SafeVarArgsDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("abc", "xyz");
        List<String> list2 = Arrays.asList("abc", "xyz");
        SafeVarArgsDemo safeVarArgsDemo = new SafeVarArgsDemo();
        safeVarArgsDemo.myMethod(list, list2);
    }

    @SafeVarargs
    private void myMethod(List<String>... lists) {
//        Object[] objects=lists;
//        objects[0] = Arrays.asList(1,2);
        String name = (String) lists[0].get(0);
        System.out.println(name);
    }
}
