package Pages.Scholastic;

import DriverWrapper.Web;
import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CheckOutPage extends BasePage {

    By q6S5Loc = By.xpath("//tr[@id='6S5']//td[@class='item-qty']//input[@class='input-qty input-qty-sfo numericenteronly']");
    By q11X5Loc = By.xpath("//tr[@id='11X5']//input[@class='input-qty input-qty-sfo numericenteronly']");
    By q14G5Loc = By.xpath("//tr[@id='14G5']//input[@class='input-qty input-qty-sfo numericenteronly']");
    By p6S5Loc = By.xpath("//tr[@id='6S5']//span[@class='value']");
    By p14G5Loc = By.xpath("//tr[@id='14G5']//span[@class='value']");
    By p11X5Loc = By.xpath("//tr[@id='11X5']//span[@class='value']");
    By priceTotalLoc = By.xpath("//li[@class='std-total-price stdPriceTotal']");
    By quantityTotalLoc = By.xpath("//span[@class='total-qty stdPriceQty']");       //text
    By priceTotalSFOLoc = By.xpath("//li[@class='std-total-price sfoSubTotalPrice']");
    By quantityTotalSFOLoc = By.xpath("//span[@class='total-qty sfoSubTotalQty']");
    By priceSubTotalSFOLocUp = By.xpath("//span[@class='sfoSubTotalPrice']");
    By numSFOstudentLocUp = By.xpath("//span[@id='student_flyer_orders_num']");
    By nameSection = By.xpath("//div[@class='each-review-order']//h2");
    By howManyNames = By.xpath("//h2//span");

    By qRw6S5Loc= By.xpath("//tr[@id = '6S5']//input[@class='input-qty input-qty-sfo numericenteronly']");
    By qRw11X5Loc = By.xpath("//tr[@id = '11X5']//input[@class='input-qty input-qty-sfo numericenteronly']");
    By qRw14G5Loc = By.xpath("//tr[@id = '14G5']//input[@class='input-qty input-qty-sfo numericenteronly']");
    By qRw8K5Loc = By.xpath("//tr[@id = '8K5']//input[@class='input-qty input-qty-sfo numericenteronly']");
    By qRw11K5Loc = By.xpath("//tr[@id = '11K5']//input[@class='input-qty input-qty-sfo numericenteronly']");
    By qHarryTotalLoc = By.xpath("//li[contains(text(),'Harry')]/following::span[@class='total-qty stdPriceQty'][1]");
    By qJohnTotalLoc = By.xpath("//li[contains(text(),'John')]/following::span[@class='total-qty stdPriceQty'][1]");
    By qMichaelTotalLoc = By.xpath("//li[contains(text(),'Michael')]/following::span[@class='total-qty stdPriceQty'][1]");      //text
    By qSFORwTotalLoc = By.xpath("//span[@class='total-qty sfoSubTotalQty']");

    By pRw6S5Loc = By.xpath("//td[contains(text(),'1st')]/following::span[@class='value'][1]"); //text
    By pRw11X5Loc = By.xpath("//td[contains(text(),'Lucky')]/following::span[@class='value'][1]");
    By pRw14G5Loc = By.xpath("//td[contains(text(),'3rd')]/following::span[@class='value'][1]");
    By pRw8K5Loc = By.xpath("//a[contains(text(),'Best')]/following::span[@class='value'][1]");
    By pRw11K5Loc = By.xpath("//a[contains(text(),'Cece')]/following::span[@class='value'][1]");
    By pHarryTotalLoc = By.xpath("//li[contains(text(),'Harry')]/following::li[@class='std-total-price stdPriceTotal'][1]");
    By pJohnTotalLoc = By.xpath("//li[contains(text(),'John')]/following::li[@class='std-total-price stdPriceTotal'][1]");
    By pMichaelTotalLoc = By.xpath("//li[contains(text(),'Mich')]/following::li[@class='std-total-price stdPriceTotal'][1]");

    ///ZeroSFO
    By firstCheckOutButton = By.xpath("//button[@id='dwfrm_cart_checkoutCart']");
    By secondCheckOutButton = By.xpath("//div[@class='col promo-msg']//button[@class='button-text']");

    //
    By totalPriceHarryLoc = By.xpath("//li[@class='std-total-label' and contains(text(),'Harry T')]/following::li[@class='std-total-price stdPriceTotal'][1]");
    By totalQuantHarryLoc = By.xpath("//li[@class='std-total-label' and contains(text(),'Harry T')]/following::span[@class='total-qty stdPriceQty'][1]");
    By totalSFOPriceLoc = By.xpath("//li[@class='std-total-price sfoSubTotalPrice']");
    By totalSFOQuantityLoc = By.xpath("//span[@class='total-qty sfoSubTotalQty']");
    By crossSign11X5Loc = By.xpath("//tr[@id='11X5']//i[@class='fa fa-times-circle remove']");
    By yesButtonDelete11X5Loc = By.xpath("//tr[@id='11X5']//button[@class='grey removeYes']");

    double priceHarryTotalBefore = -1;
    String quantityHarryTotalBefore = "";
    double priceSFOTotalDoubleBefore = -1;
    String quantitySFOTotalBefore = "";

    public boolean correctSFOPriceNumNamesMult() {
        double priceSFO = getPriceNum(getText(priceTotalSFOLoc));
        double priceUp = getPriceNum(getText(priceSubTotalSFOLocUp));
        List<WebElement> howManyNamesRw = findElementsUsingFluentWait(howManyNames);
        int numberOfNames = howManyNamesRw.size();

        if (priceSFO==priceUp && numberOfNames==strIntoInt(getText(numSFOstudentLocUp))){
            return true;
        }else {
            return false;
        }
    }
    public boolean correctTotalPriceMult(){
        double totalPr6S5 = strIntoInt(getAttributeValue(qRw6S5Loc))*getPriceNum(getText(pRw6S5Loc));
        double totalPr14X5 = strIntoInt(getAttributeValue(qRw14G5Loc))*getPriceNum(getText(pRw14G5Loc));
        double totalPr11X5 = strIntoInt(getAttributeValue(qRw11X5Loc))*getPriceNum(getText(pRw11X5Loc));
        double totalPr8K5 = strIntoInt(getAttributeValue(qRw8K5Loc))*getPriceNum(getText(pRw8K5Loc));
        double totalPr11K5 = strIntoInt(getAttributeValue(qRw11K5Loc))* getPriceNum(getText(pRw11K5Loc));

        double totalPrHarrySubExp = totalPr6S5+totalPr11X5;
        double totalPrHarryActual = getPriceNum(getText(pHarryTotalLoc));
        double totalPrJohnSubExp = totalPr14X5;
        double totalPrJohnActual = getPriceNum(getText(pJohnTotalLoc));
        double totalPrMichSubExp = totalPr8K5+totalPr11K5;
        double totalPrMichActual = getPriceNum(getText(pMichaelTotalLoc));

        double totalPriceSFOExp = totalPr6S5+totalPr14X5+totalPr11X5 + totalPr8K5 + totalPr11K5;
        double totalPriceSFOAct = getPriceNum(getText(priceTotalSFOLoc));
        if (totalPriceSFOExp==totalPriceSFOAct && totalPrHarrySubExp==totalPrHarryActual
        && totalPrJohnSubExp==totalPrJohnActual && totalPrMichSubExp==totalPrMichActual) {
            return true;
        }else {
            return false;
        }
    }
    public boolean correctTotalQuantityMult(){
        int book6S5Q = strIntoInt(getAttributeValue(qRw6S5Loc));
        int book14G5Q = strIntoInt(getAttributeValue(qRw14G5Loc));
        int book11X5Q = strIntoInt(getAttributeValue(qRw11X5Loc));
        int book8K5Q = strIntoInt(getAttributeValue(qRw8K5Loc));
        int book11K5Q = strIntoInt(getAttributeValue(qRw11K5Loc));

        int totalQuantExp = book6S5Q+book14G5Q+book11X5Q + book8K5Q + book11K5Q;
        int totalQuantAct = strIntoInt(getText(qSFORwTotalLoc));

        int harryTotalExp = book6S5Q + book11X5Q;
        int harryTotalAct = strIntoInt(getText(qHarryTotalLoc));

        int johnTotalExp = book14G5Q;
        int johnTotalAct = strIntoInt(getText(qJohnTotalLoc));

        int michTotalExp = book8K5Q + book11K5Q;
        int michTotalAct = strIntoInt(getText(qMichaelTotalLoc));

        if (totalQuantExp==totalQuantAct && harryTotalExp==harryTotalAct && johnTotalExp==johnTotalAct
        && michTotalExp==michTotalAct) {
            return true;
        }else{
            return false;
        }
    }
    public boolean correctTotalQuantity(){
        int book6S5Q = strIntoInt(getAttributeValue(q6S5Loc));
        int book14G5Q = strIntoInt(getAttributeValue(q14G5Loc));
        int book11X5 = strIntoInt(getAttributeValue(q11X5Loc));
        int totalQuantExp = book6S5Q+book14G5Q+book11X5;
        int totalQuantAct = strIntoInt(getText(quantityTotalLoc));
        if (totalQuantExp==totalQuantAct) {
            return true;
        }else{
            return false;
        }
    }
    public boolean correctTotalPrice(){
        double totalPr6S5 = strIntoInt(getAttributeValue(q6S5Loc))*getPriceNum(getText(p6S5Loc));
        double totalPr14X5 = strIntoInt(getAttributeValue(q14G5Loc))*getPriceNum(getText(p14G5Loc));
        double totalPr11X5 = strIntoInt(getAttributeValue(q11X5Loc))*getPriceNum(getText(p11X5Loc));
        double totalPriceExp = totalPr6S5+totalPr14X5+totalPr11X5;
        double totalPriceAct = getPriceNum(getText(priceTotalLoc));
        if (totalPriceExp==totalPriceAct ) {
            return true;
        }else {
            return false;
        }
    }
    public boolean correctSFOPriceQuant() {
        double priceSFO = getPriceNum(getText(priceTotalSFOLoc));
        double priceUp = getPriceNum(getText(priceSubTotalSFOLocUp));
        int quantSFO = strIntoInt(getText(quantityTotalSFOLoc));
        if (priceSFO==priceUp && priceUp==getPriceNum(getText(priceTotalLoc))
        && quantSFO==strIntoInt(getText(quantityTotalLoc))){
            return true;
        }else {
            return false;
        }
    }
    public boolean correctNumOfNames() {
        List<WebElement> numOfSec = findElementsUsingFluentWait(nameSection);
        System.out.println(numOfSec +" numOfSec");
        int numOfSections = numOfSec.size();
        if (numOfSections==strIntoInt(getText(numSFOstudentLocUp))){
            return true;
        }else {
            return false;
        }
    }


    public void getTotalsBeforeDelete() {
        String price = getText(totalPriceHarryLoc);
        sleep();
        double priceNum = getPriceNum(price);
        System.out.println(priceNum + " price double");
        priceHarryTotalBefore = priceNum;

        String quantityHarryTot = getText(totalQuantHarryLoc);
        quantityHarryTotalBefore = quantityHarryTot;

        String priceSFOTotal = getText(totalSFOPriceLoc);
        sleep();
        double priceNumSFO = getPriceNum(priceSFOTotal);
        System.out.println(priceNumSFO + "price double SFO");
        priceSFOTotalDoubleBefore = priceNumSFO;

        String quantitySFOTot = getText(totalSFOQuantityLoc);
        quantitySFOTotalBefore = quantitySFOTot;
    }
    public boolean isTotalsChanged() {
        String price = getText(totalPriceHarryLoc);
        sleep();
        double priceNumAfter = getPriceNum(price);
        System.out.println(priceNumAfter + " price double after");


        String quantityHarryTotAfter = getText(totalQuantHarryLoc);

        String priceSFOTotalAfter = getText(totalSFOPriceLoc);
        sleep();
        double priceNumSFOAfter = getPriceNum(priceSFOTotalAfter);
        System.out.println(priceNumSFOAfter + "price double SFO after");

        String quantitySFOTotAfter = getText(totalSFOQuantityLoc);

        if (priceNumAfter==priceHarryTotalBefore && quantityHarryTotAfter.equalsIgnoreCase(quantityHarryTotalBefore)
        && priceNumSFOAfter==priceSFOTotalDoubleBefore && quantitySFOTotAfter.equalsIgnoreCase(quantitySFOTotalBefore)) {
            return true;
        } else {
            return false;
        }
    }


    public void clickFirstCheckOut (){
        clickThis(firstCheckOutButton);
        sleep();
    }
    public void clickSecondCheckOut (){
        clickThis(secondCheckOutButton);
        sleep();
    }
    public void crossSign11X5Click () {
        clickThis(crossSign11X5Loc);
    }
    public void yesDeleteButtonClick (){
        clickThis(yesButtonDelete11X5Loc);
        sleep();
    }



}
