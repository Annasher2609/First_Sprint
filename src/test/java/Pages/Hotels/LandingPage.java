package Pages.Hotels;

import DriverWrapper.Web;
import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LandingPage extends BasePage {

    //Locators

    By searchButton = By.xpath("//button[@type='submit']");
    By checkInCal = By.xpath("//label[@id='widget-query-label-1']");
    By checkOutCal = By.xpath("//label[@data-input='qf-0q-localised-check-out']");
    By briefCase = By.xpath("//span[@class='widget-query-num-nights']");
    By allCalendarDates = By.xpath("//td[starts-with(@data-date,'2020-11')]");


    //Methods

    public void clickSearchButton () {
        clickThis(searchButton);
    }

    public boolean isSearchButtonEnabled() {
       return Web.getDriver().findElement(searchButton).isEnabled();
    }
    public void selectCheckInDate(String checkInDate) {
        clickThis(checkInCal);
        List<WebElement> dates = Web.getDriver().findElements(allCalendarDates);
        for (WebElement date : dates) {
            if (date.getText().equalsIgnoreCase(checkInDate)) {
                date.click();
                break;
            }
        }
    }
    public void selectCheckOutDate(String checkOutDate) {
        clickThis(checkOutCal);
        List<WebElement> dates = Web.getDriver().findElements(allCalendarDates);
        for (WebElement date : dates) {
            if (date.getText().equalsIgnoreCase(checkOutDate)) {
                date.click();
                break;
            }
        }
    }
    public String getBriefCaseText () {
        return Web.getDriver().findElement(briefCase).getText();
    }


}
