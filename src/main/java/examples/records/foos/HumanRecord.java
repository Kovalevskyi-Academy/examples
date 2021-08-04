package examples.records.foos;

import examples.records.Eat;
import examples.records.Primates;
import java.time.LocalDate;
import java.util.Objects;

public record HumanRecord(String name,
                          String surname,
                          LocalDate born,
                          String personalVoice,
                          Eat favoriteEat,
                          boolean viripotent,
                          boolean crazy,
                          int children) implements Primates {
 public static int number = 1;

 public HumanRecord {
   Objects.requireNonNull(name);
   Objects.requireNonNull(surname);
   Objects.requireNonNull(born);
 }

  public HumanRecord () {
        this("DefaultName",
            "DefaultSurname",
            LocalDate.of(1, 1, 1),
            null,
            Eat.worms,
            false,
            true,
            0);
      }

}
