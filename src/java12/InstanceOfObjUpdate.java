package java12;

public class InstanceOfObjUpdate {
    // Preview a java 12-ben
    public static void main(String[] args) {
        Object obj = "Hello world";
        // Régi:
        if (obj instanceof String) {
            String s = (String) obj;
            // stb.
        }

        // Új: azonnal mögé lehet írni a változó nevet és nem kell az if-en belül castolni mint régen
        if (obj instanceof String s) {
            int length = s.length();
            System.out.println(length);
        }
    }
}
