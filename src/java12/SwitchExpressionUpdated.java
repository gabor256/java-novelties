package java12;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class SwitchExpressionUpdated {
    public static void main(String[] args) {
        // A régi switch
        DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
        String typeOfDay = "";
        switch (dayOfWeek) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                typeOfDay = "Working Day";
                break;
            case SATURDAY:
            case SUNDAY:
                typeOfDay = "Day Off";
        }
        System.out.println(typeOfDay);

        // Az új switch
        // A lambda után {} közé akár bonyolultabb dolog is írható
        typeOfDay = switch (dayOfWeek) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> "Munkanap";
            case SATURDAY, SUNDAY -> "Hétvége";
        };
        System.out.println(typeOfDay);
    }
}
