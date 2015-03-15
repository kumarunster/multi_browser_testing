package test_selenide.test_selenide;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

import java.net.URL;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.codeborne.selenide.WebDriverRunner;


/**
 * Unit test for simple App.
 */
public class AppTest
{
  
    @BeforeClass
    public static void setUp() throws Exception {
      System.out.println("setup the test");
      
      
      URL hubUrl = new URL("http://localhost:4444/wd/hub");
      DesiredCapabilities capabilities = new DesiredCapabilities();
      capabilities.setBrowserName("internet explorer 8");
      capabilities.setPlatform(Platform.WINDOWS);
      WebDriver webDriver = new RemoteWebDriver(hubUrl, capabilities);
      
      
      WebDriverRunner.setWebDriver(webDriver);
    }
    
    @Test
    public void simpleTest() throws Exception {
      open("http://github.com");
      
      $(By.name("q")).should(appear);
      screenshot("opened.png");
      
      $(By.name("q")).setValue("selenide").pressEnter();
      $("#site-container").shouldHave(text("codeborne"));
      
      screenshot("search_result.png");
    }
}
