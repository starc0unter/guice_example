package guice.example;

import org.jetbrains.annotations.NotNull;

public final class Factory {

    @NotNull
    public final Class1 class1;
    @NotNull
    public final Class2 class2;
    @NotNull
    public final Class3 class3;

    public Factory() {
        this.class1 = new Class1();
        this.class2 = new Class2();
        this.class3 = new Class3(class2);
    }
}
