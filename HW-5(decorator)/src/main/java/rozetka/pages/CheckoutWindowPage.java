package rozetka.pages;

import org.openqa.selenium.support.FindBy;
import rozetka.decorator.elements.Button;

public class CheckoutWindowPage extends BasePage {

    @FindBy(css = "a[href='https://rozetka.com.ua/checkout/']")
    private Button checkoutBtn;

    public void clickOnCheckoutBtn() {
        checkoutBtn.safeClick();
    }
}