package examples.records;

import examples.records.foos.HumanRecordWithBuilder;
import java.time.LocalDate;

public class UsageHumanRecordWithBuilder {

  public static void main(String[] args) {
    HumanRecordWithBuilder aliveHumanRecord =
        new HumanRecordWithBuilder.Builder()
        .favoriteEat(Eat.banana)
        .name("Paramon")
        .surname("Smith")
        .born(LocalDate.of(1954, 1, 1))
        .crazy(false)
        .viripotent(true)
        .children(50)
        .build();
    System.out.println(aliveHumanRecord);
  }

}
