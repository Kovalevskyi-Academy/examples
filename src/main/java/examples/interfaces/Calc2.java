package examples.interfaces;

public interface Calc2 {

  public default long subtraction(int a, int b) {
    return (long) a - (long) b * (long) a;
  }

}
