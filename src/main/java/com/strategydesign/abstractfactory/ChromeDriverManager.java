package com.strategydesign.abstractfactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverManager extends DriverAbstractManager{
  @Override
  public void startDriver() {
    WebDriverManager.chromedriver().setup();
  }

  @Override
  public void createDriver() {
      driver=new ChromeDriver();
      driver.get("https://courses.ultimateqa.com/users/sign_in");
      driver.manage().window().maximize();
  }

  @Override
  public WebDriver getDriver() {
    startDriver();
    createDriver();
    return driver;
  }
}
