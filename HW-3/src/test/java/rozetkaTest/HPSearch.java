package rozetkaTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import rozetka.model.Data;
import rozetka.navigation.Navigation;
import rozetka.steps.HomePageBL;
import rozetka.steps.ProductTypePageBL;
import rozetka.steps.SearchPanelBL;
import rozetka.utils.PropertiesReader;
import rozetka.utils.TestData;

import static rozetka.enums.URLs.BASE_URL;

public class HPSearch extends BaseTest {

    @BeforeTest
    public void profileSetUp() {
        PropertiesReader propertiesReader = new PropertiesReader();
        System.setProperty(propertiesReader.getName(), propertiesReader.getLocation());
    }

    @BeforeMethod
    public void testsSetUp() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
    }

    @Test
    public void searchProduct() {

        Data data = TestData.getTestData();
        SearchPanelBL searchPanelBL=new SearchPanelBL();

        searchPanelBL.inputTypeName(data.getType())
                .clickOnSearchButton()
                .inputCompanyName(data.getCompany())
                .clickOnCompanyBox()
                .clickOnExpensiveFirst()
                .clickOnFirstProduct()
                .clickOnBuyButton()
                .clickOnCheckoutBtn()
                .checkTotalPrice();
    }
}