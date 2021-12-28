package com.epam.learn.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ShouldReturnSameValueTest extends CommonConditions {

  @Test
  public void shouldReturnSameValue() {
    Assert.assertEquals("one", "two");
  }
}
