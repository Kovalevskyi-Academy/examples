package examples.records;

import examples.records.foos.HumanRecord;
import java.time.LocalDate;

public class UsageHumanRecord {

  public static void main(String[] args) {
    HumanRecord defaultHumanRecord = new HumanRecord();
    System.out.println(defaultHumanRecord);

    HumanRecord aliveHumanRecord = new HumanRecord("John",
        "Dou",
        LocalDate.of(1999, 1, 1),
        "I was born at the turn of the millennium!",
        Eat.orange,
        false,
        true,
        0);

    System.out.println(aliveHumanRecord);
  }
}
