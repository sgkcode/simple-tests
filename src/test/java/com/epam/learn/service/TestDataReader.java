package com.epam.learn.service;

import java.util.ResourceBundle;

public class TestDataReader {

  private static ResourceBundle resourceBundle = ResourceBundle
      .getBundle(System.getProperty("userType"));

  public static String getTestData(String key) {
    return resourceBundle.getString(key);
  }
}
