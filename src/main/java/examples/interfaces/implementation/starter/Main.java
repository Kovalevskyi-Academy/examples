package examples.interfaces.implementation.starter;

import examples.interfaces.Calc1;
import examples.interfaces.implementation.Ulator;

public class Main {

  public static void main(String[] args) {
    Calc1 instance = new Ulator();
    //System.out.println("SUM 2 + 2 = " + instance.sum(2, 2));
    //System.out.println("Subtraction: " + instance.subtraction(4, 2));
    System.out.println("POWER 2 * 2 = " + instance.power(2, 2));
    System.out.println("Circle AREA = " + Calc1.circleArea(5));
    //System.out.println("Circle AREA = " + instance.circleArea(5));
  }

}
