package Pages.Facebook;

import Pages.BasePage;
import org.openqa.selenium.By;

public class LandingPage extends BasePage {

    By forgotPasswordButton = By.linkText("Forgot Password?");
    By email = By.xpath("//input[@name='email']");
    By password = By.xpath("//input[@name='pass']");
    By logIn = By.xpath("//button[@name='login']");
    By createAccountButton = By.xpath("//a[@data-testid='open-registration-form-button']");




    public void clickForgotPassword() {
        clickThis(forgotPasswordButton);
    }
    public boolean isEmptyErrorMessageDisplayed (By locator) {
        return isEmptyErrorMessageDisplayed(locator);
    }
    public void clickCreateAccount () {
        clickThis(createAccountButton);
    }
}
