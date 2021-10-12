package guice.example;


import org.jetbrains.annotations.NotNull;

import javax.inject.Inject;

public final class InjectInConstructor {

    @NotNull
    private final TestClass testClass;

    @Inject
    public InjectInConstructor(@NotNull TestClass testClass) {
        this.testClass = testClass;
    }

    public void run() {
        testClass.run();
    }
}