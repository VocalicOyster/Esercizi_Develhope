package Develhope_Ex;

import java.time.OffsetDateTime;

public class Es_Offset3 {
    public static void main(String[] args) {
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        System.out.println(data.getYear());
        System.out.println(data.getMonth());
        System.out.println(data.getDayOfMonth());
        System.out.println(data.getDayOfWeek());
    }
}
