package guice.example;

import com.google.inject.Inject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;


public final class InjectInMethod {
    private @Nullable TestClass2 testClass;

    @Inject(optional = true)
    public void run2(@Nullable TestClass2 testClass) {
        this.testClass = testClass;
    }

    public TestClass2 get() {
        return testClass;
    }

}
