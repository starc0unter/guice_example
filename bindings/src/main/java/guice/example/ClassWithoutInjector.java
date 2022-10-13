package guice.example;

import org.jetbrains.annotations.NotNull;

public final class ClassWithoutInjector {

    public ClassWithoutInjector(String data) {
        System.out.println(data);
    }

    public ClassWithoutInjector(int data) {
        System.out.println(data);
    }
}
