package examples.records;

import examples.records.defaultClass.HumanClass;
import java.time.LocalDate;

public class UsageHumanClass {

  public static void main(String[] args) {
    HumanClass defaultHumanClass = new HumanClass();
    HumanClass aliveHumanClass = new HumanClass("John",
        "Do", LocalDate.of(1999, 1, 1),
        "I was born at the turn of the millennium!",
        Eat.orange,
        false,
        true,
        0);
    System.out.println(defaultHumanClass);
    System.out.println(aliveHumanClass);
  }

}
