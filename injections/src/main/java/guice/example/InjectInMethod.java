package guice.example;

import com.google.inject.Inject;
import org.jetbrains.annotations.NotNull;


public final class InjectInMethod {

    @Inject
    public void run(@NotNull TestClass testClass) {
        testClass.run();
    }

    @Inject(optional = true)
    public void run2(@NotNull TestClass2 testClass) {
        testClass.run();
    }
}
