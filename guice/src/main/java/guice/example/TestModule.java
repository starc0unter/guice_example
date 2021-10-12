package guice.example;

import com.google.inject.AbstractModule;

public final class TestModule extends AbstractModule {
  @Override
  protected void configure() {
    bind(Helper.class).to(ModuleTestHelper.class);
  }
}
