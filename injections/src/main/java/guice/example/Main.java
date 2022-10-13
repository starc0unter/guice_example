package guice.example;

import com.google.inject.Guice;
import org.jetbrains.annotations.NotNull;

@SuppressWarnings({"NotNullNullableValidation", "LocalCanBeFinal"})
public final class Main {

    public static void main(@NotNull String[] args) {
        final var injector = Guice.createInjector(new InjectionModule());

        injector.getInstance(InjectInField.class).run();
        injector.getInstance(InjectInConstructor.class).run();
        System.out.println(injector.getInstance(InjectInMethod.class).get());
        
        //инжектируем поля типа TestClassWithInterface
        TestClassWithInterface testClass = new TestClassWithConstructor(1);
        injector.injectMembers(testClass);
        testClass.run();
    }
}


