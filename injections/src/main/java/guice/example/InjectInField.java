package guice.example;

import org.jetbrains.annotations.NotNull;

import javax.inject.Inject;

public final class InjectInField {

    @NotNull
    @Inject
    private TestClass testClass;

    public void run() {
        testClass.run();
    }
}
