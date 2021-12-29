package com.epam.learn.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ShouldReturnTrueTest extends CommonConditions {

  @Test(testName = "ShouldReturnTrueTestNameFromAnnotation")
  public void shouldReturnTrue() {
    Assert.assertTrue(true);
  }
}
