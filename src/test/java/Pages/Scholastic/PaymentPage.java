package Pages.Scholastic;

import Pages.BasePage;
import org.openqa.selenium.By;

public class PaymentPage extends BasePage {
    By shipToMySchoolRadioLoc = By.xpath("//label[@for='checkboxShipToHome']//span[@class='custom-radio fa']");
    By paymentOptionDropLoc = By.xpath("//div[@class='selected-option']");
    By cCardPayOptionLoc = By.xpath("//li[@class='custom-option CREDIT_CARD']");
    By cardTypeDropLoc = By.xpath("//div[@class='custom-select credit']");
    By addNewCartPayOptionLoc = By.xpath("//li[@data-label='add a new card']");
    By cardNumberInputLoc = By.xpath("//input[@name='dwfrm_billing_paymentMethods_creditCard_number']");
    By cardMonthDropClick = By.xpath("//div[@data-required-text='Please Select a Month']//div[@class='selected-option input-select no-mouseflow required selected-active']");
    By cardMonth02Loc = By.xpath("//div[@data-required-text='Please Select a Month']//li[@data-label='02']");
    By cardYearDropLoc = By.xpath("//div[@data-required-text='Please Select a Year']//div[@class='selected-option input-select no-mouseflow required selected-active']");
    By cardYear2023Loc = By.xpath("//select[@id='dwfrm_billing_paymentMethods_creditCard_year']/following::li[@data-label='2023']");
    By cardSecurCodeLoc= By.xpath("//input[@id='dwfrm_billing_paymentMethods_creditCard_cvn']");
    By cardFirstNameLoc = By.xpath("//input[@name='dwfrm_billing_billingAddress_addressFields_firstName']");
    By cardLasrNameLoc = By.xpath("//input[@name='dwfrm_billing_billingAddress_addressFields_lastName']");
    By cardAddressLoc = By.xpath("//input[@name='dwfrm_billing_billingAddress_addressFields_address1']");
    By cardZipLoc = By.xpath("//input[@name='dwfrm_billing_billingAddress_addressFields_postal']");
    By cardPhoneLoc = By.xpath("//input[@name='dwfrm_billing_billingAddress_addressFields_phone']");
    By continueCheckOutButtonLoc = By.xpath("//button[@id='billingContinueButton']");
    By submitOrderLoc = By.xpath("//div[@class='order-summary-footer']//button[@name='dwfrm_summary_submitOrder'][1]");
    By thankYouLoc = By.xpath("//div[@class='col order-instruction']//h2");
    By referenceLoc = By.xpath("//div[@class='sec-info-module sec-rco-content cart-section-header']//h2//b");
    String thankYouMessage = "Thank You for Your Order!";
    String referenceMessage = "ORDER RECEIPT REFERENCE #";
    public void shipToMySchoolRadioClick () {
        clickThis(shipToMySchoolRadioLoc);
        sleep();
    }
    public void paymentOptionClick () {
        clickThis(paymentOptionDropLoc);
        sleep();
    }
    public void cCardPayOptionClick () {
        clickThis(cCardPayOptionLoc);
        sleep();
    }
    public void cardTypeDropClick () {
        clickThis(cardTypeDropLoc);
        sleep();
    }
    public void addNewCartPayOptionClick () {
        clickThis(addNewCartPayOptionLoc);
        sleep();
    }
    public void cardNumEnter (String data) {
        type(cardNumberInputLoc, data);
        sleep();
    }
    public void cardMonthChoose () {
        clickThis(cardMonthDropClick);
        sleep();
        clickThis(cardMonth02Loc);
        sleep();
    }
    public void cardYearChoose () {
        clickThis(cardYearDropLoc);
        sleep();
        clickThis(cardYear2023Loc);
        sleep();
    }
    public void cardSecCodeEnter (String code) {
        type(cardSecurCodeLoc, code);
        sleep();
    }
    public void cardFirstNameEnter (String fname) {
        type(cardFirstNameLoc, fname);
        sleep();
    }
    public void cardLastNameEnter (String lname) {
        type(cardLasrNameLoc, lname);
        sleep();
    }
    public void cardAddressEnter (String address) {
        type(cardAddressLoc, address);
        sleep();
    }
    public void cardZipEnter (String zip) {
        type(cardZipLoc, zip);
        sleep();
    }
    public void cardPhoneEnter (String phone) {
        type(cardPhoneLoc, phone);
        sleep();
    }
    public void cardContinueCheckOutClick () {
        clickThis(continueCheckOutButtonLoc);
        sleep();
    }
    public void submitOrderClick (){
        clickThis(submitOrderLoc);
        sleep();
    }
    public boolean isMessagesDisplayed () {
       if( isElementDisplayed(thankYouLoc) ==true && isElementDisplayed(referenceLoc)==true) {
           return true;
       }else{
           return false;
       }
    }


}
