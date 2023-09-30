package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.xml.DOMConfigurator;
import org.junit.Assert;
import pages.LoginPage;
import utils.CommonMethods;
import utils.ConfigReader;
import utils.Log;

public class LoginSteps extends CommonMethods {

    @When("user enters valid admin username and password")
    public void user_enters_valid_admin_username_and_password() {
        DOMConfigurator.configure("log4j.xml");
        Log.startTestCase("CircleBi test start ");
        sendText(ConfigReader.getPropertyValue("username"), loginPage.usernameField);
        Log.info("my username has been entered");
        sendText(ConfigReader.getPropertyValue("password"), loginPage.passwordField);
        Log.info("My password has been entered");
    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        click(loginPage.loginButton);
    }
    @Then("user is successfully logged in the application")
    public void user_is_successfully_logged_in_the_application() {
        String actualTitle = driver.getTitle();
        String expectedTitle = "Raycorp Cloud - DEV";
        Assert.assertEquals(actualTitle,expectedTitle);
    }

    @When("user enters invalid admin user and password")
    public void user_enters_invalid_admin_user_and_password() {
        sendText("admin123", loginPage.usernameField);
        sendText("Hum#n", loginPage.passwordField);
    }
    @Then("error message displayed")
    public void error_message_displayed() {
        System.out.println("Error message is displayed");
    }

}
