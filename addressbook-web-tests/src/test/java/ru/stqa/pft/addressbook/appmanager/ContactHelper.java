package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactHelper extends HelperBase {

    public ContactHelper(FirefoxDriver driver) {
        super(driver);
    }

    public void submitContactCreation() {
      click(By.cssSelector("input:nth-child(87)"));
    }

    public void fillContactForm(ContactData contactData) {
        type(By.name("firstname"), contactData.getFirstname());
        type(By.name("lastname"), contactData.getLastname());
        type(By.name("home"), contactData.getNumber_home());
        type(By.name("email"), contactData.getEmail());
    }

    public void initContactCreation() {
      click(By.linkText("add new"));
    }

    public void editContactForm() {
        click(By.xpath("(//img[@alt='Edit'])[2]"));
    }

    public void updateContactModification() {
        click(By.xpath("(//input[@name='update'])[2]"));
    }
}
