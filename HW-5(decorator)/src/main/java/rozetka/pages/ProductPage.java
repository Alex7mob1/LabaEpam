package rozetka.pages;

import org.openqa.selenium.support.FindBy;
import rozetka.decorator.elements.Button;

public class ProductPage extends BasePage {

    @FindBy(xpath = "//*[contains(@class, 'button_with_icon button_color_green ')]")
    private Button buyButton;

    public void clickOnBuyButton() {
        buyButton.safeClick();
    }
}