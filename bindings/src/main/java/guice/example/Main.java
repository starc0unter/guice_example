package guice.example;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.jetbrains.annotations.NotNull;

public enum Main {
    ;

    public static void main(@NotNull String[] args) {
        final Injector injector = Guice.createInjector(new TestModule());

        final var classAll = injector.getInstance(ClassAll.class);
        classAll.run();
    }
}
