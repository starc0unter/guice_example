package guice.example;

import com.google.inject.Inject;
import org.jetbrains.annotations.NotNull;

public final class SimpleBinding {
    private final @NotNull BaseClass clazz;

    @Inject
    public SimpleBinding(@NotNull BaseClass clazz) {
        this.clazz = clazz;
    }

    public void apply() {
        clazz.run();
    }
}
