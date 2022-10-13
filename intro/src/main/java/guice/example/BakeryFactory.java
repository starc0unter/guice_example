package guice.example;

import org.jetbrains.annotations.NotNull;

public final class BakeryFactory {

    @NotNull
    public final Bakery bakery;
    @NotNull
    public final Dough dough;
    @NotNull
    public final Flour flour;

    public BakeryFactory() {
        this.bakery = new Bakery();
        this.dough = new Dough();
        this.flour = new Flour(dough);
    }
}
