package rozetka.steps;

import rozetka.pages.panel.SearchPanel;

public class SearchPanelBL {

    private SearchPanel searchPanel;

    public SearchPanelBL() {
        searchPanel = new SearchPanel();
    }

    public void inputProductName(String type) {
        searchPanel.getSearchBox().clear();
        searchPanel.getSearchBox().sendKeys((type));
    }

    public void clickOnSearchButton() {
        searchPanel.getSearchButton().click();
    }
}