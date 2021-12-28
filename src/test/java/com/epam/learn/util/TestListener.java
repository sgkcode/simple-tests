package com.epam.learn.util;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

  private Logger log = LogManager.getRootLogger();

  public void onTestSuccess(ITestResult result) {
    log.info(result.getInstanceName() + " test passed");
  }

  public void onTestFailure(ITestResult result) {
    log.error(result.getInstanceName() + " test failed");
  }
}
