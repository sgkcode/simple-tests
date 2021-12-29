package com.epam.learn.util;

import java.lang.reflect.Method;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class TestListener implements ITestListener {

  private Logger log = LogManager.getRootLogger();

  @Override
  public void onStart(ITestContext context) {
    log.info("XML info: Suite " + "'" + context.getSuite().getName() + "'"
        + " TestName " + "'" + context.getName() + "'");
  }

  @Override
  public void onTestStart(ITestResult result) {
    Method method = result.getMethod().getConstructorOrMethod().getMethod();
    String nameFromTestAnnotation = method.getAnnotation(Test.class).testName();
    log.info("Running test => " + nameFromTestAnnotation);
  }

  @Override
  public void onTestSuccess(ITestResult result) {
    log.info("test passed");
  }

  @Override
  public void onTestFailure(ITestResult result) {
    log.error("test failed");
  }
}
