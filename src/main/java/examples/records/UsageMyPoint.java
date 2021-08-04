package examples.records;

import examples.records.defaultClass.MyPoint;

public class UsageMyPoint {

  public static void main(String[] args) {
    MyPoint point = new MyPoint(10, 10);
    System.out.println(point.toString());
    System.out.println("getX: " + point.x());
    System.out.println("getY: " + point.y());
  }

}
