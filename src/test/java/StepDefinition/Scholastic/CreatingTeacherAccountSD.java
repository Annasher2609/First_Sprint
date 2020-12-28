package StepDefinition.Scholastic;

import Pages.Scholastic.LandingPage;
import Pages.Scholastic.MyAccountPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class CreatingTeacherAccountSD {
    LandingPage lpage = new LandingPage();
    MyAccountPage apage = new MyAccountPage();
    String classCodeExp ="";
    String firstName = "";
    String lastName = "";

    @When("^I click on 'Create an Account' button$")
    public void clickingCreateAccButton () {
        lpage.clickCreateAccount();
    }
    @And("^I choose 'Teacher/Administrator/Homeschooler' option$")
    public void choosingTheacherAccOption () {
        lpage.selectTeacherAccount();
    }
    @And("^I click 'Next' button$")
    public void clickingNext() {
        lpage.clickNextButton();
    }
    @And("^I enter 'Mr.' as a title$")
    public void selectTitleForAcc () {
        lpage.selectTitle();
    }
    @And("^I enter '(.+)' as a first name$")
    public void enterFirstName (String fname) {
        firstName=fname;
        lpage.enterFirstName(fname);
    }
    @And ("^I enter '(.+)' as a last name$")
    public void enterLastName(String lname) {
        lastName=lname;
        lpage.enterLastName(lname);
    }
    @And ("^I enter '(.+)' as an email$")
    public void enteringProfileEmail(String email) {
        lpage.enterProfileEmail(email);
    }
    @And ("^I enter '(.+)' as a password$")
    public void enteringProfilePassword(String password) {
        lpage.enterProfilePassword(password);
    }
    @And("^I click 'Terms of use' box$")
    public void clickTermsButton() {
        lpage.clickTermsTeacherButton();
    }
    @And("^I click 'Next' button to submit teacher's data$")
    public void clickNextButtonTechProfile() {
        lpage.clickNextConfirmTeachProf();
    }
    @And ("^I enter '(.+)' as a zipcode$")
    public void enteringZipCode(String zipCode) {
        lpage.enterZipCode(zipCode);
    }
    @And ("^I click 'Search' button$")
    public void clickingSearchForSchool () {
        lpage.clickSearchSchoolButton();
    }
    @And ("^I pick '(.+)' in a school name dropdown")
    public void chooseSchoolAutosuggestions (String data) {
        lpage.chooseSchool(data);
    }
    @And("^I click 'Next' button to submit school$")
    public void clickNextToSubmitSchool() {
        lpage.clickSubmitSchool();
    }
    @Then(("^I click 'Select Role'$"))
    public void roleDropClicking(){
        lpage.roleDropClick();
    }
    @And ("^I pick 'Teacher 'by Grade' option$")
    public void roleTeacherByGradeChoose(){
        lpage.roleTeacherByGradeClick();
    }
    @Then(("^I click 'Grade'$"))
    public void gradeBoxClicking() {
        lpage.gradeBoxClick();
    }
    @And ("^I pick '(.+)' as a grade$")
    public void gradeFromAuto(String grade){
        lpage.gradeChooseFromAuto(grade);
    }
    @And ("^I enter '(.+)' as a number of students$")
    public void numStudEnter(String number){
        lpage.numberStudensEnter(number);
    }
    @And("^I click 'Next' to submit$")
    public void nextButClickTeachAcc(){
        lpage.nextButtonTeachAccClick();
    }
    @And("^I click 'Preferred Reading Level System'$")
    public void readLevDropClick(){
        lpage.readingLevelDropClick();
    }
    @And("^I pick '(Guided Reading Level) 'GRL''$")
    public void readLevelPickFromAuto(String level){
        lpage.readLevelPick(level);
    }
    @And("^I click 'Continue to site' button$")
    public void continToSiteClick (){
        lpage.continueToSiteButClick();
    }
    @And("^I see a class code on an opened Home Page$")
    public void classCodeFromMyAccTeach(){
        classCodeExp = apage.classCodeMyAccTeachProfText();
    }
    @And("^I select 'Profile'$")
    public void profileMyAccClick() {
        apage.profileClick();
    }
    @Then("^I verify the class codes on My Account page are the same$")
    public void verifyClassCodesTheSameTechAcc() {
        Assert.assertTrue(apage.isSecondClassCodeTheSame(classCodeExp),"Codes are not the same");
    }
    @And("^I verify the name displayed on My Account page and the one that was entered are the same$")
    public void verifyNameDisplayedCorrectly(){
        Assert.assertTrue(apage.isNameDisplayedCorrect(firstName,lastName),"Name is displayed incorrectly");
    }










}
