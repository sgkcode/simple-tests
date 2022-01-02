package com.epam.learn.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ShouldReturnSameValueTest extends CommonConditions {

  @Test(testName = "ShouldReturnSameValueTestNameFromAnnotation")
  public void shouldReturnSameValue() {
    Assert.assertEquals("one", "two");
  }

  @Test(testName = "ShouldReturnSameValueTestNameFromAnnotation2")
  public void shouldReturnSameValue2() {
    Assert.assertEquals("one", "two");
  }

  @Test(testName = "ShouldReturnSameValueTestNameFromAnnotation3")
  public void shouldReturnSameValue3() {
    Assert.assertEquals("one", "two");
  }
}
