package examples.switches;

import java.util.Random;

public class SwitchStatement {

  public static void main(String[] args) {
    var nameLength = 0;
    Teletubbies oneTeletuber =
        Teletubbies.values()[new Random().nextInt(Teletubbies.values().length)];
    // switch statement
    switch (oneTeletuber) {
      case Po:
        nameLength = Teletubbies.Po.toString().length();
        break;
      case Dipsy:
        nameLength = Teletubbies.Dipsy.toString().length();
        break;
      case Laa_Laa:
        nameLength = Teletubbies.Laa_Laa.toString().length();
        break;
      /*case Tinky_Winky:
        nameLength = Teletubbies.Tinky_Winky.toString().length();
        break;*/
      /*default:
        throw new RuntimeException("Unexpected Teletuber");*/
    }
    System.out.printf("The name of %s have %d symbols.",
        oneTeletuber,
        nameLength);

  }
}
