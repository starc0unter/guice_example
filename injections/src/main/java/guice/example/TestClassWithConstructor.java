package guice.example;

import com.google.inject.Inject;

@SuppressWarnings("UseOfSystemOutOrSystemErr")
public final class TestClassWithConstructor implements TestClassWithInterface {
    private final int data;
    private String textData;

    public TestClassWithConstructor(int data) {
        this.data = data;
    }

    @Inject
    public void setData(String textData) {
        this.textData = textData;
    }

    @Override
    public void run() {
        System.out.println("TestClassWithConstructor " + data + ", textData = " + textData);
    }
}
