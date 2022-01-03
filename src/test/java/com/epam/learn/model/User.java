package com.epam.learn.model;

import java.util.Objects;

public class User {
  private String username;
  private String password;
  private String profileName;

  public User(String username, String password, String profileName) {
    this.username = username;
    this.password = password;
    this.profileName = profileName;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getProfileName() {
    return profileName;
  }

  public void setProfileName(String profileName) {
    this.profileName = profileName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(username, user.username) && Objects
        .equals(password, user.password) && Objects.equals(profileName, user.profileName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, password, profileName);
  }
}
