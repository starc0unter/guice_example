package guice.example;

import com.google.inject.ImplementedBy;

@FunctionalInterface
@ImplementedBy(TestHelper.class)
public interface Helper {
  void help();
}
