package guice.example;

import com.google.inject.Guice;
import org.jetbrains.annotations.NotNull;

public final class Main {

    public static void main(@NotNull String[] args) {
        final var injector = Guice.createInjector();

        var injectInField = injector.getInstance(InjectInField.class);
        injectInField.run();

        var injectInConstructor = injector.getInstance(InjectInConstructor.class);
        injectInConstructor.run();

        injector.getInstance(InjectInMethod.class);

        injector.injectMembers(new TestClassWithConstructor(1));
    }
}
