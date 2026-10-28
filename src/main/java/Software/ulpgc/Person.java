package Software.ulpgc;

import java.time.LocalDate;

public record Person(String name, LocalDate birthday) {


    public int age(){
        return toYears(LocalDate.now().toEpochDay() - birthday.toEpochDay());
    }
    public static final double Days_per_year = 365.25;

    private int toYears(long days) {
        return (int) (days/ Days_per_year);
    }
}
