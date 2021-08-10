package examples.switches;

import java.util.Random;

public class SwitchStatementAndLambda {

  public static void main(String[] args) {
    var number = 10;
    Teletubbies oneTeletuber =
        Teletubbies.values()[new Random().nextInt(Teletubbies.values().length)];
    switch (oneTeletuber) {
      case Po -> {
        number += 100;
        printer(oneTeletuber);
      }
      /*case Dipsy:
        System.out.println(Teletubbies.Dipsy);
        break;*/
      case Laa_Laa -> printer(oneTeletuber);
      case Tinky_Winky -> printer(oneTeletuber);
      default -> throw new RuntimeException("Unexpected Teletuber");
    }
    System.out.println(number);
  }


  public static void printer(Teletubbies oneTeletuber) {
    System.out.printf("The name of %s have %d symbols.",
        oneTeletuber,
        oneTeletuber.toString().length());

  }

}
