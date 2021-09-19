package ru.stqa.pft.addressbook.tests;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import ru.stqa.pft.addressbook.model.ContanctData;

public class ContactCreationTest extends TestBase {
  private WebDriver wd;


  @Test
  public void testContactCreation() throws Exception {
    fillContactForm(new ContanctData("Artyom", "Viktorovich", "Kazmin", "KaZuuM", "123", "Egar", "Voronezh", "+79204370360", "+79204370360", "sportakus93@gmail.com", "19", "June", "1993", "test_qq", "123", "123", "12435"));
    confirmContactCreation();
    returnToHomePage(By.linkText("home page"));
  }

  private void returnToHomePage(By home_page) {
    wd.findElement(home_page).click();
  }

  private void confirmContactCreation() {
    wd.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
  }

  private void fillContactForm(ContanctData contanctData) {
    wd.findElement(By.name("firstname")).click();
    wd.findElement(By.name("firstname")).clear();
    wd.findElement(By.name("firstname")).sendKeys(contanctData.getFirstName());
    wd.findElement(By.name("middlename")).clear();
    wd.findElement(By.name("middlename")).sendKeys(contanctData.getMiddleName());
    wd.findElement(By.name("lastname")).clear();
    wd.findElement(By.name("lastname")).sendKeys(contanctData.getLastName());
    wd.findElement(By.name("nickname")).clear();
    wd.findElement(By.name("nickname")).sendKeys(contanctData.getNickName());
    wd.findElement(By.name("title")).clear();
    wd.findElement(By.name("title")).sendKeys(contanctData.getTitle());
    wd.findElement(By.name("company")).clear();
    wd.findElement(By.name("company")).sendKeys(contanctData.getCompany());
    wd.findElement(By.name("address")).clear();
    wd.findElement(By.name("address")).sendKeys(contanctData.getAddress());
    wd.findElement(By.name("mobile")).clear();
    wd.findElement(By.name("mobile")).sendKeys(contanctData.getMobile());
    wd.findElement(By.name("work")).clear();
    wd.findElement(By.name("work")).sendKeys(contanctData.getWorkMobile());
    wd.findElement(By.name("email")).click();
    wd.findElement(By.name("email")).clear();
    wd.findElement(By.name("email")).sendKeys(contanctData.getEmail());
    wd.findElement(By.name("bday")).click();
    new Select(wd.findElement(By.name("bday"))).selectByVisibleText(contanctData.getbDay());
    wd.findElement(By.name("bmonth")).click();
    new Select(wd.findElement(By.name("bmonth"))).selectByVisibleText(contanctData.getbMonths());
    wd.findElement(By.name("byear")).click();
    wd.findElement(By.name("byear")).clear();
    wd.findElement(By.name("byear")).sendKeys(contanctData.getbYear());
    wd.findElement(By.name("aday")).click();
    wd.findElement(By.name("theform")).click();
    wd.findElement(By.name("new_group")).click();
    new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contanctData.getGroup());
    wd.findElement(By.name("address2")).click();
    wd.findElement(By.name("address2")).click();
    wd.findElement(By.name("address2")).clear();
    wd.findElement(By.name("address2")).sendKeys(contanctData.getAddress2());
    wd.findElement(By.name("phone2")).click();
    wd.findElement(By.name("phone2")).clear();
    wd.findElement(By.name("phone2")).sendKeys(contanctData.getPhone2());
    wd.findElement(By.name("notes")).click();
    wd.findElement(By.name("notes")).clear();
    wd.findElement(By.name("notes")).sendKeys(contanctData.getNotes());
  }
}