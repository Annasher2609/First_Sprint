package StepDefinition.Scholastic;

import Pages.Scholastic.CheckOutPage;
import Pages.Scholastic.MyAccountPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class AddMultBooksSFOSD {
    MyAccountPage apage = new MyAccountPage();
    CheckOutPage cpage = new CheckOutPage();

    String stuNameAdded = "";

    List<String> itemsNumAdded = new ArrayList<>();
    String stuBookQAdded6S5 ="";
    String stuBookQAdded11X5 ="";
    String stuBookQAdded14G5 ="";

    @And("^I put student Name '(.+)'$")
    public void enterStuNameSFO(String name){
        stuNameAdded= name;
        apage.enterStuNameSFO(name);
    }
    @And("^I put '(.+)' for item number$")
    public void enterItemNumSFO(String number){
        itemsNumAdded.add(number);
        System.out.println(itemsNumAdded);
        apage.enterItemNumSFO(number);
    }
    @And("^I change quantity for the first book 6S5 to '(.+)'$")
    public void changeQuantFirstBook(String num) {
        stuBookQAdded6S5 = num;
        System.out.println(num + "firstquantity");
        apage.bookQuanFirstSFO(num);
    }
    @And("^I change quantity for the second book 11X5 to '(.+)'$")
    public void changeQuantSecBook(String num) {
        stuBookQAdded11X5=num;
        System.out.println(num + "sec quantity");
        apage.bookQuanSecondSFO(num);
    }
    @And("^I change quantity for the third book 14G5 to '(.+)'$")
    public void changeQuantThirdBook(String num) {
        stuBookQAdded14G5=num;
        System.out.println(num + " third quantity");
        apage.bookQuanThirdSFO(num);
    }
   @Then("^I verify correct student name, item number and quantity gets added under SFO$")
    public void verifyCorrectNameItemQuantityStudent(){
      Assert.assertTrue(apage.correctNames(stuNameAdded),"Name in not displayed correct" );
      Assert.assertTrue(apage.correctItemNumbers(itemsNumAdded.get(0), itemsNumAdded.get(1), itemsNumAdded.get(2)), "Item numbers are not displayed correct");
      Assert.assertTrue(apage.correctQuantities(stuBookQAdded6S5,stuBookQAdded11X5,stuBookQAdded14G5),"Bok quantities are not displayed correct");
    }
    @And("^I click 'Review Order' button$")
    public void clickingReviewOrderButton(){
        apage.clickReviewOrderButton();
    }
    @Then ("^I verify Student-total amount, items and quantity and SFO-total is correct$")
    public void verifyCorrectStudentTotalSFOTotal() {
        Assert.assertTrue(cpage.correctTotalQuantity(),"Total quantity is not displayed correct");
        Assert.assertTrue(cpage.correctTotalPrice(),"Total price is not displayed correct");
        Assert.assertTrue(cpage.correctSFOPriceQuant(), "SFO quantity or price is not displayed correct");
        Assert.assertTrue(cpage.correctNumOfNames(),"Number of names is npt displayed correct");
    }


}
