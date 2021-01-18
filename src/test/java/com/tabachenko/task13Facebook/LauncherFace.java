package com.tabachenko.task13Facebook;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class LauncherFace {

    @Test
    public void FacebookBot() {

        ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--disable-notifications");
        System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\Driver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver(ops);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        FacebookBot facebookBot = new FacebookBot(driver);
        facebookBot.openFacebook();
        facebookBot.putLoginFacebook("+380674725958");
        facebookBot.putPassFacebook("88910171");
        facebookBot.clickInFacebook();
        facebookBot.clickMessege();
        //facebookBot.foundProfile("Владимир Градиленко");
        facebookBot.foundProfile("Виктор Перепичаенко");

        //facebookBot.writeMessege("Привіт");
        //facebookBot.sendMessege();
        System.out.println(facebookBot.fpundMess());


    }
}