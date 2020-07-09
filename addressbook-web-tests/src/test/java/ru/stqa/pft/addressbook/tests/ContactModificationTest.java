package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTest extends TestBase {

    @Test
    public void testContactModification() {
        app.getContactHelper().editContactForm();
        app.getContactHelper().fillContactForm(new ContactData("Bekki", "Howard", "332211", "bekki@howard.com", null), false);
        app.getContactHelper().updateContactModification();
        app.getNavigationHelper().gotoHomePage();
    }
}
