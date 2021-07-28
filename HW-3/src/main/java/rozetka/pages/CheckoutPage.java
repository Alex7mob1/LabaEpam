package rozetka.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage extends BasePage {

    @FindBy(xpath = "//*[@class='checkout-total__value checkout-total__value_size_large']")
    private WebElement totalPrice;

    public WebElement getTotalPrice() {
        return totalPrice;
    }
}