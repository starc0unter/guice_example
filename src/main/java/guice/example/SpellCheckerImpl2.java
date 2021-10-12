package guice.example;

import com.google.inject.Singleton;

final class SpellCheckerImpl2 implements SpellChecker2 {
  private long id;

  public SpellCheckerImpl2() {
    id = Math.round(Math.random() * 100);
  }

  @Override
  public long getId() {
    return id;
  }
}
