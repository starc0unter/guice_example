package guice.example;

import com.google.inject.Guice;
import org.jetbrains.annotations.NotNull;

public final class Main {

    public static void main(@NotNull String[] args) {
        final var injector = Guice.createInjector();
        final var simpleProvider = injector.getInstance(SimpleProvided.class);
        simpleProvider.run();
    }
}
