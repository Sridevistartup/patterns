package com.strategydesign.abstractfactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public abstract class DriverAbstractManager {
 WebDriver driver;


 public void quitDriver()
 {
   driver.quit();
 }

 public abstract void startDriver();
 public abstract void createDriver();
 public abstract WebDriver getDriver();

}
