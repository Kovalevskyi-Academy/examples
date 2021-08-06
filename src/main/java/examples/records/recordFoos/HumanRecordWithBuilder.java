package examples.records.recordFoos;

import examples.records.Eat;
import examples.records.Primates;
import java.time.LocalDate;

public record HumanRecordWithBuilder (String name,
                                      String surname,
                                      LocalDate born,
                                      String personalVoice,
                                      Eat favoriteEat,
                                      boolean viripotent,
                                      boolean crazy,
                                      int children) implements Primates {


  public static final class Builder {

    private String name = "DefaultName";
    private String surname = "DefaultSurname";
    private LocalDate born = LocalDate.of(1, 1, 1);
    private String personalVoice;
    private Eat favoriteEat = Eat.worms;
    private boolean viripotent = false;
    private boolean crazy = true;
    private int children = 0;

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
      if (children < 0) {
        throw new IllegalArgumentException("Children's count can't be < 0!");
      }
      this.children = children;
      return this;
    }

    public HumanRecordWithBuilder build() {
      return new HumanRecordWithBuilder(name, surname, born, personalVoice, favoriteEat, viripotent,
          crazy, children);
    }
  }

}
