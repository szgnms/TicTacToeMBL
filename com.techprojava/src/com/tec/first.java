package com.tec;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.sql.SQLOutput;
import java.util.List;

public class first {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/Users/ms/Documents/selenium dependecies/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.name("q")).sendKeys("java t");
        Thread.sleep(10000);
        List<WebElement> list = driver.findElements(By.xpath("//ul[@role'listbox']//li/descendant::div[@class='sbl1']"));
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            String listitem=list.get(i).getText();
            System.out.println(listitem);
            if (listitem.contains("java tutorial")) {
                list.get(i).click();
                break;
            }
        }
    }
}
