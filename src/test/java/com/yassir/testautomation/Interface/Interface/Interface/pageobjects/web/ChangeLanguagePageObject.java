package com.yassir.testautomation.Interface.Interface.Interface.pageobjects.web;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChangeLanguagePageObject extends BasePageObject {


    private String TranslateBtnXpath = "(//div[contains(.,'tr')])[5]";
    private String TranslateTRXpath = "(//span[@unselectable='on'][contains(.,'Türkçe (tr-TR)')])[3]";
    private String TranslateListBoxXPath = "(//input[@class='k-textbox'])[4]";
    private String TranslateEngXPath = "(//li[@tabindex='-1'][contains(.,'İngilizce (en-US)')])[1]";
    private String ReloadBtnXPath = "//a[contains(.,'Sayfayı Yenile')]";
    private String checkLanguageXPath = "(//div[contains(.,'en')])[5]";

    public ChangeLanguagePageObject(WebDriver driver, WebDriverWait wait) throws InterruptedException {
        super(driver, wait);

        public void changeTranslate () throws InterruptedException {

            driver.findElement(By.xpath(TranslateEngXPath)).click();
            driver.wait(1000);


        }


        private void clickTranslateButton () throws InterruptedException {
            driver.findElement(By.xpath(TranslateBtnXpath)).click();
            driver.wait(1000);
        }
        private void chooseEnglishLan () throws InterruptedException {
            driver.findElement(By.xpath(TranslateTRXpath)).click();
            driver.wait(1000);
            driver.findElement(By.xpath(TranslateListBoxXPath)).sendKeys("en-US");
            driver.wait(200);
        }
        private void clickReloadButton() throws InterruptedException {
            driver.findElement(By.xpath(ReloadBtnXPath)).click();
            driver.wait(2000);
        }
        private void checkLanguae() throws InterruptedException {
            driver.findElement(By.xpath(checkLanguageXPath)).click();
            driver.wait(2000);
        }

    }

}