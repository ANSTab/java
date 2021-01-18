package com.tabachenko.task12;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LauncherTest {
    @Test
    public void spamBot() {

        System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\Driver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        SpamTestPageObj spamTestPageObj = new SpamTestPageObj(driver);
        spamTestPageObj.openPage();
        spamTestPageObj.enterName("super.bots@ukr.net");
        spamTestPageObj.enterPass("Alex88910171");
        spamTestPageObj.clickLoginPage();

        for (int i = 0; i <= 2; i++) {
            spamTestPageObj.createMess();
            spamTestPageObj.putEmail("ast.tovlnz@gmail.com");
            spamTestPageObj.putTextInMessege("working good");
            spamTestPageObj.sendMessege();
        }
        spamTestPageObj.quitEmail();
    }
}
