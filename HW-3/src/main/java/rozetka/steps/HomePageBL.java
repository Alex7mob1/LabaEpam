package rozetka.steps;

import rozetka.pages.HomePage;

public class HomePageBL {

    private HomePage homePage;

    public HomePageBL(){
        homePage = new HomePage();
    }

    public HomePageBL clickOnCompLaptopBtn(){
        homePage.getCompLaptopBtn().click();
        return this;
    }

    public SearchPanelBL getSearchPanelBL(){
        return new SearchPanelBL();
    }
}