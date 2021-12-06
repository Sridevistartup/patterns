package com.strategydesign.loginstrategy;

import com.strategydesign.pageobject.SignInPage;
import com.strategydesign.utilities.BaseMethod;
import org.openqa.selenium.support.PageFactory;

public class UserFaceBookLoginStrategy implements UserLogin{

  @Override
  public void login() {
    BaseMethod.clickElement(SignInPage.getFacebookButton());
  }
}
