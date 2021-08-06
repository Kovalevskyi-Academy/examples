package examples.records.recordFoos;

import examples.records.Eat;
import examples.records.Primates;
import java.time.LocalDate;
import java.util.Objects;

public record HumanRecord(String name,
                          String surname,
                          LocalDate born,
                          String personalVoice,
                          boolean isViripotent,
                          boolean isCrazy,
                          int children,
                          Eat... favoriteEat) implements Primates {

  public static int number = 1;

  public HumanRecord {
    Objects.requireNonNull(name);
    Objects.requireNonNull(surname);
    Objects.requireNonNull(born);
  }

  public HumanRecord() {
    this("DefaultName",
        "DefaultSurname",
        LocalDate.of(12, 12, 12),
        "trololo",
        false,
        false,
        0,
        Eat.worms, Eat.orange, Eat.banana);
  }

}
