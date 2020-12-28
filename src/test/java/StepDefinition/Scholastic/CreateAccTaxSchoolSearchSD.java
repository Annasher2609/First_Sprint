package StepDefinition.Scholastic;

import Pages.Scholastic.LandingPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class CreateAccTaxSchoolSearchSD {
    LandingPage lpage = new LandingPage();
    @Then("^I click 'SEARCH BY STATE AND CITY STATE'$")
    public void schSearchBoxClicking (){
        lpage.scholSearchBoxClick();
    }
    @And("^I choose '(New York)' state$")
    public void schSearchChooseState (String state){
        lpage.chooseStateForSchoolSearch(state);
    }
    @Then("^I choose '(New York)' in 'CITY'$")
    public void schSearchChooseCity (String city){
        lpage.schSearchChoseCity(city);
    }
    @And("^I click 'Search' for school$")
    public void schSearchClickSearchBut(){
        lpage.schSearchSearchButtonClick();
    }
}
