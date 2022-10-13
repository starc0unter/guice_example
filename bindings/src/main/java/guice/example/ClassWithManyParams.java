package guice.example;

import org.jetbrains.annotations.NotNull;

public final class ClassWithManyParams {
    public final @NotNull ClassWithConstructor classWithConstructor;

    public ClassWithManyParams(@NotNull ClassWithConstructor classWithConstructor) {
        this.classWithConstructor = classWithConstructor;
    }
}
