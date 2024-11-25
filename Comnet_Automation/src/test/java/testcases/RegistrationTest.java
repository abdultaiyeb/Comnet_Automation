package testcases;

import base.BaseClass;
import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.RegistrationPage;

public class RegistrationTest extends BaseClass {

    @Test
    public void testRegistrationWithFaker() {
        Faker faker = new Faker();
        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String nationality = "American"; 
        String mobileNumber = faker.phoneNumber().cellPhone().replaceAll("[^0-9]", "").substring(0, 10);
        String dob = "01/01/1990"; 
        String address = faker.address().fullAddress();
        String postalCode = faker.address().zipCode();
        String email = faker.internet().emailAddress();
        String password = faker.internet().password(8, 16);
      
        
        RegistrationPage registrationPage = new RegistrationPage(driver);

      
        registrationPage.completeRegistrationForm(
                firstName,
                lastName,
                nationality,
                mobileNumber,
                dob,              
                address,               
                postalCode,
                email,
                password
              
        );

        
        String successMessage = getSuccessMessage(); 
        Assert.assertEquals(successMessage, "Registration Successful", "Registration failed for valid inputs.");
    }

	private String getSuccessMessage() {
		return null;
	}

   
}
