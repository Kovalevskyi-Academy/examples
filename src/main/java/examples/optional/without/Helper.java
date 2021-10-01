package examples.optional.without;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class Helper {

  public static final Cat DEFAULT_CAT = new Cat("Default Cat",
      new UUID(0, 0),
      1.0,
      1.0,
      Collections.emptyList());

  public static Cat birthFullNullCat() {
    return new Cat(null, null, null, null, null);
  }

  public static Cat birthCatWithOnlyUuid() {
    return new Cat(null, UUID.randomUUID(), null, null, null);
  }

  public static Cat birthCatWithUuidWithRelatives() {
    return new Cat("Unaccounted Cat",
        UUID.randomUUID(),
        null,
        null,
        madeCatRelatives(1));
  }

  public static Cat birthImmortalCatWithoutRelatives() {
    return new Cat("Lonely Immortal Cat",
        UUID.randomUUID(),
        Double.POSITIVE_INFINITY,
        0.0,
        null);
  }

  public static Cat birthWelFilledCat() {
    return new Cat("Wel Filled Cat", UUID.randomUUID(), 1.5, 2.1, madeCatRelatives(3));
  }

  private static List<Cat> madeCatRelatives(int depth) {
    var intRnd = new Random();
    var relatives = new ArrayList<Cat>();
    for (int i = 0; i < intRnd.nextInt(25); i++) {
      relatives.add(new Cat("Cat" + i,
          UUID.randomUUID(),
          intRnd.nextDouble() + intRnd.nextInt(25),
          intRnd.nextDouble() + intRnd.nextInt(25),
          depth <= 0 ? null : madeCatRelatives(depth - 1)));
    }
    return relatives;
  }
}
