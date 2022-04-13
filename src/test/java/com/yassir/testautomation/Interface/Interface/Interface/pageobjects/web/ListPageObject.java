package com.yassir.testautomation.Interface.Interface.Interface.pageobjects.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ListPageObject extends BasePageObject {


    private String menuMovieXPath="(//a[@href='/movie'])[1]";
    private String clickPopularXPath="(//a[contains(.,'Popular')])[1]";
    private String btnSortResultByXPath="(//span[@unselectable='on'][contains(.,'Popularity Descending')])[3]";
    private String btnSortResult2ByXPath="(//li[@tabindex='-1'])[2]";
    private String btnSearchXPath="(//a[contains(.,'Search')])[1]";
    private String checkFilterXPath="(//span[contains(@unselectable,'on')])[4]";


    public ListPageObject(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void clickSortResultsByButton() throws InterruptedException {
        driver.findElement(By.xpath(btnSortResultByXPath)).click();
        driver.wait(200);


    }
    public void selectPopularity() throws InterruptedException {

        driver.findElement(By.xpath(btnSortResult2ByXPath)).click();
    }
    public void clickSearchButton() throws InterruptedException {

        driver.findElement(By.xpath(btnSearchXPath)).click();
        driver.wait(1000);
    }
    public void checkfilter() throws InterruptedException {

        driver.findElement(By.xpath(checkFilterXPath)).getText().contains("Popularity Ascending");
        driver.wait(1000);
    }
}
