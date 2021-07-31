package rozetka.steps;

import rozetka.pages.ProductTypePage;
import rozetka.utils.Scroll;

public class ProductTypePageBL {

    private ProductTypePage productTypePage;

    public ProductTypePageBL(){
        productTypePage = new ProductTypePage();
    }

    public ProductTypePageBL inputCompanyName(String company){
        productTypePage.getTypeSearchBox().clear();
        productTypePage.getTypeSearchBox().sendKeys((company));
        return this;
    }

    public ProductTypePageBL clickOnCompanyBox(){
        Scroll scroll = new Scroll();
        scroll.scroll();
        productTypePage.clickOnFirstBox();
        return this;
    }

    public ProductTypePageBL clickOnExpensiveFirst(){
        productTypePage.getExpensiveFirst().click();
        return this;
    }

    public ProductPageBL clickOnFirstProduct(){
        productTypePage.getFirstProduct().click();
        return new ProductPageBL();
    }
}