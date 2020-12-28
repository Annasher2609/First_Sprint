package Pages.Scholastic;

import Pages.BasePage;
import org.openqa.selenium.By;

public class MyLists extends BasePage {
By bookLocation = By.xpath("//div[@class='product-list-item']//a[@class='quickview']");

public String getBookTitleFromMyLists() {
   return getText(bookLocation);
}
}