package Pages;

import DriverWrapper.Web;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.List;
import java.util.function.Function;

public class BasePage {

    public WebElement findElementUsingFluentWait (final By locator) {
        Wait fWait = new FluentWait(Web.getDriver())
                .withTimeout(Duration.ofSeconds(40))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoAlertPresentException.class)
                .ignoring(NoSuchElementException.class)
                .withMessage("Element is not found after 40 seconds of wait");

        WebElement element = (WebElement) fWait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) { return driver.findElement(locator);}
        });
        return element;
    }
    public List <WebElement> findElementsUsingFluentWait (By locator) {
        Wait fWait = new FluentWait(Web.getDriver())
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoAlertPresentException.class)
                .ignoring(NoSuchElementException.class)
                .withMessage("Element is not found after 30 seconds of wait");

        List<WebElement> elements = (List<WebElement>) fWait.until(new Function<WebDriver, List<WebElement>>() {
            public List<WebElement> apply(WebDriver driver) { return driver.findElements(locator);}
        });
        return elements;
    }


    public void clickThis (By locator) {
        findElementUsingFluentWait(locator).click();
        sleep();
    }

    public boolean isElementDisplayed (By locator) {
        return findElementUsingFluentWait(locator).isDisplayed();
    }

    public void type (By locator, String text) {
        findElementUsingFluentWait(locator).sendKeys(text);
    }

    public void selectDropdown (By locator, String data) {
        Select dropdown = new Select(findElementUsingFluentWait(locator));
        dropdown.selectByVisibleText(data);
        sleep();
    }
    public void choosingFromSuggestions (By locator, String data) {
        List<WebElement> suggestions = findElementsUsingFluentWait(locator);
        for (WebElement suggestion: suggestions) {
            String suggText = suggestion.getText();
            if (data.equalsIgnoreCase(suggText)) {
                suggestion.click();
                break;
            }
        }
    }
    public void choosingFromSuggestionsContains (By locator, String data) {
        List<WebElement> suggestions = findElementsUsingFluentWait(locator);
        for (WebElement suggestion: suggestions) {
            String suggText = suggestion.getText();
            if (suggText.contains(data)) {
                suggestion.click();
                break;
            }
        }
    }
    public void sleep(){
        try{
            Thread.sleep(3000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    public String getText(By locator) {
        return findElementUsingFluentWait(locator).getText();
    }
    public boolean isStringContainsString(String elem1, String elem2) {
        return elem1.contains(elem2);
    }
    public void scrollingDown(int pixels){
        JavascriptExecutor js = (JavascriptExecutor)Web.getDriver();
        js.executeScript("scrollBy(0," + pixels + ");");
        sleep();
    }
    public void scrollingToElem(By locator){
        WebElement element = Web.getDriver().findElement(locator);
        JavascriptExecutor js = (JavascriptExecutor)Web.getDriver();
        js.executeScript("arguments[0].scrollIntoView9true0;",element);
    }
    public boolean isStringEqualsString(String elem1, String elem2) {
        return elem1.equalsIgnoreCase(elem2);
    }
    public boolean isDoubleEqualsDouble(Double elem1, Double elem2) {
        if(elem1==elem2) {
            return true;
        }else{
            return false;
        }
    }
    public boolean isIntEqualsInt(int elem1, int elem2) {
        if(elem1==elem2) {
            return true;
        }else{
            return false;
        }
    }
    public String getAttributeValue (By locator) {
        WebElement wElem = Web.getDriver().findElement(locator);
        sleep();
        String value = wElem.getAttribute("value");
        return value;
    }
    public double strIntoDouble (String data) {
        return Double.valueOf(data);
    }
    public double getPriceNum(String data){
        return Double.valueOf(data.substring(1));
    }
    public int strIntoInt (String data) {
        return Integer.valueOf(data);
    }




}
