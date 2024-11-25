package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends BasePage {

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    
    @FindBy(id = "//input[@id='ctl00_ContentPlaceHolder1_txtFirstName']")
    WebElement firstNameField;

    @FindBy(id = "//input[@id='ctl00_ContentPlaceHolder1_txtLastName']")
    WebElement lastNameField;

    @FindBy(id = "nationality")
    WebElement nationalityDropdown;

    @FindBy(id = "//input[@id='ctl00_ContentPlaceHolder1_txtTelephon1']")
    WebElement mobileNumberField;

    @FindBy(id = "//input[@id='ctl00_ContentPlaceHolder1_txtDob']")
    WebElement dateOfBirthField;

    @FindBy(id = "//textarea[@id='ctl00_ContentPlaceHolder1_txtAdress']")
    WebElement addressField;

    @FindBy(id = "//input[@id='ctl00_ContentPlaceHolder1_txtPostalcd']")
    WebElement postalCodeField;

    @FindBy(id = "//input[@id='ctl00_ContentPlaceHolder1_txtEmail']")
    WebElement emailField;

    @FindBy(id = "//input[@id='ctl00_ContentPlaceHolder1_txtPassword']")
    WebElement passwordField;

    @FindBy(id = "//input[@id='ctl00_ContentPlaceHolder1_txtReEnterpassword']")
    WebElement confirmPasswordField;

    @FindBy(id = "//input[@id='ctl00_ContentPlaceHolder1_txtVCode']")
    WebElement captchaField;

    @FindBy(id = "//a[@id='ctl00_ContentPlaceHolder1_btnSave']")
    WebElement submitButton;

    
    public void enterFirstName(String firstName) {
    	sendKeys(firstNameField, firstName);
    }

    public void enterLastName(String lastName) {
    	sendKeys(lastNameField, lastName);
    }

    public void selectNationality(String nationality) {
        selectDropdownByVisibleText(nationalityDropdown, nationality);
    }

    private void selectDropdownByVisibleText(WebElement nationalityDropdown2, String nationality) {
		
		
	}

	public void enterMobileNumber(String mobileNumber) {
		sendKeys(mobileNumberField, mobileNumber);
    }

    public void enterDateOfBirth(String dob) {
    	sendKeys(dateOfBirthField, dob);
    }

   

    public void enterAddress(String address) {
    	sendKeys(addressField, address);
    }

    

    public void enterPostalCode(String postalCode) {
    	sendKeys(postalCodeField, postalCode);
    }

    public void enterEmail(String email) {
    	sendKeys(emailField, email);
    }

    public void enterPassword(String password) {
    	sendKeys(passwordField, password);
    }

    public void confirmPassword(String password) {
    	sendKeys(confirmPasswordField, password);
    }

    public void enterCaptcha(String captcha) {
    	sendKeys(captchaField, captcha);
    }

    public void clickRegisterButton() {
    	click(submitButton);
    }

    public void completeRegistrationForm(String firstName, String lastName, String nationality, String mobileNumber,
                                         String dob, String gender, String address, String address2, String address3,
                                         String postalCode, String email, String password, String captcha) {
        enterFirstName(firstName);
        enterLastName(lastName);
        selectNationality(nationality);
        enterMobileNumber(mobileNumber);
        enterDateOfBirth(dob);
        enterAddress(address);      
        enterPostalCode(postalCode);
        enterEmail(email);
        enterPassword(password);
        confirmPassword(password);
        enterCaptcha(captcha);
        clickRegisterButton();
    }

	public void completeRegistrationForm(String firstName, String lastName, String nationality, String mobileNumber,
			String dob, String address, String postalCode, String email, String password) {
		
	}
}
