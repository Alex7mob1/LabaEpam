package rozetka.steps;

import rozetka.pages.CheckoutPage;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.lessThan;

public class CheckoutPageBL {

    private CheckoutPage checkoutPage;

    public CheckoutPageBL() {
        checkoutPage = new CheckoutPage();
    }

    public void checkTotalPrice(int price) {
        int tPrice = Integer.parseInt(checkoutPage.getTotalPrice()
                .getText().replaceAll("\\D+", ""));
        assertThat(tPrice, lessThan(price));
    }
}