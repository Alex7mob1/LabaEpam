package rozetka.pages;

import org.openqa.selenium.support.FindBy;
import rozetka.decorator.elements.TextArea;

public class CheckoutPage extends BasePage {

    @FindBy(xpath = "//*[contains(@class, 'js-total')]//*[contains(@class,'checkout-total__value')]")
    private TextArea totalPrice;

    public String getTotalPrice() {
        return totalPrice.getText();
    }
}