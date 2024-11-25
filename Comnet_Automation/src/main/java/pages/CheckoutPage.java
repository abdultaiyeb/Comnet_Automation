package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage extends BasePage {
    @FindBy(id = "//a[normalize-space()='Log Out']")
    private WebElement logoutButton;

    @FindBy(id = "//a[@class='tab1 show-arrow pointer on']")
    private WebElement accountButton;

    public CheckoutPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void proceedToCheckout() {
    	 click(accountButton);
        click(logoutButton);
       
    }
}
