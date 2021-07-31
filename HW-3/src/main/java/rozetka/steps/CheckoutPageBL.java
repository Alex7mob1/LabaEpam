package rozetka.steps;

import rozetka.model.Data;
import rozetka.pages.CheckoutPage;
import rozetka.utils.TestData;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;

public class CheckoutPageBL {

    private CheckoutPage checkoutPage;
    private Data data = TestData.getTestData();
    private int tPrice;

    public CheckoutPageBL() {
        checkoutPage = new CheckoutPage();
        tPrice = Integer.parseInt(checkoutPage.getTotalPrice()
                .getText().replaceAll("\\D+", ""));

    }

    public void checkTotalPrice() {
        assertThat(tPrice, lessThan(data.getPrice()));
    }
}