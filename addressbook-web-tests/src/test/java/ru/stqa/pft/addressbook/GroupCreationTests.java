package ru.stqa.pft.addressbook;

import org.testng.annotations.*;

public class GroupCreationTests extends TestBase {

    @Test
    public void testGroupCreation() {
        goToGroupPage();
        initGroupCreation();
        fillGroupForm(new GroupData("test_qq", "qqqq", "test_qwe"));
        submitGroupCreation();
        returnToGroupPage();
    }

}
