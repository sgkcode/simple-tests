package com.epam.learn.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ShouldReturnTrueTest extends CommonConditions {

  @Test(testName = "ShouldReturnTrueTestNameFromAnnotation")
  public void shouldReturnTrue() {
    Assert.assertTrue(true);
  }

  @Test(testName = "ShouldReturnTrueTestNameFromAnnotation2")
  public void shouldReturnTrue2() {
    Assert.assertTrue(true);
  }

  @Test(testName = "ShouldReturnTrueTestNameFromAnnotation3")
  public void shouldReturnTrue3() {
    Assert.assertTrue(true);
  }

  @Test(testName = "ShouldReturnTrueTestNameFromAnnotation4")
  public void shouldReturnTrue4() {
    Assert.assertTrue(true);
  }

  @Test(testName = "ShouldReturnTrueTestNameFromAnnotation5")
  public void shouldReturnTrue5() {
    Assert.assertTrue(true);
  }
}
