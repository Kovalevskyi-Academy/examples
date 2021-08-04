package examples.records;

public interface Primates {

  default <T> void eating(T eat) {
    System.out.printf("Eating the %s%n", eat.getClass().getName());
  }

  default void makeSounds() {
    System.out.println("UUuuuuuaa uaaa UU aaa aaa...");
  }
}
