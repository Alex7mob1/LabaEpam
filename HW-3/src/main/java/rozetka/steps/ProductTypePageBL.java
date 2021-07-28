package rozetka.steps;

import rozetka.pages.ProductTypePage;

public class ProductTypePageBL {

    private ProductTypePage productTypePage;

    public ProductTypePageBL(){
        productTypePage = new ProductTypePage();
    }

    public void inputCompanyName(String company){
        productTypePage.getTypeSearchBox().clear();
        productTypePage.getTypeSearchBox().sendKeys((company));
    }

    public void clickOnCompanyBox(){
        productTypePage.getFirstFindBox().click();
    }

    public void clickOnExpensiveFirst(){
        productTypePage.getExpensiveFirst().click();
    }

    public ProductPageBL clickOnFirstProduct(){
        productTypePage.getFirstProduct().click();
        return new ProductPageBL();
    }
}