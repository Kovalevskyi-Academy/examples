package examples.records;

import examples.records.defaultPOJO.MyPoint;

public class UsageMyPoint {

  public static void main(String[] args) {
    MyPoint point = new MyPoint(10, 10);
    System.out.println(point.toString());
    System.out.println("getX: " + point.coordinateX());
    System.out.println("getY: " + point.coordinateY());
  }

}
