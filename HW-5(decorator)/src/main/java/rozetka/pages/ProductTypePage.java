package rozetka.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import rozetka.decorator.elements.Button;
import rozetka.decorator.elements.CheckBox;
import rozetka.decorator.elements.InputText;

import java.util.concurrent.TimeUnit;

public class ProductTypePage extends BasePage {

    @FindBy(xpath = "//*[@data-filter-name='producer']//*[@type='search']")
    private InputText typeSearchBox;

    @FindBy(css = "ul[class='checkbox-filter ng-star-inserted'] ul[class='checkbox-filter'] li:first-child")
    private CheckBox firstFindBox;

    @FindBy(css = "option[value='2: expensive']")
    private Button expensiveFirst;

    @FindBy(css = "ul[class = 'catalog-grid ng-star-inserted'] li:first-child")
    private Button firstProduct;

    public void inputTextInTypeSearchBox(String company) {
        wait.until((ExpectedCondition<Boolean>) wdriver -> ((JavascriptExecutor) driver).executeScript(
                "return document.readyState"
        ).equals("complete"));
        wait.pollingEvery(1, TimeUnit.SECONDS).until((ExpectedCondition<Object>) webDriver -> typeSearchBox.isDisplayed());
        typeSearchBox.safeInput(company);
    }

    public void clickOnFirstBox() {
        firstFindBox.setCheckBox();
    }

    public void clickOnExpensiveFirst() {
        expensiveFirst.safeClick();
    }

    public void clickOnFirstProduct() {
        firstProduct.safeClick();
    }
}