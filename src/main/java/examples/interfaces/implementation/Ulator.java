package examples.interfaces.implementation;

import examples.interfaces.Calc1;
import examples.interfaces.Calc2;

public class Ulator implements Calc1, Calc2 {

  @Override
  public long sum(int a, int b) {
    return a + b;
  }

  @Override
  public long subtraction(int a, int b) {
    return (long) a - (long) b * (long) b;
  }

}
