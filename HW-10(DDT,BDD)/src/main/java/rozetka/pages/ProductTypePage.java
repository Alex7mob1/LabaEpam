package rozetka.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;

import java.util.concurrent.TimeUnit;

public class ProductTypePage extends BasePage {

    @FindBy(xpath = "//*[@data-filter-name='producer']//*[@type='search']")
    private WebElement typeSearchBox;

    //@FindBy(css = "ul[class='checkbox-filter ng-star-inserted'] label")
    @FindBy(css = "ul[class='checkbox-filter ng-star-inserted'] ul[class='checkbox-filter'] li:first-child")
    private WebElement firstFindBox;

    @FindBy(css = "option[value='2: expensive']")
    private WebElement expensiveFirst;

    @FindBy(css = "ul[class = 'catalog-grid ng-star-inserted'] >li:first-child")
    private WebElement firstProduct;

    public WebElement getTypeSearchBox() {
        wait.until((ExpectedCondition<Boolean>) wdriver -> ((JavascriptExecutor) driver).executeScript(
                "return document.readyState"
        ).equals("complete"));
        wait.pollingEvery(1, TimeUnit.SECONDS).until((ExpectedCondition<Object>) webDriver -> typeSearchBox.isDisplayed());
        return typeSearchBox;
    }

    public void clickOnFirstBox() {
        wait.ignoring(StaleElementReferenceException.class)
                .until(driver -> {
                    firstFindBox.click();
                    return true;
                });
    }

    public WebElement getExpensiveFirst() {
        return expensiveFirst;
    }

    public WebElement getFirstProduct() {
        return firstProduct;
    }
}