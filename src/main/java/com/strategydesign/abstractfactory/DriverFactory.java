package com.strategydesign.abstractfactory;

public class DriverFactory {

  static  DriverAbstractManager driverAbstractManager;

  public static DriverAbstractManager getDriverManager(DriverType driverType)
  {
    switch (driverType)
    {
      case CHROME:driverAbstractManager=new ChromeDriverManager();
                   break;
      case EDGE:driverAbstractManager=new EdgeDriverManager();
                 break;


    }
    return driverAbstractManager;

  }
}
