package StepDefinition.Scholastic;

import Pages.Scholastic.CheckOutPage;
import Pages.Scholastic.MyAccountPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class DeleteFromCartPageSD {
    MyAccountPage apage = new MyAccountPage();
    CheckOutPage cpage = new CheckOutPage();

    @Then ("^I capture amounts of quantities and prices$")
    public void amountsBefore() {
        cpage.getTotalsBeforeDelete();
    }
    @Then("^I click 'cross sign' for 11X5$")
    public void crossSignFor11X5Clicking () {
        cpage.crossSign11X5Click();
    }
    @And("^I click 'YES' to delete 11X5$")
    public void clickYesToDelete11X5() {
        cpage.yesDeleteButtonClick();
    }
    @Then ("^I verify that quantity and price amounts changed$")
    public void verifyQuantityAndPriceChangedAfterDelete(){
        Assert.assertFalse(cpage.isTotalsChanged(), "Total amounts are not displayed correct");
    }
}
