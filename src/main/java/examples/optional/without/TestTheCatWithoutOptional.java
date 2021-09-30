package examples.optional.without;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class TestTheCatWithoutOptional {

  public static void main(String[] args) {


  }

  private static Cat birthFullNullCat() {
    return new Cat(null, null, null, null, null);
  }

  private static Cat birthCatWithoutUuidWithoutRelatives() {
    return new Cat("Unaccounted Cat",
        null,
        3.5,
        2.0,
        null);
  }

  private static Cat birthImmortalCatWithoutRelatives() {
    return new Cat("Lonely Immortal Cat",
        UUID.randomUUID(),
        Double.POSITIVE_INFINITY,
        0.0,
        null);
  }

  private static Cat birthWelFilledCat() {
    return new Cat("Standard yard Cat", UUID.randomUUID(), 1.5, 2.1, madeCatRelatives());
  }

  private static List<Cat> madeCatRelatives() {
    var intRnd = new Random();
    var relatives = new ArrayList<Cat>();
    for (int i = 0; i < intRnd.nextInt(25); i++) {
      relatives.add(new Cat("Cat" + i,
          UUID.randomUUID(),
          intRnd.nextDouble() + intRnd.nextInt(25),
          intRnd.nextDouble() + intRnd.nextInt(25),
          null));
    }
    return relatives;
  }

}
