import com.strategydesign.abstractfactory.DriverAbstractManager;
import com.strategydesign.abstractfactory.DriverFactory;
import com.strategydesign.abstractfactory.DriverType;
import com.strategydesign.loginstrategy.UserFaceBookLoginStrategy;
import com.strategydesign.loginstrategy.UserLinkedInLoginStrategy;
import com.strategydesign.loginstrategy.UserLoginContext;
import com.strategydesign.pageobject.SignInPage;
import com.strategydesign.utilities.BaseMethod;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UserLoginTest {
  DriverAbstractManager driverAbstractManager;
  WebDriver driver;
  SignInPage signInPage;
  UserLoginContext userLoginContext;
  @BeforeTest
  public void initialisation()
  {
   driverAbstractManager=DriverFactory.getDriverManager(DriverType.CHROME);
   driverAbstractManager.startDriver();
   driver=driverAbstractManager.getDriver();
   signInPage=new SignInPage(driver);
   userLoginContext=new UserLoginContext();

  }
  @Test
  public void faceBookLogin()
  {
    userLoginContext.selectLoginStrategy(new UserFaceBookLoginStrategy());
    userLoginContext.getLoginStrategy();
    BaseMethod.navigateBackWard(driver);
  }
  @Test
  public void linkedInLogin()
  {
    userLoginContext.selectLoginStrategy(new UserLinkedInLoginStrategy());
    userLoginContext.getLoginStrategy();
    BaseMethod.navigateBackWard(driver);
  }
}
