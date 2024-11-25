package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
    @FindBy(id = "//input[@id='ctl00_txtUsername']")
    private WebElement emailaddressField;

    @FindBy(id = "//input[@id='ctl00_txtPassword']")
    private WebElement passwordField;

    @FindBy(id = "//a[@id='ctl00_btnLogin']")
    private WebElement signinButton;

    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void login(String username, String password) {
        sendKeys(emailaddressField, username);
        sendKeys(passwordField, password);
        click(signinButton);
    }
}
