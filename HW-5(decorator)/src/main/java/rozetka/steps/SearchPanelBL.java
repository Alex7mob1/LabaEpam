package rozetka.steps;

import rozetka.pages.panel.SearchPanel;

public class SearchPanelBL {

    private SearchPanel searchPanel;

    public SearchPanelBL() {
        searchPanel = new SearchPanel();
    }

    public SearchPanelBL inputTypeName(String type) {
        searchPanel.inputTextInSearchBox(type);
        return this;
    }

    public ProductTypePageBL clickOnSearchButton() {
        searchPanel.clickOnSearchButton();
        return new ProductTypePageBL();
    }
}