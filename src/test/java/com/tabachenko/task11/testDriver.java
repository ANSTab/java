package com.tabachenko.task11;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class testDriver {
    @Test
    public void taskTest() {
        File file = new File("D:\\Downloads\\Driver\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        ChromeDriver webDriver = new ChromeDriver();
        webDriver.get("https://ru.wikipedia.org/wiki");
        String title = webDriver.getTitle();
        Assert.assertTrue(title.contains("Википедия"));
        //webDriver.quit();
    }
}


