package guice.example;

import com.google.inject.Inject;
import org.jetbrains.annotations.NotNull;

import java.util.logging.Logger;

public final class TestHelper implements Helper {
  @Inject
  private @NotNull Logger logger;

  @Override
  public void help() {
    logger.info(logger.getName());
  }
}
