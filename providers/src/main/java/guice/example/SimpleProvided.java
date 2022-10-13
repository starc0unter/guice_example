package guice.example;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.jetbrains.annotations.NotNull;


@SuppressWarnings("ALL")
public final class SimpleProvided {

    private final Provider<TestClass> testClassProvider;

    @Inject
    public SimpleProvided(Provider<TestClass> testClassProvider) {
        this.testClassProvider = testClassProvider;
    }

    public void run() {
        // создаем первый экземпляр
        testClassProvider.get().run();
        // создаем второй экземпляр
        testClassProvider.get().run();
    }

}
