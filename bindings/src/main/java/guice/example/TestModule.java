package guice.example;

import com.google.inject.AbstractModule;
import com.google.inject.Inject;
import com.google.inject.Provides;
import com.google.inject.name.Names;
import org.jetbrains.annotations.NotNull;

public final class TestModule extends AbstractModule {

    @Override
    protected void configure() {
//        binder().requireExplicitBindings();   //отключает неявные привязки

        bind(BaseClass.class).annotatedWith(Names.named("test_name")).to(Class3.class);

        bind(BaseClass.class).to(Class1.class);

        bind(BaseClass.class).annotatedWith(TagInterface.class).to(Class2.class);

        bind(ClassWithConstructor.class).toInstance(new ClassWithConstructor(2));

        bind(String.class).toInstance("This is my string");

        bind(ClassImplementedBy.class);

        try {
            bind(ClassWithoutInjector.class).toConstructor(ClassWithoutInjector.class.getConstructor(String.class));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    @NotNull
    @Provides
    ClassWithManyParams classWithManyParams(@NotNull ClassWithConstructor classWithConstructor) {
        /* много кода */
        /* не должны кидать исключений */
        return new ClassWithManyParams(classWithConstructor);
    }
}
