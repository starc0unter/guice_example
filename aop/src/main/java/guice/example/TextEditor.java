package guice.example;

import com.google.inject.Inject;
import org.jetbrains.annotations.NotNull;

final class TextEditor {
    private final @NotNull  SpellChecker spellChecker;

    @Inject
    public TextEditor(@NotNull SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public void makeSpellCheck() {
        spellChecker.checkSpelling();
    }
}
