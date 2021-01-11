package StepDefinition.Scholastic;

import Pages.Scholastic.PaymentPage;
import Pages.Scholastic.RewardScreen;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class PlacingOrderByAddingCardSD {
   RewardScreen rpage = new RewardScreen();
   PaymentPage ppage = new PaymentPage();

    @And("^I click 'Ship to My School' radio-button$")
    public void shipToMySchoolRadioClicking () {
        ppage.shipToMySchoolRadioClick();
    }
    @Then("^I click 'Continue Checkout' button$")
    public void continueCheckOutClicking (){
       rpage.contCheckOutButtonClick();
    }
    @And("^I click on 'Select Payment Method' box$")
    public void selectPayMethodClick(){
        ppage.paymentOptionClick();
    }
    @And ("^I choose 'Credit Card' option$")
    public void chooseCreditCardPayOption () {
        ppage.cCardPayOptionClick();
    }
    @Then("^I click on 'Card Type' box$")
    public void cartTypeBoxClick () {
        ppage.cardTypeDropClick();
    }
    @And("^I choose 'Add a New Card' option$")
    public void addNewCardOptionClick (){
        ppage.addNewCartPayOptionClick();
    }
    @Then ("^I type card number '(.+)'$")
    public void enterCardNumberCheckOut(String number){
        ppage.cardNumEnter(number);
    }
    @And("^I choose '02' as an expiration month$")
    public void chooseMonthExpCard () {
        ppage.cardMonthChoose();
    }
    @And("^I choose '2023' as an expiration year$")
    public void chooseYearExpCard () {
        ppage.cardYearChoose();
    }
    @And("^I type security code '(.+)'$")
    public void enterSecurityCode(String code) {
        ppage.cardSecCodeEnter(code);
    }
    @Then("^I enter '(.+)' as first name$")
    public void enterFirstName (String name){
        ppage.cardFirstNameEnter(name);
    }
    @And("^I enter '(.+)' as a last name after$")
    public void enterLastName (String name) {
        ppage.cardLastNameEnter(name);
    }
    @And("^I enter '(.+)' as an address$")
    public void enterAddress(String data) {
        ppage.cardAddressEnter(data);
    }
    @And("^I enter '(.+)' as a zip code$")
    public void enterZip (String zip){
        ppage.cardZipEnter(zip);
    }
    @And ("^I enter '(.+)' as a phone number$")
    public void enterPhone (String phone) {
        ppage.cardPhoneEnter(phone);
    }
    @Then ("^I click 'Continue CheckOut'$")
    public void clickContinueCheckOut (){
        ppage.cardContinueCheckOutClick();
    }
    @And ("^I click 'Submit Order'$")
    public void clickSubmitOrder () {
        ppage.submitOrderClick();
    }
    @Then("^I verify conformation of order is displayed$")
    public void isConformationDisplayed(){
        Assert.assertTrue(ppage.isMessagesDisplayed(), "Conformation of order is not displayed");
    }


}
