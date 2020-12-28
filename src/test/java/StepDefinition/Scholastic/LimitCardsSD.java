package StepDefinition.Scholastic;

import Pages.Scholastic.LandingPage;
import Pages.Scholastic.MyAccountPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class LimitCardsSD {
    LandingPage lpage = new LandingPage();
    MyAccountPage apage =new MyAccountPage();

    @When("^I click on 'Sing In'$")
    public void signIn() {
        lpage.signingIn();
    }
    @And("^I enter '(.+)' email")
    public void signInEmail (String email) {
        lpage.loginEnterEmail(email);
    }
    @And("^I enter '(.+)' password")
    public void signInPassword (String password) {
        lpage.logInEnterPassword(password);
    }
    @And("^I click 'Sign In' button$")
    public void clickingSignIn() {
        lpage.clickSignIn();
    }
    @Then("^I am on a new page and I close notification$")
    public void notificationClosing() {
        apage.closeNotification();
    }
    @And("^I click on 'My Account'$")
    public void myAccountClick(){
        apage.clickMyAccount();
    }
    @And("^I click 'Payments Methods'$")
    public void payMethodsClick() {
        apage.clickPayMethods();
    }
    @Then("^I click 'Add Card'$")
    public void addCardClick(){
        apage.clickAddCard();
    }
    @And("^I enter card number '(.+)'$")
    public void addCardNumber (String number){
        apage.enterCardNumber(number);
    }
    @And("^I click 'Month'$")
    public void monthCardClick (){
        apage.clickMonthCc();
    }
    @And("^I choose '02'$")
    public void monthExpFeb() {
        apage.chooseExpMonthFeb();
    }
    @Then ("^I click 'Year'$")
    public void yearCardClick() {
        apage.clickExpYearBox();
    }
    @And("^I choose '2022'$")
    public void yearCrdChoose22() {
        apage.chooseExpYear22();
    }
    @Then("^I enter security code '(.+)'$")
    public void securCodeEnter(String code){
        apage.enterSecurCode(code);
    }
    @Then("^I enter first name '(.+)'")
    public void firstNameCardEnter (String fname){
        apage.enterFirstNameCard(fname);
    }
    @And("^I enter last name '(.+)'$")
    public void lastNameCardEnter (String lname) {
        apage.enterLastNameCard(lname);
    }
    @Then("^I enter address '(.+)'$")
    public void addressOneEnterCard (String addressOne) {
        apage.addressOneCardEnter(addressOne);
    }
    @And("^I enter zip code '(.+)'$")
    public void zipCodeCardEnter (String zip) {
        apage.enterZipCard(zip);
    }
    @And("^I enter '(.+)' phone number$")
    public void phoneCardEntering (String phone) {
        apage.enterPhoneCard(phone);
    }
    @Then("^I click 'Save' button$")
    public void saveButtonNewCardClick () {
        apage.saveCardButtonClick();
    }
    @And("^I click 'Add Card' link$")
    public void addForthCardClickLink(){
        apage.addForthCardClick();
    }
    @Then ("^I can see 'You can only store three credit cards' message$")
    public void verifyMessageThreeCardsDisplayed() {
        Assert.assertTrue(apage.isDisplayedOnlyThreeCards(),"The message is not displayed");
    }
}
