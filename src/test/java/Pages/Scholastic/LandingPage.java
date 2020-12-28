package Pages.Scholastic;

import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class LandingPage extends BasePage {

    By createAccountButton = By.linkText("Create an Account");
    By teacherAccountButton = By.xpath("//label[@for='acccountTeacther']");
    By nextButton = By.xpath("//a[@class='button-next']");
   // By titleDropdown = By.xpath("//div[contains(text(),'Title')]");
    By titleBox = By.xpath("//div[@class='selected-option input-select profile-title required']");
    By titleAutosuggestions= By.xpath("//li[@class='custom-option select-option']");
    By mrBox = By.xpath("//li[@data-label='mr.']//span[starts-with(text(),'Mr')]");

    By firstNameBox = By.xpath("//input[@id='dwfrm_profile_customer_firstname']");
    By lastNameBox = By.id("dwfrm_profile_customer_lastname");
    By emailBox = By.id("dwfrm_profile_customer_email");
    By passwordBox = By.id("dwfrm_profile_login_password");
    By termsTeacherButton = By.id("dwfrm_registration_termsofuseteacher");
    By nextConfirmProfileButton = By.xpath("//button[@name='dwfrm_profile_confirm']");
    By zipCodeBox = By.id("dwfrm_myschool_schoolzip");
    By searchSchoolButton = By.xpath("//button[@name='dwfrm_myschool_search']");
    By schoolSearchBox = By.id("dwfrm_searchschool_schoolvalue");
    By autosugSchools = By.xpath("//span[@class='ui-menu-item-wrapper']");
    By schoolLocator = By.xpath("//span[@id='ui-id-925']");
    By nextSubmitSchool = By.xpath("//button[@class='next-button button-continue school-search']");
    By roleDropLocator = By.xpath("//div[@class='custom-select']//div[@class='selected-option input-select primaryrole required' and contains(text(),'Select')]");
    By roleTeacherByGradeLoc = By.xpath("//div[@class='custom-scrollbar']//span[contains(text(),'Grade')]");
    By gradeBoxLocator = By.xpath("//div[@class='selected-option input-select noscroll']");
    By gradesAutogus = By.xpath("//div[@class='selection-list visible']//li[@class='custom-option select-option']");
    By nextButtonTeachAcc = By.xpath("//button[@name='dwfrm_myrole_findgrade']");
    By readingLevelDropLoc = By.xpath("//div[@class='selected-option input-select required']");
    By readLevAutoLoc = By.xpath("//div[@class='selection-list visible']//li[@class='custom-option select-option']");
   By continueToSiteButton = By.xpath("//button[@name='dwfrm_profileselection_confirmed']");
    //number cc
    By signInLink = By.linkText("Sign In");
    By logInEmailBox = By.xpath("//input[@name='dwfrm_login_username']");
    By logInPasswBox = By.xpath("//input[@type='password' and @id='dwfrm_login_password']");
    By signInButton = By.xpath("//button[@class='home-page-login-btn  sign-in-mod']");
    By numberStudentsBox = By.xpath("//input[@id='dwfrm_myrole_students']");
    //schoolsearch
    By schoolSearchBoxLoc = By.xpath("//div[@class='selected-option input-select']");
    By schSearchStatesAutosugLoc =By.xpath("//select[@id='dwfrm_myschool_accountstates']//option[@class='select-option']");
    By schSearchCityBoxLoc = By.xpath("//input[@id='dwfrm_myschool_schoolcity']");
    By schSearchCityNewYorkLoc = By.xpath("//span[@class='auto-matches']/preceding::span[@id='ui-id-24439']//span[@class='auto-matches']");
    By schSearchSearchButtonLoc = By.xpath("//button[@name='dwfrm_myschool_searchone']");
    By schSearchSchoolNameBoxLoc = By.xpath("//input[@id='dwfrm_searchschool_schoolvalue']");


    public void clickCreateAccount () {
        clickThis(createAccountButton);
        sleep();
    }
    public void selectTeacherAccount() {
        clickThis(teacherAccountButton);
        sleep();
    }
    public void clickNextButton () {
        clickThis(nextButton);
        sleep();
    }
    public void selectTitle () {
        clickThis(titleBox);
        sleep();
        clickThis(mrBox);
    }
    public void enterFirstName (String data) {
        type(firstNameBox,data);
        sleep();
    }
    public void enterLastName (String data) {
        type(lastNameBox,data);
    }
    public void enterProfileEmail (String data) {
        type(emailBox,data);
    }
    public void enterProfilePassword (String data) {
        type(passwordBox,data);
    }
    public void clickTermsTeacherButton() {
        clickThis(termsTeacherButton);
        sleep();
    }
    public void clickNextConfirmTeachProf() {
        clickThis(nextConfirmProfileButton);
        sleep();
    }
    public void enterZipCode(String data) {
        type(zipCodeBox,data);
    }
    public void clickSearchSchoolButton (){
        clickThis(searchSchoolButton);
        sleep();
    }

    public void chooseSchool(String schoolName) {
        String cutSchoolName = schoolName.substring(0,schoolName.length()-1);
        sleep();
        type(schoolSearchBox,cutSchoolName);
        sleep();
        sleep();
        choosingFromSuggestions(autosugSchools,schoolName);
        sleep();
    }
    public void clickSubmitSchool() {
        clickThis(nextSubmitSchool);
    }
    public void roleDropClick(){
        clickThis(roleDropLocator);
    }
    public void roleTeacherByGradeClick(){
        clickThis(roleTeacherByGradeLoc);
    }
    public void gradeBoxClick(){
        clickThis(gradeBoxLocator);
        sleep();
    }
    public void gradeChooseFromAuto(String grade){
        choosingFromSuggestions(gradesAutogus, grade);
        sleep();
    }
    public void numberStudensEnter(String number){
        type(numberStudentsBox, number);
        sleep();
    }
    public void nextButtonTeachAccClick (){
        clickThis(nextButtonTeachAcc);
    }
    public void readingLevelDropClick(){
        clickThis(readingLevelDropLoc);
        sleep();
    }
    public void readLevelPick (String level) {
        choosingFromSuggestionsContains(readLevAutoLoc, level);
        sleep();
    }
    public void continueToSiteButClick(){
        clickThis(continueToSiteButton);
        sleep();
    }

    public void signingIn () {
        clickThis(signInLink);
    }
    public void loginEnterEmail (String email) {
        type(logInEmailBox, email);
    }
    public void logInEnterPassword(String password) {
        type(logInPasswBox, password);
    }
    public void clickSignIn () {
        clickThis(signInButton);
        sleep();

    }

    public void scholSearchBoxClick(){
        clickThis(schoolSearchBoxLoc);
        sleep();
    }
    public void chooseStateForSchoolSearch(String state){
        choosingFromSuggestions(schSearchStatesAutosugLoc, state);
        sleep();
    }
    public void schSearchChoseCity(String city){
        clickThis(schSearchCityBoxLoc);
        sleep();
        type(schSearchCityBoxLoc, city);
        sleep();
        clickThis(schSearchCityNewYorkLoc);
        sleep();
    }
    public void schSearchSearchButtonClick(){
        clickThis(schSearchSearchButtonLoc);
        sleep();
    }
    public void schSearchTypeSchoolName (String name) {
        type(schSearchSchoolNameBoxLoc, name);
        sleep();
    }








}
