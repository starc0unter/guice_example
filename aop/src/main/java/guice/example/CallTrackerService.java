package guice.example;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.jetbrains.annotations.NotNull;

final class CallTrackerService implements MethodInterceptor {

  @Override
  public @NotNull Object invoke(@NotNull MethodInvocation invocation) throws Throwable {
    System.out.println("До вызова метода....");
    var result = invocation.proceed();
    System.out.println("После вызова метода....");
    return result;
  }
}
