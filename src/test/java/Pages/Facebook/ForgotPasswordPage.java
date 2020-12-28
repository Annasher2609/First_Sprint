package Pages.Facebook;

import Pages.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;

public class ForgotPasswordPage extends BasePage {

    By searchButton = By.xpath("//input[@value='Search']");
    By errorMessage = By.xpath("//div[text()='Please fill in at least one field']");



    public void clickSearchButton() {
        clickThis(searchButton);
    }
    public boolean verifyingErrorMessage() {
        return isElementDisplayed(errorMessage);
    }
}
