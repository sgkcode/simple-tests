package com.epam.learn.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ShouldReturnFalseTest extends CommonConditions {

  @Test
  public void shouldReturnFalse() {
    Assert.assertFalse(true);
  }
}
