package examples.switches;

import java.util.Random;

public enum Teletubbies {
  Tinky_Winky("Tinky-Winky"), Dipsy("Dipsy"), Laa_Laa("Laa Laa"), Po("Po");

  private final String name;

  Teletubbies(String name) {
    this.name = name;
  }

  public String voice() {
    var alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
    var rnd = new Random();
    char[] result = new char[5 + rnd.nextInt(alphabet.length() - 5 + 1)];
    for (int i = 0; i < result.length; i++) {
      result[i] = alphabet.charAt(rnd.nextInt(alphabet.length()));
    }
    return new String(result);
  }

  @Override
  public String toString() {
    return name;
  }

}
