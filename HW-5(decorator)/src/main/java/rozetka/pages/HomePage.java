package rozetka.pages;

import org.openqa.selenium.support.FindBy;
import rozetka.decorator.elements.Button;

public class HomePage extends BasePage {

    @FindBy(xpath = "//*[@class='sidebar sidebar_type_main']//*[contains(@href, 'computers-notebooks')]")
    private Button compLaptopBtn;

    public void clickOnCompLaptopBtn() {
        compLaptopBtn.safeClick();
    }
}