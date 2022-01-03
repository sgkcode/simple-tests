package com.epam.learn.service;

import com.epam.learn.model.User;

public class UserCreator {

  public static final String TESTDATA_USER_NAME = "testdata.user.name";
  public static final String TESTDATA_USER_PASSWORD = "testdata.user.password";
  public static final String TESTDATA_USER_PROFILE_NAME = "testdata.user.profilename";

  public static User withCredentialsFromProperty() {
    return new User(TestDataReader.getTestData(TESTDATA_USER_NAME),
        TestDataReader.getTestData(TESTDATA_USER_PASSWORD),
        TestDataReader.getTestData(TESTDATA_USER_PROFILE_NAME));
  }

  public static User withEmptyUsername() {
    return new User("", TestDataReader.getTestData(TESTDATA_USER_PASSWORD),
        TestDataReader.getTestData(TESTDATA_USER_PROFILE_NAME));
  }

  public static User withEmptyPassword() {
    return new User(TestDataReader.getTestData(TESTDATA_USER_NAME), "", TESTDATA_USER_PROFILE_NAME);
  }

  public static User withIncorrectCredentials() {
    return new User("45h54", "hfdsb54b4", "");
  }
}
