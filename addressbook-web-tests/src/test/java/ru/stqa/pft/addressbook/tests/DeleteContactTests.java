package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class DeleteContactTests extends TestBase {

    @Test

    public void testDeleteContact() {
        app.getNavigationHelper().chooseCheckBoxOfContact();
        app.getContanctHelper().pushDeleteButton();
        app.getContanctHelper().confirmToDeleteContact();
    }
}
