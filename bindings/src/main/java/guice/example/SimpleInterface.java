package guice.example;

import com.google.inject.ImplementedBy;

@SuppressWarnings("ClassReferencesSubclass")
@ImplementedBy(ClassImplementedBy.class)
public interface SimpleInterface {
    void run();
}
