package com.yassir.testautomation.Interface.Interface.Interface.StepDefinitions;

import com.yassir.testautomation.Interface.Interface.Interface.pageobjects.interfaces.LoginPageObjectInterface;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



import java.util.concurrent.TimeUnit;

public class LoginSteps {
    private LoginPageObjectInterface loginPage;


    public LoginSteps() throws Exception {

    }

    public static WebDriver driver;
    String baseURL = "https://www.themoviedb.org/movie";



    @Given("the user is on login page")
    public void the_user_is_on_login_page() throws Exception {

        long start=System.currentTimeMillis();
        System.out.println("start time for page: "+ start);
        loginPage.goToWebSite();

    }
    @And("click Login Button")
    public void click_Login_button() throws Exception {

        loginPage.goToWebSite();

    }
    @When("The user enters valid credentials")
    public void the_user_enters_valid_credentials() throws Exception {
        loginPage.enterValidCredentials();

    }
    @When("Click Login Button")
    public void Click_Login_Button() throws Exception {

        loginPage.clickLoginButton();
    }
    @Then("The user should be logged in successfully")
    public void the_user_should_be_logged_in_successfully()throws Exception {

        loginPage.checkyourAccount();
    }

}
