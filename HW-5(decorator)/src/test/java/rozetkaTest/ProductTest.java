package rozetkaTest;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import rozetka.model.Product;
import rozetka.steps.SearchPanelBL;
import rozetka.utils.TestProducts;

public class ProductTest extends BaseTest {

    @DataProvider(parallel = true)
    public Object[][] products() {
        return TestProducts.getTestProducts().stream()
                .map(product -> new Object[]{product})
                .toArray(Object[][]::new);
    }

    @Test(dataProvider = "products")
    public void searchProduct(Product product) {

        SearchPanelBL searchPanelBL = new SearchPanelBL();

        searchPanelBL.inputTypeName(product.getType())
                .clickOnSearchButton()
                .inputCompanyName(product.getCompany())
                .clickOnCompanyBox()
                .clickOnExpensiveFirst()
                .clickOnFirstProduct()
                .clickOnBuyButton()
                .clickOnCheckoutBtn()
                .checkTotalPrice(product.getPrice());
    }
}