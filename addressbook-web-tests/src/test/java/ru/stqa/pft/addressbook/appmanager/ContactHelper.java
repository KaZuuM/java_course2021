package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import ru.stqa.pft.addressbook.model.ContanctData;

public class ContactHelper extends HelperBase{
    public ContactHelper(WebDriver wd) {
        super(wd);
    }


    public void confirmContactCreation() {
        click(By.xpath("//div[@id='content']/form/input[21]"));
    }

    public void returnToHomePage() {
        click(By.linkText("home page"));
    }
    public void fillContactForm(ContanctData contanctData) {
        type(By.name("firstname"), contanctData.getFirstName());
        type(By.name("middlename"), contanctData.getMiddleName());
        type(By.name("nickname"), contanctData.getNickName());
        type(By.name("lastname"), contanctData.getLastName());
        type(By.name("title"), contanctData.getTitle());
        type(By.name("company"), contanctData.getCompany());
        type(By.name("address"), contanctData.getAddress());
        type(By.name("mobile"),contanctData.getMobile());
        type(By.name("work"),contanctData.getWorkMobile());
        type(By.name("email"),contanctData.getEmail());
        click(By.name("bday"));
        findElement(By.name("bday")).selectByVisibleText(contanctData.getbDay());
        click(By.name("bmonth"));
        findElement(By.name("bmonth")).selectByVisibleText(contanctData.getbMonths());
        type(By.name("byear"),contanctData.getbYear());
        click(By.name("new_group"));
        findElement(By.name("new_group")).selectByVisibleText(contanctData.getGroup());
        type(By.name("address2"),contanctData.getAddress2());
        type(By.name("phone2"),contanctData.getPhone2());
        type(By.name("notes"),contanctData.getNotes());
    }
    public void fillContactFormWithOutGroup(ContanctData contanctData) {
        type(By.name("firstname"), contanctData.getFirstName());
        type(By.name("middlename"), contanctData.getMiddleName());
        type(By.name("nickname"), contanctData.getNickName());
        type(By.name("lastname"), contanctData.getLastName());
        type(By.name("title"), contanctData.getTitle());
        type(By.name("company"), contanctData.getCompany());
        type(By.name("address"), contanctData.getAddress());
        type(By.name("mobile"),contanctData.getMobile());
        type(By.name("work"),contanctData.getWorkMobile());
        type(By.name("email"),contanctData.getEmail());
        click(By.name("bday"));
        findElement(By.name("bday")).selectByVisibleText(contanctData.getbDay());
        click(By.name("bmonth"));
        findElement(By.name("bmonth")).selectByVisibleText(contanctData.getbMonths());
        type(By.name("byear"),contanctData.getbYear());
        type(By.name("address2"),contanctData.getAddress2());
        type(By.name("phone2"),contanctData.getPhone2());
        type(By.name("notes"),contanctData.getNotes());
    }

    public void editFirstContact() {
        click(By.xpath("//table[@id='maintable']/tbody/tr[3]/td[8]/a/img"));
    }
}
