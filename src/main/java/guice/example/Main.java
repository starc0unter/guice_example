package guice.example;

import com.google.inject.Guice;
import org.jetbrains.annotations.NotNull;

public final class Main {

    public static void main(@NotNull String[] args) {
        final var injector = Guice.createInjector(new TextEditorModule());

        final TextEditor editor = injector.getInstance(TextEditor.class);
        System.out.println("spell1 " + editor.spellChecker.getId());
        System.out.println("spell2 " + editor.spellChecker2.getId());

        final TextEditor editor1 = injector.getInstance(TextEditor.class);
        System.out.println("spell1 " + editor1.spellChecker.getId());
        System.out.println("spell2 " + editor1.spellChecker2.getId());
    }
}
