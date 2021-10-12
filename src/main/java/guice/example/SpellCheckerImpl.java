package guice.example;

import com.google.inject.Singleton;

@Singleton
final class SpellCheckerImpl implements SpellChecker {
    private long id;

    public SpellCheckerImpl() {
        id = Math.round(Math.random() * 100);
    }

    @Override
    public long getId() {
        return id;
    }
}
