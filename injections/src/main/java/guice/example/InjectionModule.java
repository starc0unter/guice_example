package guice.example;

import com.google.inject.AbstractModule;

public final class InjectionModule extends AbstractModule {

    @Override
    protected void configure() {
//        bind(TestClass2.class).toInstance(new TestClass2(10));
        bind(String.class).toInstance("lalala");
    }
}
