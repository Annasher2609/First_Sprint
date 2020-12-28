package StepDefinition.Scholastic;

import Pages.Scholastic.MyAccountPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class ErrorForInvNumSfoSD {
    MyAccountPage apage = new MyAccountPage();
   String expectedErrorSFO = "Please enter a valid item number.";

    @And("^I go to 'Enter Orders'$")
    public void clickingEnterOrders(){
        apage.clickEnterOrders();
    }
    @And("^I select 'Student Flyer Orders'$")
    public void clickingSFO(){
        apage.clickSFOLink();
    }
    @And("^I enter student Name '(.+)'$")
    public void enterStuNameSFO(String name){
        apage.enterStuNameSFO(name);
    }
    @And("^I enter '(.+)' for item number$")
    public void enterItemNumSFO(String number){
        apage.enterItemNumSFO(number);
    }
    @And("^I click on ADD button$")
    public void clicingAddButtonSFO() {
        apage.clickAddButtonSFO();
    }
    @Then("^I verify 'Please enter a valid item number' error message is displayed$")
    public void verifyExpectedErrorMesDisplayed () {
        Assert.assertTrue(apage.isErrorMesDisplayedSFO(expectedErrorSFO), "Different message is displayed");
    }



}
