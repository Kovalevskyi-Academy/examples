package examples.switches;

import java.util.Random;

public class SwitchExpression {

  public static void main(String[] args) {

    Teletubbies oneTeletuber =
        Teletubbies.values()[new Random().nextInt(Teletubbies.values().length)];
    var nameLength = switch (oneTeletuber) {
      case Po:
        int len = Teletubbies.Po.toString().length();
        yield len;
      case Dipsy:
        yield Teletubbies.Dipsy.toString().length();
      case Laa_Laa:
        yield Teletubbies.Laa_Laa.toString().length();
      /*case Tinky_Winky:
        yield Teletubbies.Tinky_Winky.toString().length();*/
      default:
        throw new RuntimeException("Unexpected Teletuber");
    };

    System.out.printf("The name of %s have %d symbols.", oneTeletuber, nameLength);
  }
}
