package rozetka.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage{

    @FindBy(xpath = "//*[@class='product-buttons__item ng-star-inserted']")
    private WebElement buyButton;

    public WebElement getBuyButton(){
        return buyButton;
    }
}