package examples.optional.with.of;

import examples.optional.without.Cat;
import examples.optional.without.Helper;
import java.util.Collections;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.UUID;

public class ExampleOptionalOf {

  public static void main(String[] args) {
    Cat someCat = Helper.birthWelFilledCat();
    printCat(someCat);

    printCat(null);
    someCat = Helper.birthImmortalCatWithoutRelatives();
    printCat(someCat);

    printCat(null);
    someCat = Helper.birthCatWithOnlyUuid();
    printCat(someCat);

    printCat(null);
    someCat = Helper.birthFullNullCat();
    printCat(someCat);

  }


  private static void printCat(Cat cat) {
    //var optionalCat0 = Optional.empty();
    //var optionalCat1 = Optional.of(cat); // 100% NPE Забудьте про этот метод!
    var optionalCat = Optional.ofNullable(cat); // NO NPE

    optionalCat.ifPresentOrElse(existingCat
            -> System.out.printf(
            """
                The Cat:
                \tName: %s
                \tUUID: %s
                \tAge: %s
                \tWeight: %s
                \tRelatives: %s
                """,
            Optional.ofNullable(existingCat.name()).orElse("—"),
            Optional.ofNullable(existingCat.uuid()).orElseThrow(
                () -> new NoSuchElementException("Cat can't be without UUID. Example of UUID: "
                    + UUID.randomUUID())),
            Optional.ofNullable(existingCat.age()).orElse(Double.NaN).toString(),
            Optional.ofNullable(existingCat.weight()).orElse(Double.NaN),
            Optional.ofNullable(existingCat.relatives()).orElse(Collections.emptyList()).stream()
                .map(Cat::uuid).toList().toString()
//            Optional.ofNullable(existingCat.relatives())
//                .map(list -> list.stream().map(Cat::uuid).toList())
//                .orElse(Collections.emptyList())
        ),
        () -> System.out.println("No Cat!"));
  }

}
