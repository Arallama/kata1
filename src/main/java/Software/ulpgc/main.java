package Software.ulpgc;

import java.time.LocalDate;

public class main {
    static void main() {
        Person person = new Person("Aray", LocalDate.of(2005, 7, 27));
        System.out.println(person.age());
    }
}
