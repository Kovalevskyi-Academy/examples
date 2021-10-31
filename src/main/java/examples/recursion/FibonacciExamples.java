package examples.recursion;

import java.util.stream.Stream;

public class FibonacciExamples {

  /**
   * Calculates the Fibonacci number using loops.
   *
   * @param fibIndex the ordinal number of the required number.
   * @return Fibonacci number.
   */
  public static long fibLoops(final int fibIndex) {
    if (fibIndex < 0) {
      throw new IllegalArgumentException();
    }
    var fib1 = -1L; // number -2
    var fib2 = 1L; // number -1
    for (int n = 0; n <= fibIndex; n++) {
      var fibCurrent = fib1 + fib2;
      fib1 = fib2;
      fib2 = fibCurrent;
    }
    return fib2;
  }

  /**
   * Calculates the Fibonacci number using Stream API.
   *
   * @param fibIndex the ordinal number of the required number.
   * @return Fibonacci number.
   */
  public static long fibStreamsApi(final int fibIndex) {
    var result =
        Stream.iterate(new long[]{0, 1}, arr -> new long[]{arr[1], arr[0] + arr[1]})
            .limit(fibIndex + 1)
            .map(y -> y[0])
            .max(Long::compareTo);
    return result.orElseThrow(IllegalArgumentException::new);
  }

  /**
   * Calculates the Fibonacci number in a recursive manner.
   *
   * @param fibIndex the ordinal number of the required number.
   * @return Fibonacci number.
   */
  public static long fibRecursive(final int fibIndex) {
    if (fibIndex < 0) {
      throw new IllegalArgumentException();
    }
    if (fibIndex == 0) {
      return 0;
    }
    return fibIndex == 1 || fibIndex == 2 ? 1L
        : fibRecursive(fibIndex - 2) + fibRecursive(fibIndex - 1);
  }

}
