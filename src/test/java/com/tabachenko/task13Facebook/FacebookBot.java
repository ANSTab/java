package com.tabachenko.task13Facebook;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FacebookBot {
    private ChromeDriver driver;

    public FacebookBot(ChromeDriver driver) {
        this.driver = driver;
    }

    void openFacebook() {
        driver.get("https://uk-ua.facebook.com/");
    }

    void putLoginFacebook(String login) {
        driver.findElementByXPath("//input[@type='text']").sendKeys(login);
    }

    void putPassFacebook(String pass) {
        driver.findElementByXPath("//input[@type='password']").sendKeys(pass);
    }

    void clickInFacebook() {
        driver.findElementByXPath("//button[@class='_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy']").click();
    }

    void clickMessege() {
        driver.findElementByXPath("//i[@class='hu5pjgll m6k467ps sp_hkVGitszFKY sx_d0acbc']/parent::div/parent::div").click();

    }

    void foundProfile(String profile) {

        driver.findElementByXPath("//input[@role='textbox']").sendKeys(profile);
        driver.findElementByXPath("//span[@class='a8c37x1j ni8dbmo4 stjgntxs l9j0dhe7 ltmttdrg g0qnabr5']/child::span[@class='scb9dxdr']").click();
    }

    void writeMessege(String messege) {
        driver.findElementByXPath("//body/div[@id='mount_0_0']" +
                "/div[1]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]/div[1]" +
                "/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/form[1]/div[1]" +
                "/div[3]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]").sendKeys(messege);
    }

    void sendMessege() {
        driver.findElementByXPath("//div[@class='oajrlxb2 gs1a9yip g5ia77u1" +
                " mtkw9kbi tlpljxtp qensuy8j ppp5ayq2 goun2846 ccm00jje s44p3ltw mk2mc5f4" +
                " rt8b4zig n8ej3o3l agehan2d sk4xxmp2 rq0escxv nhd2j8a9 pq6dq46d mg4g778l btwxx1t3 " +
                "pfnyh3mw p7hjln8o knvmm38d cgat1ltu bi6gxh9e kkf49tns tgvbjcpo hpfvmrgz cxgpxx05 dflh9lhu " +
                "sj5x9vvc scb9dxdr l9j0dhe7 i1ao9s8h esuyzwwr f1sip0of du4w35lb lzcic4wl abiwlrkh p8dawk7l']").click();

    }

    String fpundMess(){
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
       String mess= driver.findElementByXPath("//div[@class='oo9gr5id']").getText();

       return mess;
    }

}

