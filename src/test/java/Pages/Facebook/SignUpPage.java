package Pages.Facebook;

import Pages.BasePage;
import org.openqa.selenium.By;

public class SignUpPage extends BasePage {

    By firstName = By.xpath("//input[@name='firstname']");
    By lastName = By.xpath("//input[@name='lastname']");
    By newEmail = By.name("//input[reg_email__");
    By newPassword = By.name("reg_passwd__");
    By monthDrop = By.name("birthday_month");
    By dayDrop = By.name("birthday_day");
    By yearDrop = By.name("birthday_year");
    By femaleRadio = By.xpath("//label[contains(text(),'Female')]");
    By signUpButton = By.xpath("//button[@name='websubmit']");


    public void enterFirstName (String fName) {
        type(firstName, fName);
    }

    public void enterLastName (String lName) {
        type(lastName, lName);
    }

    public void enterNewEmail (String email) {
        type(newEmail, email);
    }

    public void enterPassword (String password) {
        type(newPassword, password);
    }

    public void clickingRadio () {
        clickThis(femaleRadio);
    }
    public void choosingDayDropDown (String day) {
        selectDropdown(dayDrop, day);
    }
    public void choosingMonthDropDown (String month) {
        selectDropdown(monthDrop, month);
    }
    public void choosingYearDropDown (String year) {
        selectDropdown(yearDrop, year);
    }
    public void clickingSignUp () {
        clickThis(signUpButton);
    }





}
