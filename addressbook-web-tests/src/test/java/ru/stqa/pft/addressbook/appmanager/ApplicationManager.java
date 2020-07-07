package ru.stqa.pft.addressbook;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    static FirefoxDriver driver;

    public static boolean isAlertPresent(FirefoxDriver Driver) {
      try {
        driver.switchTo().alert();
        return true;
      } catch (NoAlertPresentException e) {
        return false;
      }
    }

    public void init() {
        driver = new FirefoxDriver(new FirefoxOptions().setLegacy(true).setBinary("/home/elmirabaltinova/firefox-sdk/bin/firefox"));
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get("http://localhost/addressbook/index.php");
        login("admin", "secret");
    }

    private void login(String username, String password) {
      driver.findElement(By.name("user")).click();
      driver.findElement(By.name("user")).sendKeys(username);
      driver.findElement(By.name("pass")).click();
      driver.findElement(By.name("pass")).sendKeys(password);
      driver.findElement(By.name("pass")).sendKeys(Keys.ENTER);
    }

    public void returnToGroupPage() {
      driver.findElement(By.linkText("group page")).click();
    }

    public void submitGroupCreation() {
      driver.findElement(By.name("submit")).click();
    }

    public void fillGroupForm(GroupData groupData) {
      driver.findElement(By.name("group_name")).click();
      driver.findElement(By.name("group_name")).sendKeys(groupData.getName());
      driver.findElement(By.name("group_header")).click();
      driver.findElement(By.name("group_header")).sendKeys(groupData.getHeader());
      driver.findElement(By.name("group_footer")).click();
      driver.findElement(By.name("group_footer")).sendKeys(groupData.getFooter());
    }

    public void initGroupCreation() {
      driver.findElement(By.name("new")).click();
    }

    public void gotoGroupPage() {
      driver.findElement(By.linkText("groups")).click();
    }

    public void stop() {
        driver.quit();
    }

    public void deleteSelectedGroups() {
      driver.findElement(By.name("delete")).click();
    }

    public void selectGroup() {
      driver.findElement(By.name("selected[]")).click();
    }

    public void submitContactCreation() {
      driver.findElement(By.cssSelector("input:nth-child(87)")).click();
    }

    public void fillContactForm(ContactData contactData) {
      driver.findElement(By.name("firstname")).click();
      driver.findElement(By.name("firstname")).sendKeys(contactData.getFirstname());
      driver.findElement(By.name("lastname")).click();
      driver.findElement(By.name("lastname")).sendKeys(contactData.getLastname());
      driver.findElement(By.name("home")).click();
      driver.findElement(By.name("home")).sendKeys(contactData.getNumber_home());
      driver.findElement(By.name("email")).click();
      driver.findElement(By.name("email")).sendKeys(contactData.getEmail());
    }

    public void initContactCreation() {
      driver.findElement(By.linkText("add new")).click();
    }
}
