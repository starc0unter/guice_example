package guice.example;

public final class ClassImplementedBy implements SimpleInterface {
    @Override
    public void run() {
        System.out.println("ClassImplementedBy");
    }
}
