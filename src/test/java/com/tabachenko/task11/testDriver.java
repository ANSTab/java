package com.tabachenko.task11;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class testDriver {
    @Test
    public void taskTest() {
        File file = new File("D:\\Downloads\\Driver\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        ChromeDriver webDriver = new ChromeDriver();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.get("https://ru.wikipedia.org/wiki");
        String title = webDriver.getTitle();
        Assert.assertTrue(title.contains("Википедия"));

        WebElement element = webDriver.findElementByXPath("//a[text()='История']");
        System.out.println(element.getAttribute("href"));




        //webDriver.quit();
    }
}


