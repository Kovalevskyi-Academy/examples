package examples.optional.with.inside;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.UUID;

public class Helper {

  public static final Cat DEFAULT_CAT = new Cat(
      Optional.of("Default Cat"),
      new UUID(0, 0),
      Optional.of(1.0),
      Optional.of(1.0),
      Optional.empty());

  public static Cat birthFullNullCat() {
    return new Cat(Optional.empty(),
        null, Optional.empty(),
        Optional.empty(),
        Optional.empty());
  }

  public static Cat birthCatWithOnlyUuid() {
    return new Cat(Optional.empty(),
        UUID.randomUUID(),
        Optional.empty(),
        Optional.empty(),
        Optional.empty());
  }

  public static Cat birthCatWithoutUuidWithoutRelatives() {
    return new Cat(Optional.of("Unaccounted Cat"),
        null,
        Optional.of(3.5),
        Optional.of(2.0),
        Optional.empty());
  }

  public static Cat birthImmortalCatWithoutRelatives() {
    return new Cat(Optional.of("Lonely Immortal Cat"),
        UUID.randomUUID(),
        Optional.of(Double.POSITIVE_INFINITY),
        Optional.of(0.0),
        Optional.empty());
  }

  public static Cat birthWelFilledCat() {
    return new Cat(Optional.of("Wel Filled Cat"),
        UUID.randomUUID(),
        Optional.of(1.5),
        Optional.of(2.1),
        Optional.of(madeCatRelatives(3)));
  }

  private static List<Cat> madeCatRelatives(int depth) {
    var intRnd = new Random();
    var relatives = new ArrayList<Cat>();
    for (int i = 0; i < intRnd.nextInt(25); i++) {
      relatives.add(new Cat(
          Optional.of("Cat" + i),
          UUID.randomUUID(),
          Optional.of(intRnd.nextDouble() + intRnd.nextInt(25)),
          Optional.of(intRnd.nextDouble() + intRnd.nextInt(25)),
          depth <= 0 ? Optional.empty() : Optional.of(madeCatRelatives(depth - 1))));
    }
    return relatives;
  }
}
