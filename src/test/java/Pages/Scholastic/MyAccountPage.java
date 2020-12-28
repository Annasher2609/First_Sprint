package Pages.Scholastic;

import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.WeakHashMap;

public class MyAccountPage extends BasePage {
    By notificationSign = By.xpath("//span[@class='notification-close']");
    By myAccountButton = By.linkText("My Account");
    By paymentMethodsBox = By.xpath("//a[@title='Payment Methods']");
    By addCardLink = By.xpath("//a[starts-with(text(),'Add')]");
    By cardNumberBox = By.xpath("//input[@class='input-text numericonly positivenumber no-mouseflow required']");
    By monthCardBox = By.xpath("//div[contains(text(),'Month')]");
    By monthExpFeb = By.xpath("//li[@data-label='02']//span[contains(text(),'02')]");
    By yearCardBox = By.xpath("//div[starts-with(text(),'Year')]");
    By yearExpCard2022 =By.xpath("//li[@data-label='2022']//span[contains(text(),'2022')]");
    By securCodeBox = By.xpath("//div[@data-required-text='Please Enter Security Code']//input[@id='dwfrm_paymentinstruments_creditcards_newcreditcard_cvn']");
    By firstNameCardBox = By.id("dwfrm_paymentinstruments_creditcards_address_firstname");
    By lastNameCardBox = By.id("dwfrm_paymentinstruments_creditcards_address_lastname");
    By addressCardBox = By.xpath("//input[@name='dwfrm_paymentinstruments_creditcards_address_address1']");
    By zipCodeCardBox = By.id("dwfrm_paymentinstruments_creditcards_address_postal");
    By cityDropBox = By.id("dwfrm_paymentinstruments_creditcards_address_city");
    By stateDrop = By.id("dwfrm_paymentinstruments_creditcards_address_states_stateUS");
    By statesAuto = By.xpath("//select[@name='dwfrm_paymentinstruments_creditcards_address_states_stateUS']//option[@class='select-option']");
    By newYorkLoc =By.xpath("//li[@data-label='new york']");
    By phoneCardBox = By.id("dwfrm_paymentinstruments_creditcards_address_phone");
    By saveButtonCardBox = By.xpath("//button[@id='applyBtn' and contains(text(),'Save')]");
    By cardErrorLocator = By.xpath("//div[@class='tooltipster-box']//div[@class='tooltipster-body']");
    By notificationPlaceAnOrderLocator = By.xpath("//span[@class='tooltipster-close ']");
    By searchBox = By.xpath("//input[@data-placeholder='Search by Title, Author, Item # or Keyword']");
    By searchButtonAcPage = By.xpath("//i[@class='fa fa-search']");

    By harryDeathlyQuick = By.xpath("//a[@class='quickview' and contains(text(),'QUICK LOOK')]/following::a[@title='Harry Potter and the Deathly Hallows']");
    By addToRecommendedButton = By.xpath("//span[@class='icon-button-text' and contains(text(),'Recommend')]");
    By recomForStudentsCheckBox = By.xpath("//input[@class='wishlist-dialog-checkbox recommended']");
    By closeBoxRecommendations = By.xpath("//span[@class='tooltipster-close ']");
    By closeQuickLookWindowBox = By.xpath("//button[@class='ui-button ui-corner-all ui-widget ui-button-icon-only ui-dialog-titlebar-close']");
    By bookNameField = By.xpath("//h1[@class='product-name']//a[@class='product-name-qv' and contains(text(),'Harry')]");

    By myListsLink = By.xpath("//span[contains(text(),'My Lists')]");
    //By recomForStudentsListBox = By.xpath("//li[@class='mylists toggle-menu active']//li[@class='recommend']//a");
    ////div[@class='header-authenticated-top sidecarmenu']//a[contains(text(),'Recommendations')]
    By recomForStudentsListBox = By.xpath("//li[@class='recommend']");
    ////
    By sfoLink = By.xpath("//div[@class='hide-mobile desktop_nav_menu']//a[contains(text(),'Student Flyer Orders')]");
    By studNameSFO = By.xpath("//input[@id='student-name']");
    By itemNumSFO = By.xpath("//input[@id='item-number']");
    By addButton = By.xpath("//button[@id='btn-add']");
    By errorSFOLocator = By.xpath("//span[@id='error-message-tooltip']");
    ////
    By enterOrdersLink = By.xpath("(//a[@id='enter-orders'])[2]");
    By teacherOrderLocator = By.xpath("//div[@class='hide-mobile desktop_nav_menu']//a[contains(text(),'Your Teacher Order')]");
    By byFlyerLocator = By.xpath("//ul[@class='hidden-xs']//span[contains(text(),'By Flyer')]");
    By priceQuantLocator = By.xpath("//input[@class='itm-qty-usd input-qty numericenteronly']");
    By jumperLocator = By.xpath("//div[@class='info-modal-hd']");
    By anotherPriceQuantityLocator = By.xpath("//input[@class='itm-qty-pts input-qty numericenteronly']");
    By jumperCloseBox = By.xpath("//i[@class='fa fa-times info-modal-close']");
    ///teachProf
    By codeLocatorMyAcc = By.xpath("//div[contains(text(),'Code')]/preceding::div[@class='value'][3]");
    By profileBoxMyAccLoc = By.xpath("//a[@title='Profile']");
    By secondClassCodeLoc = By.xpath("//div[@class='classcode']//span");
    By nameOnMyAccLoc = By.xpath("//div[@class='info']//div[@class='text-blk']//span/preceding::h3[starts-with(text(),'Email')]");
    By addressOnMyAccLoc = By.xpath("//div[@class='profile']//span[contains(text(),'SCHOLASTIC')]/following-sibling::span");


    public void closeNotification(){
        sleep();
        clickThis(notificationSign);
    }
    public void clickMyAccount() {
        clickThis(myAccountButton);
    }
    public void clickPayMethods() {
        clickThis(paymentMethodsBox);
        sleep();
    }
    public void clickAddCard(){
        clickThis(addCardLink);
        sleep();
    }
    public void enterCardNumber(String data){
        type(cardNumberBox,data);
        sleep();
    }
    public void clickMonthCc() {
        clickThis(monthCardBox);
        sleep();
    }
    public void chooseExpMonthFeb () {
        clickThis(monthExpFeb);
    }
    public void clickExpYearBox() {
        clickThis(yearCardBox);
    }
    public void chooseExpYear22() {
        clickThis(yearExpCard2022);
    }
    public void enterSecurCode (String code) {
        type(securCodeBox, code);
        sleep();
    }
    public void enterFirstNameCard (String fname) {
        type(firstNameCardBox, fname);
    }
    public void enterLastNameCard (String lname) {
        type(lastNameCardBox, lname);
    }
    public void addressOneCardEnter (String addressOne) {
        type(addressCardBox, addressOne);
    }
    public void enterZipCard (String zipCode) {
        type(zipCodeCardBox, zipCode);
    }
    public void enterPhoneCard (String phone) {
        type(phoneCardBox, phone);
    }
    public void saveCardButtonClick(){
        clickThis(saveButtonCardBox);
    }
    public void addForthCardClick(){
        clickThis(addCardLink);
    }
    public boolean isDisplayedOnlyThreeCards() {
       return isElementDisplayed(cardErrorLocator);
    }

    public void closeNotifPlaceAnOrder(){
        clickThis(notificationPlaceAnOrderLocator);
    }
    public void typeInSearchBox(String data) {
        type(searchBox, data);
        sleep();
    }
    public void clickSearchButton () {
        clickThis(searchButtonAcPage);
    }
    public void clickHarryDeathlyQuick() {
        clickThis(harryDeathlyQuick);
        sleep();
    }
    public void clickAddToRecommended() {
        clickThis(addToRecommendedButton);
        sleep();
    }
    public void clickRecomForStudents() {
        clickThis(recomForStudentsCheckBox);
        sleep();
    }
    public void closeRecomWindow(){
        clickThis(closeBoxRecommendations);
        sleep();
    }
    public void clickMyLists() {
        clickThis(myListsLink);
        sleep();
    }
    public void clickRecomForStudentsList(){
        clickThis(recomForStudentsListBox);
        sleep();
    }

    public void clickEnterOrders() {
        clickThis(enterOrdersLink);
        sleep();
    }
    public void clickSFOLink () {
        clickThis(sfoLink);
        sleep();
    }
    public void enterStuNameSFO (String name) {
        type(studNameSFO, name);
        sleep();
    }
    public void enterItemNumSFO (String quantity) {
        type(itemNumSFO,quantity);
        sleep();
    }
    public void clickAddButtonSFO(){
        clickThis(addButton);
        sleep();
    }
    public boolean isErrorMesDisplayedSFO(String expErrorSFO){
        String actualErrorSFO = getText(errorSFOLocator);
        return actualErrorSFO.equalsIgnoreCase(expErrorSFO);
    }
////
    public void clickYTO(){
        clickThis(teacherOrderLocator);
        sleep();
     }
    public void clickByFlyers(){
        clickThis(byFlyerLocator);
        sleep();
    }
    public void clickPriceQuantBox(){
        clickThis(priceQuantLocator);
        sleep();
    }
    public boolean isJumperDisplayed(){
        return isElementDisplayed(jumperLocator);
    }
    public void enterInPriceQuantBox(String data) {
        type(priceQuantLocator, data);
        sleep();
    }
    public void closingJumper() {
        clickThis(jumperCloseBox);
        sleep();
    }
    public void clickAnotherPrQuanLoc (){
        clickThis(anotherPriceQuantityLocator);
        sleep();
    }
    ///TeaAcc
    public String classCodeMyAccTeachProfText () {
        System.out.println(getText(codeLocatorMyAcc));
        return getText(codeLocatorMyAcc);
    }
    public void profileClick (){
        clickThis(profileBoxMyAccLoc);
        sleep();
    }
    public boolean isSecondClassCodeTheSame (String text2) {
        System.out.println(getText(secondClassCodeLoc));
        return isStringEqualsString(getText(secondClassCodeLoc),text2);
    }
    public boolean isNameDisplayedCorrect (String fname, String lname){
        System.out.println(getText(nameOnMyAccLoc));
        String expName = fname+" "+lname;
        return isStringContainsString(getText(nameOnMyAccLoc),expName);
    }
    public boolean isAddressDisplayedCorrect (String address){
        System.out.println(getText(addressOnMyAccLoc));
        return isStringEqualsString(address,getText(addressOnMyAccLoc));
    }




}
