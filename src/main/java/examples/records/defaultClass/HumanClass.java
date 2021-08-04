package examples.records.defaultClass;

import examples.records.Eat;
import examples.records.Primates;
import java.time.LocalDate;
import java.util.Objects;

public class HumanClass implements Primates {

  private final String name;
  private final String surname;
  private final LocalDate born;
  private final String personalVoice;
  private final Eat favoriteEat;
  private final boolean viripotent;
  private final boolean crazy;
  private final int children;

  public HumanClass(String name,
      String surname,
      LocalDate born,
      String personalVoice,
      Eat favoriteEat,
      boolean viripotent,
      boolean crazy,
      int children) {
    this.name = Objects.requireNonNull(name);
    this.surname = Objects.requireNonNull(surname);
    this.born = Objects.requireNonNull(born);
    this.personalVoice = personalVoice;
    this.favoriteEat = favoriteEat;
    this.viripotent = viripotent;
    this.crazy = crazy;
    this.children = children;
  }

  public HumanClass() {
    this("DefaultName", "DefaultSurname", LocalDate.of(12, 12, 12),
        "trololo", Eat.worms, false,
        false,
        0);
  }

  public String getName() {
    return name;
  }

  public String getSurname() {
    return surname;
  }

  public LocalDate getBorn() {
    return born;
  }

  public String getPersonalVoice() {
    return personalVoice;
  }

  public Eat getFavoriteEat() {
    return favoriteEat;
  }

  public boolean isViripotent() {
    return viripotent;
  }

  public boolean isCrazy() {
    return crazy;
  }

  public int getChildren() {
    return children;
  }

  @Override
  public <T> void eating(T eat) {
    Primates.super.eating(eat);
  }

  @Override
  public void makeSounds() {
    if (personalVoice != null) {
      System.out.println(personalVoice);
    }
    Primates.super.makeSounds();
  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o == null || o.getClass() != this.getClass()) {
      return false;
    }

    HumanClass income = (HumanClass) o;
    return name.equals(income.name) && surname.equals(income.surname) && born.equals(income.born);
  }

  @Override
  public String toString() {
    return "The human: ["
        + "name: " + name + ","
        + "surname: " + surname + ","
        + "was born: " + born.toString() + ","
        + "personal voice: " + personalVoice + ","
        + "favorite eat: " + favoriteEat + ","
        + "is he/she viripotent: " + viripotent + ","
        + "is he/she crazy: " + crazy + ","
        + "howe are many children: " + children + ","
        + "]";
  }

  public static final class Builder {

    private String name;
    private String surname;
    private LocalDate born;
    private String personalVoice;
    private Eat favoriteEat;
    private boolean viripotent;
    private boolean crazy;
    private int children;


    public static Builder aHumanClass() {
      return new Builder();
    }

    public Builder name(String name) {
      this.name = name;
      return this;
    }

    public Builder surname(String surname) {
      this.surname = surname;
      return this;
    }

    public Builder born(LocalDate born) {
      this.born = born;
      return this;
    }

    public Builder personalVoice(String personalVoice) {
      this.personalVoice = personalVoice;
      return this;
    }

    public Builder favoriteEat(Eat favoriteEat) {
      this.favoriteEat = favoriteEat;
      return this;
    }

    public Builder viripotent(boolean viripotent) {
      this.viripotent = viripotent;
      return this;
    }

    public Builder crazy(boolean crazy) {
      this.crazy = crazy;
      return this;
    }

    public Builder children(int children) {
      this.children = children;
      return this;
    }

    public HumanClass build() {
      return new HumanClass(name, surname, born, personalVoice, favoriteEat, viripotent,
          crazy, children);
    }
  }
}
