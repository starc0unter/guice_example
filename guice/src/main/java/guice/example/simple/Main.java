package guice.example.simple;

import com.google.inject.Guice;
import com.google.inject.Injector;
import guice.example.Helper;
import guice.example.TestHelper;
import guice.example.TestModule;
import org.jetbrains.annotations.NotNull;

public enum Main {
    ;

    public static void main(@NotNull String[] args) {
        final Injector injector = Guice.createInjector(new SimpleModule());
    }
}
