package com.epam.learn.page;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

public class MispPatientsPage extends AbstractPage{

  public static final String PATIENTS_URL = BASE_URL + "/patients";
  public SelenideElement profileNameHeader = $(byXpath("//h6[@data-test='profile-name']"));

  public String getProfileName() {
    return profileNameHeader.shouldBe(Condition.visible).getText();
  }

}
