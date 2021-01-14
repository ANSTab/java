package com.tabachenko.task12;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class SpamTestMailBot {

    @Test
    public void spamBot() {
        for (int i = 0; i <= 5; i++) {
            System.setProperty("webdriver.chrome.driver", "D:\\Downloads\\Driver\\chromedriver.exe");
            ChromeDriver driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            driver.get("https://accounts.ukr.net/login?client_id=9GLooZH9KjbBlWnuLkVX&drop_reason=logout");
            driver.findElementByXPath("//input[@type='text']").sendKeys("super.bots@ukr.net");
            driver.findElementByXPath("//input[@type='password']").sendKeys("Alex88910171");
            driver.findElementByXPath("//body/div[1]/div[1]/main[1]/form[1]/button[1]").click();
            driver.findElementByXPath("//button[contains(text(),'Написати листа')]").click();
            driver.findElementByXPath("//body/div[@id='page']/div[@id='content']/div[@id='screens']/div[1]/div[2]/section[1]/div[1]/div[4]/input[2]").sendKeys("imytiailnz@gmail.com");
            driver.findElementByXPath("//iframe[@id='mce_0_ifr']").sendKeys("НЕ ЗАБУВАЙ ПРАВИЛЬНО ЗАНОСИТИ ПАРТІЇ ЗЗР!!!!!!!!!!ЩЕ РАЗ ТАКЕ БУДЕ, ЗАПУЩУ БОТА НА 1000 ЛИСТІВ!!! ");
            driver.findElementByXPath("//body/div[@id='page']/div[@id='content']/div[@id='screens']/div[1]/div[2]/div[1]/button[1]").click();
            driver.quit();
            System.out.println("Лист " + i);
        }
    }
}
