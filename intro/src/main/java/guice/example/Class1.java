package guice.example;

import org.jetbrains.annotations.NotNull;

public final class Class1 {

    @NotNull
    private Class2 class2 = new Class2();

    @NotNull
    private Class3 class3 = new Class3(class2);

    @NotNull
    private Class3 class3_1 = new Factory().class3;
}
