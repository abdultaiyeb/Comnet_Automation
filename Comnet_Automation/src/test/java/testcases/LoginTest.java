package testcases;

import base.BaseClass;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseClass {
    @Test
    public void testLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("testUser", "password123");
    }
}
