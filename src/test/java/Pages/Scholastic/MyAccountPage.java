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
    //SFO One Stu
    By quantityAllLoc = By.xpath("//td[@class=' item-qty']//input[@class='input-qty numericenteronly']");
    By quantFirstBook = By.xpath("//a[contains(text(),'6S5')]/following::input[@class='input-qty numericenteronly'][1]");
    By quantSecondBook = By.xpath("//a[contains(text(),'11X5')]/following::input[@class='input-qty numericenteronly'][1]");
    By quantThirdBook = By.xpath("//a[contains(text(),'14G5')]/following::input[@class='input-qty numericenteronly'][1]");
    By quant6S5Loc = By.xpath("//a[contains(text(),'6S5')]/following::input[@class='input-qty numericenteronly'][1]");
    By quant11X5Loc = By.xpath("//a[contains(text(),'11X5')]/following::input[@class='input-qty numericenteronly'][1]");
    By quant14G5Loc = By.xpath("//a[contains(text(),'14G5')]/following::input[@class='input-qty numericenteronly'][1]");
    By quant42J4Loc = By.xpath("//a[contains(text(),'42J4')]/following::input[@class='input-qty numericenteronly'][1]");
    By quant34B4Loc = By.xpath("//a[contains(text(),'34B4')]/following::input[@class='input-qty numericenteronly'][1]");

    By stuNameFirstLoc=By.xpath("//table[@id='sfo-data-table']//td[@class=' studentName'][1]");
    By stuNameSecLoc = By.xpath("//td[@class=' itemNum details-control']//a[contains(text(),'X5')]/preceding::td[@class=' studentName'][2]");
    By stuNameThirdLoc = By.xpath("//a[contains(text(),'S5')]/preceding::td[@class=' studentName'][1]");
    By bookThirLoc = By.xpath("//tr[@class='odd'][1]//td[@class=' itemNum details-control']//a");
    By bookSeconLoc = By.xpath("//tr[@class='even']//td[@class=' itemNum details-control']//a");
    By bookFirstLoc = By.xpath("//tr[@class='odd'][2]//td[@class=' itemNum details-control']//a");
    By reviewOrderButtonLoc = By.xpath("//button[@class='secondary']");

    By quant6S5LocQ = By.xpath("//a[contains(text(),'6S5')]/following::input[@class='input-qty numericenteronly'][1]");    //attr value
    By quant14G5LocQ = By.xpath("//a[contains(text(),'14G5')]/following::input[@class='input-qty numericenteronly'][1]");
    By quant11X5LocQ = By.xpath("//a[contains(text(),'11X5')]/following::input[@class='input-qty numericenteronly'][1]");
    By quant8K5LocQ =By.xpath("//a[contains(text(),'8K5')]/following::input[@class='input-qty numericenteronly'][1]");
    By quant11K5LocQ = By.xpath("//a[contains(text(),'11K5')]/following::input[@class='input-qty numericenteronly'][1]");



    By itemNumber14G5Loc =By.xpath("//a[contains(text(),'Collect-a-Pet')]/preceding::a[1]");
    By itemNumber11X5Loc = By.xpath("//a[contains(text(),'The Boy')]/preceding::a[1]");
    By itemNumber6S5Loc = By.xpath("//td[@class=' itemNum details-control']//a[contains(text(),'6S')]");    //if gettext == 6S5
    By itemNumber11K5Loc = By.xpath("//tr[@class='odd']//td[@class=' studentName' and contains(text(),'Michael')]/following::a[1]");
    By itemNumber8K5Loc = By.xpath("//tr[@class='even']//td[@class=' studentName' and contains(text(),'Michael')]/following::a[1]");


    By name14G5Loc = By.xpath("//td[@class=' itemNum details-control']//a[contains(text(),'14G5')]/preceding::td[@class=' studentName'][1]");
    By name11X5Loc = By.xpath("//td[@class=' itemNum details-control']//a[contains(text(),'11X5')]/preceding::td[@class=' studentName'][1]");
    By name6S5Loc = By.xpath("//td[@class=' itemNum details-control']//a[contains(text(),'6S5')]/preceding::td[@class=' studentName'][1]");
    By name11K5Loc = By.xpath("//tr[@class='odd']//a[contains(text(),'11K5')]/preceding::td[@class=' studentName']");
    By name8K5Loc = By.xpath("//tr[@class='even']//a[contains(text(),'8K5')]/preceding::td[@class=' studentName'][2]");


    //
    By quantBoxYTOBookOneLoc = By.xpath("//a[@class='truncate' and contains(text(),'Amelia Bedelia: Lost & Found')]/following::input[@class='itm-qty-usd input-qty numericenteronly'][1]");
    //
    By quant8K5Loc = By.xpath("//tr[@class='even']//a[contains(text(),'Best')]/following::input[@class='input-qty numericenteronly'][1]");
    By quant11K5Loc = By.xpath("//tr[@class='odd']//a[contains(text(),'Cece')]/following::input[@class='input-qty numericenteronly'][1]");

    public boolean correctQuantitiesMult(List<String> quantities) {
        if (getAttributeValue(quant6S5LocQ).equalsIgnoreCase(quantities.get(0)) && getAttributeValue(quant11X5LocQ).equalsIgnoreCase(quantities.get(1))
                && getAttributeValue(quant14G5LocQ).equalsIgnoreCase(quantities.get(2)) &&
                getAttributeValue(quant8K5LocQ).equalsIgnoreCase(quantities.get(3))&& getAttributeValue(quant11K5LocQ).equalsIgnoreCase(quantities.get(4))) {
            return true;
        } else {
            return false;
        }
    }
    public boolean correctItemNumbersMult (List<String> items) {
        System.out.println("6S5"+ getText(itemNumber6S5Loc));
        System.out.println("11x5"+ getText(itemNumber11X5Loc));
        System.out.println("14G5" + getText(itemNumber14G5Loc));
        System.out.println("8K5" + getText(itemNumber8K5Loc));
        System.out.println("11K5" + getText(itemNumber11K5Loc));
        if (getText(itemNumber6S5Loc).equalsIgnoreCase(items.get(0)) && getText(itemNumber11X5Loc).equalsIgnoreCase(items.get(1))
                && getText(itemNumber14G5Loc).equalsIgnoreCase(items.get(2)) &&getText(itemNumber8K5Loc).equalsIgnoreCase(items.get(3))
        && getText(itemNumber11K5Loc).equalsIgnoreCase(items.get(4))) {
            return true;
        } else {
            return false;
        }
    }
    public boolean correctNamesMult (List<String> names) {
        System.out.println("6S5"+ getText(name6S5Loc));
        System.out.println("11x5"+ getText(name11X5Loc));
        System.out.println("14G5" + getText(name14G5Loc));
        System.out.println("8K5" + getText(name8K5Loc));
        System.out.println("11K5" + getText(name11K5Loc));
        if (getText(name6S5Loc).equalsIgnoreCase(names.get(0)) && getText(name11X5Loc).equalsIgnoreCase(names.get(1)) &&
                getText(name14G5Loc).equalsIgnoreCase(names.get(2)) && getText(name8K5Loc).equalsIgnoreCase(names.get(3))
        && getText(name11K5Loc).equalsIgnoreCase(names.get(4))) {
            return true;
        } else {
            return false;
        }
    }
    public void enter8K5Q (String num){
        type(quant8K5Loc, num);
        sleep();
    }
    public void enter11K5Q( String num) {
        type(quant11K5Loc, num);
        sleep();
    }
    public boolean correctNames (String name) {
        if (getText(name6S5Loc).equalsIgnoreCase(name) && getText(name11X5Loc).equalsIgnoreCase(name) &&
                getText(name14G5Loc).equalsIgnoreCase(name)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean correctItemNumbers (String item1, String item2,String item3) {
        if (getText(itemNumber6S5Loc).equalsIgnoreCase(item1) && getText(itemNumber11X5Loc).equalsIgnoreCase(item2)
        && getText(itemNumber14G5Loc).equalsIgnoreCase(item3)) {
            return true;
        } else {
            return false;
        }
    }
    public boolean correctQuantities(String q1, String q2, String q3) {
        if (getAttributeValue(quant6S5LocQ).equalsIgnoreCase(q1) && getAttributeValue(quant11X5LocQ).equalsIgnoreCase(q2)
        && getAttributeValue(quant14G5LocQ).equalsIgnoreCase(q3)) {
            return true;
        } else {
            return false;
        }
    }

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
    ///SFO One
    public void bookQuanFirstSFO (String number){
        type(quantFirstBook, number);
        sleep();
    }
    public void bookQuanSecondSFO (String number){
        type(quantSecondBook, number);
        sleep();
    }
    public void bookQuanThirdSFO (String number){
        type(quantThirdBook, number);
        sleep();
    }

    public void clickReviewOrderButton () {
        clickThis(reviewOrderButtonLoc);
        sleep();
    }

    public void enterQuantFor6S5(String number){
        type(quant6S5Loc, number);
        sleep();
    }
    public void enterQuant11X5(String number) {
        type(quant11X5Loc, number);
        sleep();
    }
    public void enterQuant14G5(String number) {
        type(quant14G5Loc, number);
        sleep();
    }
    public void enterQuant42J4(String number){
        type(quant42J4Loc,number );
        sleep();
    }
    public void enterQuant34B4(String number){
        type(quant34B4Loc,number );
        sleep();
    }

    public void addYTO(String num){
        type(quantBoxYTOBookOneLoc, num);
        sleep();
    }
    public void reviewCartButtonClick(){
        clickThis(reviewOrderButtonLoc);
        sleep();
    }
}
