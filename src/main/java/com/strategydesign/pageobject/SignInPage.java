package com.strategydesign.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignInPage {
  WebDriver driver;
  static WebDriverWait wait;
  public SignInPage(WebDriver driver)
  {
    this.driver=driver;
    wait=new WebDriverWait(driver, Duration.ofSeconds(100));
    PageFactory.initElements(driver,this);

  }
  @FindBy(xpath = "//a[@class='button facebook']")
  static WebElement facebookButton;
  @FindBy(xpath = "//a[@class='button linkedin']")
  WebElement linkedInButton;

  public static WebElement getFacebookButton()
  {
    return wait.until(ExpectedConditions.elementToBeClickable(facebookButton));
  }

  public WebElement getLinkedInButton()
  {
    return wait.until(ExpectedConditions.elementToBeClickable(linkedInButton));
  }

}
