package StepDefinition.Scholastic;

import Pages.Scholastic.MyAccountPage;
import Pages.Scholastic.RewardScreen;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class ZeroTaxSFOYTONonTaxStateSD {
    MyAccountPage apage = new MyAccountPage();
    RewardScreen rpage = new RewardScreen();


    @Then("^I verify tax amount equals zero$")
    public void verifyNonZeroTaxSFOYTO() {
        Assert.assertTrue(rpage.isTaxEqualsZero(), "Tax amount is not equal zero");
    }
}
