package guice.example;

import org.jetbrains.annotations.NotNull;

import javax.inject.Inject;

@SuppressWarnings("ALL")
public final class Foo {
    // У конструктора есть параметр
    // Поэтому должна быть аннотация
    @Inject
    Foo(Bar bar) {
    //...
    }

    public static final class Bar {
        // пустой публичный конструктор
        Bar() {}

        // вложенный класс должен быть статичным
        private final static class Baz {
            // приватный конструктор приватного класса
            // допустим, но не рекомендуется
            private Baz() {}
        }
    }

}

