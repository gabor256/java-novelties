package java12;

public class StringUpdates {
    public static void main(String[] args) {
        String s = "Ez egy jó hosszú string a java12 teszteléshez";
        System.out.println(s);
        System.out.println("5 karakter intent: "+s.indent(5));
        System.out.println("-4 karakter indent: "+s.indent(-4));

        s="10";
        Integer result = s.transform(Integer::parseInt);
        System.out.println(result);

        s="Alma";
        String reversed = s.transform(value -> new StringBuilder(value).reverse().toString());
        System.out.println(reversed);
    }
}
