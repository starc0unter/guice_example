package guice.example;


import org.jetbrains.annotations.NotNull;

import javax.inject.Inject;

@SuppressWarnings("NotNullNullableValidation")
public final class InjectInConstructor {

    private final TestClass testClass;

    @Inject
    public InjectInConstructor(@NotNull TestClass testClass) {
        this.testClass = testClass;
    }

    public void run() {
        testClass.run();
    }
}