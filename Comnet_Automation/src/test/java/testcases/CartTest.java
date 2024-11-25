package testcases;

import base.BaseClass;
import org.testng.annotations.Test;
import pages.CartPage;

public class CartTest extends BaseClass {
    @Test
    public void testAddToCartAndViewCart() {
        CartPage cartPage = new CartPage(driver);
        cartPage.addItemToCart();
        cartPage.viewCart();
    }
}
