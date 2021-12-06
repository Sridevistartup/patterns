package com.strategydesign.loginstrategy;

public class UserLoginContext {
  UserLogin userLogin;
  public void selectLoginStrategy(UserLogin userLogin)
  {
    this.userLogin=userLogin;
  }
  public  void getLoginStrategy()
  {
    userLogin.login();
  }
}
