package StepDefinition.Scholastic;

import Pages.Scholastic.CheckOutPage;
import Pages.Scholastic.MyAccountPage;
import Pages.Scholastic.RewardScreen;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class ZeroTaxSFOSD {
    CheckOutPage cpage = new CheckOutPage();
    RewardScreen rpage = new RewardScreen();
    MyAccountPage apage = new MyAccountPage();

    @Then("^I change quantity for 6S5 book to '(.+)'$")
    public void enterQuantFor6S5(String num){
        apage.enterQuantFor6S5(num);
    }
    @And("^I change quantity for 11X5 book to '(.+)'$")
    public void enterQuantFor11X5(String num) {
        apage.enterQuant11X5(num);
    }
    @And("^I change quantity for 14G5 book to '(.+)'$")
    public void enterQuantFor14G5(String num) {
        apage.enterQuant14G5(num);
    }
    @And("^I change quantity for 42J4 book to '(.+)'$")
    public void enterQuantFor42J4(String num) {
        apage.enterQuant42J4(num);
    }
    @And("^I change quantity for 34B4 book to '(.+)'$")
    public void enterQuantFor34B4(String num) {
        apage.enterQuant34B4(num);
    }

    @Then("^I click 'Proceed to Checkout' button$")
    public void firstCheckOutClick(){
        cpage.clickFirstCheckOut();
    }
    @And("^I click 'Proceed to checkout' button again$")
    public void secondCheckOutClick(){
        cpage.clickSecondCheckOut();
    }
    @Then("^I verify zero tax benn applied to SFO order$")
    public void verifyZeroTaxApplied (){
        Assert.assertTrue(rpage.isTaxEqualsZero(), "Tax amount is not equal zero");
    }

}
