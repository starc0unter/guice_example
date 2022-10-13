package guice.example;

import com.google.inject.Guice;
import org.jetbrains.annotations.NotNull;

public final class Main {

    public static void main(@NotNull String[] args) {
        final var injector = Guice.createInjector(new TestModule());
        injector.getInstance(ClassAll.class).run();
//        injector.getInstance(BaseClass.class).run();
//        injector.getInstance(SimpleBinding.class).apply();
//        System.out.println(injector.getInstance(ClassWithConstructor.class).id);
//        System.out.println(injector.getInstance(String.class));
//        System.out.println(injector.getInstance(String.class));
//        injector.getInstance(SimpleInterface.class).run();
//        injector.getInstance(ClassWithoutInjector.class);
//        System.out.println(injector.getInstance(ClassWithManyParams.class).classWithConstructor.id);
//        injector.getInstance(Foo.Bar.class);

    }
}
