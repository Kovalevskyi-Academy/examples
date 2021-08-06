package examples.records;

import examples.records.recordFoos.HumanRecord;
import java.time.LocalDate;

public class UsageHumanRecord {

  public static void main(String[] args) {
    HumanRecord defaultHumanRecord = new HumanRecord();
    System.out.println(defaultHumanRecord);

    HumanRecord aliveHumanRecord = new HumanRecord(
        "John",
        "Do",
        LocalDate.of(1999, 1, 1),
        "I was born at the turn of the millennium!",
        false,
        true,
        0,
        Eat.banana, Eat.orange, Eat.meet);

    System.out.println(aliveHumanRecord);
  }
}
