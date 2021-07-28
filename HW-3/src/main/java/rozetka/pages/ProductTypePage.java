package rozetka.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductTypePage extends BasePage{

    @FindBy(css = " input[type=search]:nth-of-type(1)")
    private WebElement typeSearchBox;

    public WebElement getTypeSearchBox(){
        return typeSearchBox;
    }

    @FindBy(css = "ul[class='checkbox-filter ng-star-inserted'] input[class='custom-checkbox']")
    private WebElement firstFindBox;

    public WebElement getFirstFindBox(){
        return firstFindBox;
    }

    @FindBy(css="option[value='2: expensive']")
    private WebElement expensiveFirst;

    public WebElement getExpensiveFirst(){
        return expensiveFirst;
    }

    @FindBy(css ="ul[class = 'catalog-grid ng-star-inserted'] li:first-child")
    private WebElement firstProduct;

    public WebElement getFirstProduct(){
        return firstProduct;
    }
}