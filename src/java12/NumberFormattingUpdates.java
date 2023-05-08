package java12;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormattingUpdates {
    public static void main(String[] args) {
        NumberFormat format = NumberFormat.getCompactNumberInstance();
        System.out.println(format.format(1000));
        format = NumberFormat.getCompactNumberInstance(new Locale("hu"), NumberFormat.Style.LONG);
        System.out.println(format.format(1000));
        System.out.println(format.format(10000000));
        format = NumberFormat.getCompactNumberInstance(new Locale("hu"), NumberFormat.Style.SHORT);
        System.out.println(format.format(1000));
        System.out.println(format.format(10000000));
        format = NumberFormat.getCompactNumberInstance(Locale.UK, NumberFormat.Style.SHORT);
        System.out.println(format.format(1000));
        System.out.println(format.format(10000000));
    }
}
