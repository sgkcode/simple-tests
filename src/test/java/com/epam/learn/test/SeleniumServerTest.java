package com.epam.learn.test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import java.util.logging.Level;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class SeleniumServerTest {

  @Test
  public void shouldStartOnGridServer() {
    ChromeOptions options = new ChromeOptions();
    options.addArguments("--start-maximized");
    options.addArguments("--verbose");
    Configuration.remote = "http://localhost:4444";
    RemoteWebDriver driver = new RemoteWebDriver(options);
    WebDriverRunner.setWebDriver(driver);
    driver.get("https://www.google.com/");
    driver.setLogLevel(Level.INFO);
//    driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
//    driver.findElement(By.name("q1")).click();
    new WebDriverWait(driver, 10)
        .until(ExpectedConditions.elementToBeClickable(By.name("q1"))).click();
  }

  @AfterMethod
  public void tearDown() {
    WebDriverRunner.closeWebDriver();
  }
}
