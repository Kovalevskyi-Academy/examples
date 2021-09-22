package examples.interfaces;

/**
 * An example of interface with default & static methods.
 */
public interface Calc1 {
  // java 1.0
  public static final double PI = 3.1415926535897932384626433832;

  public abstract long sum(int a, int b);
  //-------------------------

  // java 1.8
  public default long subtraction(int a, int b) {
    return (long) a - (long) b;
  }
  // java 1.8
  public default Number power(Number base, Number exponent) {
    return onlyIntToLongPower((int) base, (int) exponent);
  }

  // java 1.8
  static double circleArea(int radius) {
    return PI * (double) onlyIntToLongPower(radius, 2);
  }

  // java 9
  private static long onlyIntToLongPower(int base, int exponent) {
    var result = (long) base;
    for (int i = 1; i < exponent; i++) {
      result *= result;
    }
    return result;
  }
}
