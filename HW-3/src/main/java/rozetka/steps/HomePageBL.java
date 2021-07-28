package rozetka.steps;

import rozetka.pages.HomePage;

public class HomePageBL {

    private HomePage homePage;

    public HomePageBL(){
        homePage = new HomePage();
    }

    public void clickOnCompLaptopBtn(){
        homePage.getCompLaptopBtn().click();
    }

    public SearchPanelBL getSearchPanelBL(){
        return new SearchPanelBL();
    }
}