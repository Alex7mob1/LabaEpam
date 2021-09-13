package rozetka.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutWindowPage extends BasePage{

    @FindBy(css = "a[href='https://rozetka.com.ua/checkout/']")
    private WebElement checkoutBtn;

    public WebElement getCheckoutBtn(){
        return checkoutBtn;
    }
}