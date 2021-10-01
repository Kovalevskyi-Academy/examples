package examples.optional.without;


public class TestTheCatWithoutOptional1 {

  public static void main(String[] args) {
    Cat someCat = Helper.birthWelFilledCat();
    printCat(someCat);

    printCat(null);
    someCat = Helper.birthCatWithUuidWithRelatives();
    printCat(someCat);

    //printCat(null);
    someCat = Helper.birthImmortalCatWithoutRelatives();
    printCat(someCat);

    //printCat(null);
    //someCat = Helper.birthFullNullCat();
    //printCat(someCat);
  }


  private static void printCat(Cat cat) {
    System.out.printf("""
            The Cat:
            \tName: %s
            \tUUID: %s
            \tAge: %s
            \tWeight: %s
            \tRelatives: %s
            """,
        // Потенциальные nullы в результате работы getters.
        cat.name(),
        cat.uuid(),
        cat.age(),
        cat.weight(),
        cat.relatives().stream().map(Cat::uuid).toList().toString());
  }
}
