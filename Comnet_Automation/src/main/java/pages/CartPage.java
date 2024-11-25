package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends BasePage {
    @FindBy(id = "//a[@id='ctl00_ContentPlaceHolder1_rptProduct_ctl00_AncAddToCart']")
    private WebElement addToCartButton;

    @FindBy(id = "//a[@id='ctl00_anchrCart2']")
    private WebElement viewCartButton;

    public CartPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void addItemToCart() {
        click(addToCartButton);
    }

    public void viewCart() {
        click(viewCartButton);
    }
}
