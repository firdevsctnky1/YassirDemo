package com.yassir.testautomation.Interface.Interface.Interface.StepDefinitions;

import com.yassir.testautomation.Interface.Interface.Interface.pageobjects.interfaces.ChangeLanguagePageObjectInterface;
import com.yassir.testautomation.Interface.Interface.Interface.pageobjects.interfaces.LoginPageObjectInterface;
import com.yassir.testautomation.Interface.Interface.Interface.pageobjects.web.LoginPageObejct;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ChangeLanguageSteps   {


    private ChangeLanguagePageObjectInterface changeLanguagePage;
    private LoginPageObjectInterface login;

    public ChangeLanguageSteps() throws Exception{


    }

    @Given("^user is on home page$")
    public void user_is_on_home_page() throws Throwable {
        login.goToWebSite();

    }


    @Given("click the language button")
    public void click_the_language_button() throws Exception {
        changeLanguagePage.clickTranslateButton();

    }
    @When("choose English language")
    public void choose_English_lamguage() throws Exception {
       changeLanguagePage.chooseEnglishLan();

    }
    @And("click reload button")
    public void click_reload_buttom() throws Exception {
        changeLanguagePage.clickReloadButton();

    }
    @Then("you should see it is English")
    public void the_user_should_be_logged_in_successfully() throws Exception {
        changeLanguagePage.checkLanguae();


    }
}
