package rozetka.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    @FindBy(xpath = "//*[@class='sidebar sidebar_type_main']//*[contains(@href, 'computers-notebooks')]")
    private WebElement compLaptopBtn;

    public WebElement getCompLaptopBtn(){
        return compLaptopBtn;
    }
}