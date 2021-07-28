package rozetka.steps;

import rozetka.pages.panel.SearchPanel;

public class SearchPanelBL {

    private SearchPanel searchPanel;

    public SearchPanelBL() {
        searchPanel = new SearchPanel();
    }

    public void inputTypeName(String type) {
        searchPanel.getSearchBox().clear();
        searchPanel.getSearchBox().sendKeys((type));
    }

    public ProductTypePageBL clickOnSearchButton() {
        searchPanel.getSearchButton().click();
        return new ProductTypePageBL();
    }
}