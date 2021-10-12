package guice.example;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.jetbrains.annotations.NotNull;

public enum Main {
    ;

    public static void main(@NotNull String[] args) {
        /*
         * Guice.createInjector () принимает модули и возвращает новый инжектор.
         * Этот метод должен быть вызван один раз во время запуска приложения.
         */
        final Injector injector = Guice.createInjector(new TestModule());
        injector.injectMembers(new TestHelper());

        var help = injector.getInstance(Helper.class);
        help.help();
    }
}
