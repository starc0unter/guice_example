package guice.example;

public final class SpellCheckerImpl implements SpellChecker {
    @Override
    @CallTracker
    public void checkSpelling() {
        System.out.println("Метод внутри");
    }
}
