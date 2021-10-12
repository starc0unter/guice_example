package guice.example;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Stage;
import org.jetbrains.annotations.NotNull;


public final class Main {

  public static void main(@NotNull String[] args) {
    final Injector injector = Guice.createInjector(Stage.PRODUCTION, new TextEditorModule());
    final TextEditor editor = injector.getInstance(TextEditor.class);
    editor.makeSpellCheck();
  }
}
