package guice.example;

public final class TestClassWithConstructor implements TestClassWithInterface {

    private final int data;

    public TestClassWithConstructor(int data) {
        this.data = data;
    }

    @Override
    public void run() {
        System.out.println("TestClassWithConstructor " + data);
    }
}
