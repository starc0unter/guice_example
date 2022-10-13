package guice.example;

public class SpellCheckerImpl implements SpellChecker {
    @Override
    @CallTracker
    public void checkSpelling() {
        System.out.println("Метод внутри");
    }
}
