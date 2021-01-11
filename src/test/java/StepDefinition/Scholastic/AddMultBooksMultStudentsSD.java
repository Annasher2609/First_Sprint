package StepDefinition.Scholastic;

import Pages.Scholastic.CheckOutPage;
import Pages.Scholastic.MyAccountPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class AddMultBooksMultStudentsSD {
    MyAccountPage apage = new MyAccountPage();
    CheckOutPage cpage = new CheckOutPage();
    List<String> names = new ArrayList<>();
    List<String> items = new ArrayList<>();
    List<String> quantities = new ArrayList<>();

    @And("^I type student Name '(.+)'$")
    public void enterStuNameSFO(String name){
        names.add(name);
        apage.enterStuNameSFO(name);
    }
    @And("^I type '(.+)' for item number$")
    public void enterItemNumSFO(String number){
        items.add(number);
        apage.enterItemNumSFO(number);
    }
    @And("^I change quantity for book 6S5 to '(.+)'$")
    public void changeQuantFirstBook(String num) {
        quantities.add(num);
        apage.bookQuanFirstSFO(num);
    }
    @And("^I change quantity for book 11X5 to '(.+)'$")
    public void changeQuantSecBook(String num) {
        quantities.add(num);
        apage.bookQuanSecondSFO(num);
    }
    @And("^I change quantity for book 14G5 to '(.+)'$")
    public void changeQuantThirdBook(String num) {
        quantities.add(num);
        apage.bookQuanThirdSFO(num);
    }
    @And("^I change quantity for the forth book 8K5 to '(.+)'$")
    public void enter8K5Q (String num) {
        quantities.add(num);
        apage.enter8K5Q(num);
    }
    @And("^I change quantity for the fifth book 11K5 to '(.+)'$")
    public void enter11K5Q (String num) {
        quantities.add(num);
        apage.enter11K5Q(num);
    }
    @Then("^I verify correct student names, item numbers and quantities get added under SFO$")
    public void correctNamesItems() {
        System.out.println(names);
        Assert.assertTrue(apage.correctNamesMult(names),"Names are not displayed correct");
        System.out.println(items);
        Assert.assertTrue(apage.correctItemNumbersMult(items),"Items are not displayed correct");
        System.out.println(quantities);
        Assert.assertTrue(apage.correctQuantitiesMult(quantities),"Quantities are not displayed correct");
    }
    @Then("^I verify Student-total amounts, items and quantities and SFO-total is correct$")
    public void correctSFOAmountMult (){
        Assert.assertTrue(cpage.correctTotalQuantityMult(), "Quantities are not displayed correct");
        Assert.assertTrue(cpage.correctTotalPriceMult(),"Total prices are not displayed correct");
        Assert.assertTrue(cpage.correctSFOPriceNumNamesMult(),"Number of student and SFO prices are not displayd correct");
    }
    @And ("^I scroll down '(.+)' pixels$")
    public void scrollingDown (int pixels) {
        apage.scrollingDown(pixels);
    }
}
