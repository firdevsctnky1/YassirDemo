package com.yassir.testautomation.Interface.Interface.Interface.pageobjects.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPageObejct extends BasePageObject {

    private String btnLoginXPath="(//a[@href='/login'][contains(.,'Login')])[1]";
    private String txtAcLoginXPath="//h2[contains(.,'Login to your account')]";
    private String userNameID="username";
    private String passwordID="password";
    private String btnLoginID="login_button";
    private String accountXpath="(//a[@href='/u/Firdevsctnky'])[3]";



    public LoginPageObejct(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    String baseURL = "https://www.themoviedb.org/movie";


    public  void goToWebSite() throws InterruptedException {
        driver.get(baseURL);
         driver.wait(200);
    }



    public void clickLoginButton() throws InterruptedException {
        driver.findElement(By.xpath(btnLoginXPath)).click();
        driver.findElement(By.xpath(txtAcLoginXPath)).getText().contains("Login to your account");



    }
    public void enterValidCredentials() throws InterruptedException {

        driver.findElement(By.id(userNameID)).sendKeys("Firdevsctnky");
        driver.findElement(By.id(passwordID)).sendKeys("126559");


    }
    public void clickLogginButton() throws InterruptedException {
        driver.findElement(By.id(btnLoginID)).click();
        driver.wait(200);


    }
    public void checkyourAccount() throws InterruptedException {
        driver.findElement(By.xpath(accountXpath)).getText().contains("Firdevsctnky");
        driver.wait(200);


    }


}
