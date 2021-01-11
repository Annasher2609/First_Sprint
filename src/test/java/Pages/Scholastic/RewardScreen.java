package Pages.Scholastic;

import Pages.BasePage;
import org.openqa.selenium.By;

public class RewardScreen extends BasePage {
    By zeroTaxSFOLoc = By.xpath("//li[@class='std-total-msg']//span[@class='or-inner-data']");
    By contCheckOutButtonLoc = By.xpath("//button[@id='btn-continue-checkout']");


    public boolean isTaxEqualsZero (){
        String taxAmount =  getText(zeroTaxSFOLoc);
        double taxAmountDouble = getPriceNum(taxAmount);
        System.out.println("tax amount double " + taxAmountDouble);
        if (taxAmountDouble==0.00){
            return true;
        }else {
            return false;
        }
    }
    public void contCheckOutButtonClick() {
        clickThis(contCheckOutButtonLoc);
        sleep();
    }

}
