package com.tabachenko.task12;

import org.openqa.selenium.chrome.ChromeDriver;


public class SpamTestPageObj {
    private ChromeDriver driver;

    SpamTestPageObj(ChromeDriver driver) {
        this.driver = driver;
    }

    void openPage() {
        driver.get("https://accounts.ukr.net/login?client_id=9GLooZH9KjbBlWnuLkVX&drop_reason=logout");
    }

    void enterName(String name) {
        driver.findElementByXPath("//input[@type='text']").sendKeys(name);
    }

    void enterPass(String pass) {
        driver.findElementByXPath("//input[@type='password']").sendKeys(pass);
    }

    void clickLoginPage() {
        driver.findElementByXPath("//body/div[1]/div[1]/main[1]/form[1]/button[1]").click();
    }

    void createMessege() {
        driver.findElementByXPath("//button[contains(text(),'Написати листа')]").click();
    }

    void createMess() {
        driver.findElementsByCssSelector("body.theme-white:nth-child(2) div:nth-child(1) div:nth-child(2) aside.sidebar:nth-child(1) > button.default.compose").get(0).click();
    }

    void putEmail(String email) {
        driver.findElementByXPath("//body/div[@id='page']/div[@id='content']/div[@id='screens']/div[1]/div[2]/section[1]/div[1]/div[4]/input[2]").sendKeys(email);
    }

    void putTextInMessege(String messege) {
        driver.findElementByXPath("//iframe[@src='about:blank']").sendKeys(messege);

    }

    void putTextInMess(String messege) {
        driver.findElementsByClassName("#mce_1_ifr").get(0).sendKeys(messege);
    }

    void sendMessege() {
        driver.findElementByXPath("//body/div[@id='page']/div[@id='content']/div[@id='screens']/div[1]/div[2]/div[1]/button[1]").click();
    }

    void sendMess() {
        driver.findElementsByCssSelector("body.theme-white:nth-child(2) div:nth-child(3)" +
                " div.sendmsg.screen div.screen__content div.sendmsg__bottom-controls > button.default.send:nth-child(1)").get(0).click();
    }

    void quitEmail() {
        driver.quit();
    }
}




