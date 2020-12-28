package StepDefinition.Scholastic;

import Pages.Scholastic.MyAccountPage;
import cucumber.api.java.cy_gb.A;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class YTOByFlyerJumperSD {
    MyAccountPage apage = new MyAccountPage();
    @And("^I select 'Your Teacher Order'$")
    public void clickYTO(){
        apage.clickYTO();
    }
    @And("^I go to 'By Flyer' tab$")
    public void clickingByFlyers(){
        apage.clickByFlyers();
    }
    @And("^I click on Price-QTY box$")
    public void clickingPriceQuantBox(){
        apage.clickPriceQuantBox();
    }
    @Then("^I verify jumper is displayed$")
    public void verifyIsJumperDisplayed() {
        Assert.assertTrue(apage.isJumperDisplayed(),"Jumper is not displayed");
    }
    @And ("^I enter '(.+)' in the clicked Price-QTY box$")
    public void enteringInPriceQtyBox(String data){
        apage.enterInPriceQuantBox(data);
    }
    @And ("^I click on X on the jumper$")
    public void closeJumper() {
    apage.closingJumper();
    }
    @Then("^I click on another Price-QTY box$")
    public void clickingAnotherPrQuanBox(){
        apage.clickAnotherPrQuanLoc();
    }

}
