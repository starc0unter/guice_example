package guice.example;

import com.google.inject.Inject;
import org.jetbrains.annotations.NotNull;

import javax.inject.Named;

public final class ClassAll {
    @NotNull
    private final BaseClass obj1;
    @NotNull
    private final BaseClass obj2;
    @NotNull
    private final BaseClass obj3;

    @Inject
    public ClassAll(@NotNull BaseClass obj1,
                    @TagInterface @NotNull BaseClass obj2,
                    @Named("test_name") @NotNull BaseClass obj3) {
        this.obj1 = obj1;
        this.obj2 = obj2;
        this.obj3 = obj3;
    }

    public void run() {
        obj1.run();
        obj2.run();
        obj3.run();
    }
}