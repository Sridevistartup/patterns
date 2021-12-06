package com.strategydesign.utilities;

import com.strategydesign.abstractfactory.DriverAbstractManager;
import com.strategydesign.abstractfactory.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseMethod {

  public static void clickElement(WebElement element)
  {
    element.click();
  }
  public static void navigateBackWard(WebDriver driver)
  {
            driver.navigate().back();
  }
}
