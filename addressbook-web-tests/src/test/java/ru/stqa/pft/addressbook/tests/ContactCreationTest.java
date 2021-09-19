package ru.stqa.pft.addressbook.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContanctData;

public class ContactCreationTest extends TestBase {
    private WebDriver wd;


    @Test
    public void testContactCreation() {
        app.getNavigationHelper().addContact();
        app.getContanctHelper().fillContactForm(new ContanctData("Artyom", "Viktorovich", "Kazmin", "KaZuuM", "123", "Egar", "Voronezh", "+79204370360", "+79204370360", "sportakus93@gmail.com", "7", "June", "1993", "test_qq", "123", "123", "12435"));
        app.getContanctHelper().confirmContactCreation();
        app.getContanctHelper().returnToHomePage(By.linkText("home page"));
    }

}