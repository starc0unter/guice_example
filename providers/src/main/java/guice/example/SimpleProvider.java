package guice.example;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.jetbrains.annotations.NotNull;


public final class SimpleProvider {
    @NotNull
    private final Provider<TestClass> testClassProvider;

    @Inject
    public SimpleProvider(@NotNull Provider<TestClass> testClassProvider) {
        this.testClassProvider = testClassProvider;
    }

    public void run() {
        testClassProvider.get().run();
    }
}
