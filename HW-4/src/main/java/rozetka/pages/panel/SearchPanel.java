package rozetka.pages.panel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import rozetka.pages.BasePage;

public class SearchPanel extends BasePage {

    @FindBy(xpath = "//*[@name='search']")
    private WebElement searchBox;

    @FindBy(xpath = "//*[@class='button button_color_green button_size_medium search-form__submit ng-star-inserted']")
    private WebElement searchButton;

    public WebElement getSearchBox() {
        return searchBox;
    }

    public WebElement getSearchButton() {
        return searchButton;
    }
}