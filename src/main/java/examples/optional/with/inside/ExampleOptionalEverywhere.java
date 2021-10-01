package examples.optional.with.inside;

import java.util.Optional;
import java.util.stream.Collectors;

public class ExampleOptionalEverywhere {

  public static void main(String[] args) {
    Cat someCat = Helper.birthWelFilledCat();
    printCat(someCat);

    printCat(null);
    someCat = Helper.birthImmortalCatWithoutRelatives();
    printCat(someCat);


//    printCat(null);
//    someCat = Helper.birthFullNullCat();
//    printCat(someCat);

    printCat(null);
    someCat = Helper.birthCatWithOnlyUuid();
    printCat(someCat);

  }


  private static void printCat(Cat cat) {
    Optional.ofNullable(cat).ifPresentOrElse(
        existingCat -> System.out.printf(
            """
                The Cat:
                \tName: %s
                \tUUID: %s
                \tAge: %s
                \tWeight: %s
                \tRelatives: %s
                """,
            existingCat.name().orElse("—"),
            existingCat.uuid(),
            existingCat.age().orElse(Double.NaN).toString(),
            existingCat.weight().orElse(Double.NaN),
            existingCat.relatives()
                .stream()
                .flatMap(list -> list.stream().map(Cat::uuid))
                .collect(Collectors.toList())
        ),
        () -> System.out.println("No Cat!"));
  }
}
