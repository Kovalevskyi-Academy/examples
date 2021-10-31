package examples.recursion;

public class RecursionUnfoldingExample {

  private static char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
      'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

  public static void main(String[] args) {
    printArray(alphabet.length - 1);
  }

  private static void printArray(final int index) {
    System.out.println("We enter the printArray method. Index=" + index);
//    if (index < 0) {
//      return;
//    }
    printArray(index - 1);

    System.out.printf("print [%s] & return.\n", alphabet[index]);
  }
}
