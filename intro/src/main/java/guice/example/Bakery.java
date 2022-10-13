package guice.example;

import org.jetbrains.annotations.NotNull;

public final class Bakery {

    @NotNull
    private Dough dough = new Dough();

    @NotNull
    private Flour cakeFlour = new Flour(dough);

    @NotNull
    private Flour breadFlour = new BakeryFactory().flour;
}
