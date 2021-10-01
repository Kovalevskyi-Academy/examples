package examples.optional.without;


import java.util.NoSuchElementException;
import org.jetbrains.annotations.NotNull;

public class TestTheCatWithoutOptional2 {

  public static void main(String[] args) {
    Cat someCat = Helper.birthWelFilledCat();
    printCat(someCat);

    printCat(null);
    someCat = Helper.birthImmortalCatWithoutRelatives();
    printCat(someCat);

    //printCat(null);
    someCat = Helper.birthCatWithOnlyUuid();
    printCat(someCat);

    //printCat(null);
    someCat = Helper.birthFullNullCat();
    printCat(someCat);
  }


  private static void printCat(@NotNull Cat cat) {
    if (cat.uuid() == null) {
      throw new NoSuchElementException();
    }
    System.out.printf(
        """
            The Cat:
            \tName: %s
            \tUUID: %s
            \tAge: %s
            \tWeight: %s
            \tRelatives: %s
            """,
        // Потенциальные nullы в результате работы getters.
        cat.name() != null && !cat.name().isEmpty() ? cat.name() : "—",
        cat.uuid(),
        cat.age() != null ? cat.age() : Double.NaN,
        cat.weight() != null ? cat.weight() : Double.NaN,
        cat.relatives() != null
            ? cat.relatives().stream().map(Cat::uuid).toList().toString()
            : "[ ]");
  }


}
