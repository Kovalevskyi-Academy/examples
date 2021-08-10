package examples.switches;

import java.util.Random;

public class SwitchExpressionAndLambda {

  public static void main(String[] args) {
    Teletubbies oneTeletuber =
        Teletubbies.values()[new Random().nextInt(Teletubbies.values().length)];

    var nameLength = switch (oneTeletuber) {
      //case Po -> System.out.println(Teletubbies.Po);
      case Dipsy -> {
        var len = Teletubbies.Dipsy.toString().length();
        yield len + 100;
      }
      case Laa_Laa -> Teletubbies.Laa_Laa.toString().length();
      case Tinky_Winky -> Teletubbies.Tinky_Winky.toString().length();
      default -> throw new RuntimeException("Unexpected Teletuber");
    };

    System.out.printf("The name of %s have %d symbols.", oneTeletuber, nameLength);
  }


}
