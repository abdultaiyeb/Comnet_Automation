package testcases;

import base.BaseClass;
import org.testng.annotations.Test;
import pages.CheckoutPage;

public class CheckoutTest extends BaseClass {
    @Test
    public void testCheckout() {
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.proceedToCheckout();
    }
}
