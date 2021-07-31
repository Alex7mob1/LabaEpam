package rozetka.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage {

    @FindBy(xpath = "//*[contains(@class, 'js-total')]//*[contains(@class,'checkout-total__value')]")
    private WebElement totalPrice;

    public WebElement getTotalPrice() {
        return totalPrice;
    }
}