package rozetka.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage{

    @FindBy(xpath = "//*[contains(@class, 'button_with_icon button_color_green ')]")
    private WebElement buyButton;

    public WebElement getBuyButton(){
        return buyButton;
    }
}