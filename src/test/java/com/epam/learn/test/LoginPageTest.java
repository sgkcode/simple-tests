package com.epam.learn.test;

import com.epam.learn.model.User;
import com.epam.learn.page.MispLoginPage;
import com.epam.learn.service.UserCreator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends CommonConditions {

  @Test
  public void shouldLoginWithCorrectCredentials() {
    User user = UserCreator.withCredentialsFromProperty();
    String profileName = new MispLoginPage()
        .openPage()
        .login(user)
        .getProfileName();
    Assert.assertEquals(profileName, user.getProfileName());
  }

  @Test
  public void shouldDisplayErrorMessageWithEmptyUserName() {
    User user = UserCreator.withEmptyUsername();
    String errorMessage = new MispLoginPage()
        .openPage()
        .fillOutLoginForm(user)
        .getErrorMessage();
    Assert.assertEquals(errorMessage, "login is a required field");
  }

  @Test
  public void shouldDisplayErrorMessageWithEmptyPassword() {
    User user = UserCreator.withEmptyPassword();
    String errorMessage = new MispLoginPage()
        .openPage()
        .fillOutLoginForm(user)
        .getErrorMessage();
    Assert.assertEquals(errorMessage, "password is a required field");
  }

  @Test
  public void shouldDisplayErrorMessageWithIncorrectCredentials() {
    User user = UserCreator.withIncorrectCredentials();
    String errorMessage = new MispLoginPage()
        .openPage()
        .fillOutLoginForm(user)
        .getErrorMessage();
    Assert.assertEquals(errorMessage, "Имя пользователя или пароль неверные");
  }
}
