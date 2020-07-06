package ru.stqa.pft.addressbook;// Generated by Selenium IDE
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class GroupCreationTest {
  private static WebDriver driver;

  @BeforeMethod
  public void setUp() throws Exception {
    driver = new FirefoxDriver(new FirefoxOptions().setLegacy(true).setBinary("/home/elmirabaltinova/firefox-sdk/bin/firefox"));;
    driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    driver.get("http://localhost/addressbook/index.php");
    driver.manage().window().setSize(new Dimension(550, 692));
    driver.findElement(By.name("user")).click();
    driver.findElement(By.name("user")).sendKeys("admin");
    driver.findElement(By.name("pass")).click();
    driver.findElement(By.name("pass")).sendKeys("secret");
    driver.findElement(By.name("pass")).sendKeys(Keys.ENTER);
  }

  @Test
  public void testGroupCreation() {
    driver.findElement(By.linkText("groups")).click();
    driver.findElement(By.name("new")).click();
    driver.findElement(By.name("group_name")).click();
    driver.findElement(By.name("group_name")).sendKeys("Test1");
    driver.findElement(By.name("group_header")).click();
    driver.findElement(By.name("group_header")).sendKeys("Test2");
    driver.findElement(By.name("group_footer")).click();
    driver.findElement(By.name("group_footer")).sendKeys("Test3");
    driver.findElement(By.name("submit")).click();
    driver.findElement(By.linkText("group page")).click();
  }

  @AfterMethod
  public void tearDown() {
    driver.quit();
  }

  public static boolean isAlertPresent(FirefoxDriver Driver) {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }
}
