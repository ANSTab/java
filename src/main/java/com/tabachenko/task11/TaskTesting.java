package com.tabachenko.task11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;


public class TaskTesting {

    public static class TaskTest {
        public static void main(String[] args) throws InterruptedException {
            File file = new File("D:\\Downloads\\chromedriver.exe");
            System.setProperty("webdriver.chrome.driver",file.getAbsolutePath());
            ChromeDriver webDriver = new ChromeDriver();
            webDriver.get("http://youtube.com");
            /*webDriver.findElements(By.xpath("//img[contains(@src,'https://i.ytimg.com/vi/1pfkXA1tLis/hq720.jpg?sqp=-oaymwEZCNAFEJQDSFXyq4qpAwsIARUAAIhCGAFwAQ==&rs=AOn4CLBl7Be9bKJrdngNL_hB5y89qlZ8mA')]"));
            Thread.sleep(5000);
            webDriver.quit();*/


        }
    }

}
