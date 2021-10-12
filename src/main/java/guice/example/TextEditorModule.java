package guice.example;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;

final class TextEditorModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(SpellChecker.class).to(SpellCheckerImpl.class).in(Singleton.class);

        bind(SpellChecker2.class).to(SpellCheckerImpl2.class);
    }
}
