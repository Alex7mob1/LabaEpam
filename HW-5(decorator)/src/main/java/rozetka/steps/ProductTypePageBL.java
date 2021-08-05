package rozetka.steps;

import rozetka.pages.ProductTypePage;
import rozetka.utils.Scroll;

public class ProductTypePageBL {

    private ProductTypePage productTypePage;

    public ProductTypePageBL(){
        productTypePage = new ProductTypePage();
    }

    public ProductTypePageBL inputCompanyName(String company){
        productTypePage.inputTextInTypeSearchBox(company);
        return this;
    }

    public ProductTypePageBL clickOnCompanyBox(){
        Scroll scroll = new Scroll();
        scroll.scroll();
        productTypePage.clickOnFirstBox();
        return this;
    }

    public ProductTypePageBL clickOnExpensiveFirst(){
        productTypePage.clickOnExpensiveFirst();
        return this;
    }

    public ProductPageBL clickOnFirstProduct(){
        productTypePage.clickOnFirstProduct();
        return new ProductPageBL();
    }
}