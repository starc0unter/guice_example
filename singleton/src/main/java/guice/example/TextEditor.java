package guice.example;

import com.google.inject.Inject;
import org.jetbrains.annotations.NotNull;

final class TextEditor {
  @Inject
  public @NotNull  SpellChecker spellChecker;
  @Inject
  public @NotNull  SpellChecker2 spellChecker2;

  public TextEditor() {
  }
}
