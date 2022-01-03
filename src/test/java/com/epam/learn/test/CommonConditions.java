package com.epam.learn.test;

import com.codeborne.selenide.Configuration;
import com.epam.learn.util.TestListener;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

@Listeners({TestListener.class})
public abstract class CommonConditions {
  @BeforeTest
  public static void setUp() {
    Configuration.startMaximized = true;
  }
}
