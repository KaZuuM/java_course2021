package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContanctData;

public class ContactModificationTests extends TestBase {

    @Test
    public void testContactModification() {
        app.getContanctHelper().editFirstContact();
        app.getContanctHelper().fillContactFormWithOutGroup(new ContanctData("Artyom", "Viktorovich", "Kazmin", "KaZuuM", "123", "Egar", "Voronezh", "+79204370360", "+79204370360", "sportakus93@gmail.com", "19", "June", "1994", "test_qq", "123", "123", "12435"));
        app.getGroupHelper().submitModification();
        app.getContanctHelper().returnToHomePage();

    }
}
