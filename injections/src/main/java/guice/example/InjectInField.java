package guice.example;

import org.jetbrains.annotations.NotNull;

import javax.inject.Inject;

@SuppressWarnings("NotNullNullableValidation")
public final class InjectInField {

    @Inject
    private TestClass testClass;

    public void run() {
        testClass.run();
    }

}
