package rozetkaTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import rozetka.model.Data;
import rozetka.navigation.Navigation;
import rozetka.steps.HomePageBL;
import rozetka.utils.TestData;

import static rozetka.enums.URLs.BASE_URL;

public class HPSearch extends BaseTest {

    private WebDriver driver;
    private WebDriver wait;
    private HomePageBL homePageBL;

    @BeforeTest
    public void profileSetUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
    }

    @BeforeMethod
    public void testsSetUp() {
        new Navigation().navigateToUrl(BASE_URL.getValue());
    }


    @Test
    public void searchProduct(){

        Data data = TestData.getTestData();

        System.out.println(data.getType());
        homePageBL.clickOnCompLaptopBtn();
        homePageBL.getSearchPanelBL()
                .inputTypeName(data.getType());

        homePageBL.getSearchPanelBL()
                .clickOnSearchButton();
    }
}