package StepDefinition.Scholastic;

import Pages.Scholastic.MyAccountPage;
import Pages.Scholastic.RewardScreen;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class NonZeroTaxSFOYTOSD {
    MyAccountPage apage = new MyAccountPage();
    RewardScreen rpage = new RewardScreen();

@Then("^I add '(.+)' in a quantity box for the book$")
    public void addingYTO(String number) {
    apage.addYTO(number);
}
@And("^I click 'Review Cart' button$")
    public void reviewCartClick(){
    apage.reviewCartButtonClick();
}
@Then("^I verify tax amount is a non-zero number$")
    public void verifyNonZeroTaxSFOYTO () {
    Assert.assertFalse(rpage.isTaxEqualsZero(), "Tax amount equals zero");

}

}
