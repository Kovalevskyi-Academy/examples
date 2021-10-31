package examples.recursion;

class RecursionError {

  public static void main(String... args) {
    System.out.println("give me an StackOverflowError!");
    main(); // Exception in thread "main" java.lang.StackOverflowError +  RecursionError
  }

}
