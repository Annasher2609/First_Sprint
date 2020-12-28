package StepDefinition.Scholastic;

import Pages.Scholastic.LandingPage;
import Pages.Scholastic.MyAccountPage;
import Pages.Scholastic.MyLists;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class AddBooksInRecommendationsSD {
    LandingPage lpage = new LandingPage();
    MyAccountPage apage =new MyAccountPage();
    MyLists mlpage = new MyLists();
    String bookTitle="";

    @And("^I close 'Place an Order' notification$")
    public void closePlaceOrderNotification(){
        apage.closeNotifPlaceAnOrder();
    }
    @And("^I enter in search '(.+)'$")
    public void enterInSearch (String data){
        bookTitle=data;
        apage.typeInSearchBox(data);
    }
    @And("^I click 'Search' button on Account Page$")
    public void clickingSearchOnAccountPage() {
        apage.clickSearchButton();
    }

    @And("^I click on 'Harry Potter and the Deathly Hollows'$")
    public void harryClick (){
        apage.clickHarryDeathlyQuick();
    }
    @And("^I click on 'Harry Potter and the Deathly Hallows' Quick Look$")
    public void clickQuickLookHarryDeathlyHollows () {
        apage.clickHarryDeathlyQuick();
    }
    @And("^I click 'Recommend'$")
    public void clickRecommendBox() {
        apage.clickAddToRecommended();
    }
    @And ("^I click 'Recommendations For Students' box$")
    public void clickRecommendedForStudentsBox() {
        apage.clickRecomForStudents();
    }
    @And ("^I close 'Add to My Lists' window$")
    public void closeAddToMyListsWindow() {
        apage.closeRecomWindow();
    }
    @And ("^I click 'My Lists' link$")
    public void clickMyListsLink() {
        apage.clickMyLists();
    }
    @And ("^I click 'Recommendations For Students' option$")
    public void clickRecommendForStudents() {
        apage.clickRecomForStudentsList();
    }

    @And ("^I get title of the book from 'My Lists' page$")
    public void getTitleFromMyLists(){
        mlpage.getBookTitleFromMyLists();
    }
    @Then("^I verify the right book was added$")
    public void isBookRight(){
        Assert.assertTrue(apage.isStringContainsString(mlpage.getBookTitleFromMyLists(), bookTitle), "Wrong book added");
    }
}
