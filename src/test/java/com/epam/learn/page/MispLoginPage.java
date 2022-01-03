package com.epam.learn.page;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.epam.learn.model.User;

public class MispLoginPage extends AbstractPage {

  private static final String LOGIN_URL = BASE_URL + "/login";
  private SelenideElement loginInput = $(byName("login"));
  private SelenideElement passwordInput = $(byName("password"));
  private SelenideElement submitButton = $(byXpath("//button[@type='submit']"));
  private SelenideElement loginErrorMessage = $(byXpath("//p[contains(@class, 'MuiFormHelperText-root')]"));

  public MispLoginPage openPage(){
    open(LOGIN_URL);
    return this;
  }

  public MispLoginPage fillOutLoginForm (User user) {
    loginInput.val(user.getUsername());
    passwordInput.val(user.getPassword());
    submitButton.click();
    return this;
  }

  public MispPatientsPage login(User user) {
    fillOutLoginForm(user);
    return new MispPatientsPage();
  }

  public String getErrorMessage() {
    return loginErrorMessage.shouldBe(Condition.visible).getText();
  }

}
