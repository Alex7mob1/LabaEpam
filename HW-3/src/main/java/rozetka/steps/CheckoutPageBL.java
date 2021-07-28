package rozetka.steps;

import rozetka.pages.CheckoutPage;

import static org.hamcrest.MatcherAssert.assertThat;

public class CheckoutPageBL {

    private CheckoutPage checkoutPage;

    public CheckoutPageBL() {
        checkoutPage = new CheckoutPage();
    }

    public void checkTotalPrice() {
        String tPrice = String.valueOf(checkoutPage.getTotalPrice());
        //assertThat(tPrice, price)
    }
}