package com.company.Lesson9;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) {
        System.out.println("hallo");
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        WebElement element = driver.findElement(By.xpath("//input[@title = 'Пошук']"));
        element.sendKeys("Who is Zarina?");
        element.sendKeys(Keys.RETURN);


        driver.quit();
    }
}
