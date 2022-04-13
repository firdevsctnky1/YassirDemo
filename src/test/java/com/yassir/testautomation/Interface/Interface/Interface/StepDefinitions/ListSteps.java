package com.yassir.testautomation.Interface.Interface.Interface.StepDefinitions;

import com.yassir.testautomation.Interface.Interface.Interface.pageobjects.interfaces.ChangeLanguagePageObjectInterface;
import com.yassir.testautomation.Interface.Interface.Interface.pageobjects.interfaces.ListPageObjectInterface;
import com.yassir.testautomation.Interface.Interface.Interface.pageobjects.interfaces.LoginPageObjectInterface;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ListSteps {


    private ListPageObjectInterface listPage;
    private LoginPageObjectInterface login;

    public ListSteps() throws Exception{


    }
    @Given("the user is on home page")
    public void the_user_is_on_home_page() throws Exception {

        login.goToWebSite();

    }
    @And("Click Sort Results By list button")
    public void Click_Sort_Results_By_list_button() throws Exception {

        login.goToWebSite();

    }
    @When("click Popularity Ascending list button")
    public void click_Popularity_Ascending_list_button() throws Exception {
        listPage.selectPopularity();

    }
    @When("Click Search Buttonn")
    public void Click_Search_Button() throws Exception {

        listPage.clickSearchButton();
    }
    @Then("The user should see to filter for popular movies")
    public void the_user_should_see_to_filter_for_popular_movies()throws Exception {

        listPage.checkfilter();
    }

}
