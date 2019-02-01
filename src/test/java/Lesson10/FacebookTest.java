package Lesson10;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class FacebookTest {

    public void testLogPass(){

        //TODO: please commit "chromedriver.exe" to Git.
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Usage of waiters - good!
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://www.google.com/");

        WebElement search = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
        search.sendKeys("facebook");
        search.sendKeys(Keys.RETURN);

        WebElement findfacebook = driver.findElement(By.xpath("//a[@href='https://uk-ua.facebook.com/']//cite[@class='iUh30']"));
        findfacebook.click();

        WebElement findMail = driver.findElement(By.xpath("//input[@ id='email']"));
        findMail.sendKeys("+380980261901");

        WebElement findPass = driver.findElement(By.xpath("//input[@ id='pass']"));
        findPass.sendKeys("11111111");

        WebElement buttonLogin = driver.findElement(By.xpath("//input[@id='u_0_2']"));
        buttonLogin.sendKeys(Keys.RETURN);

        WebElement elementError = driver.findElement(By.xpath("//div[@class='_4rbf _53ij']"));

        //TODO: Add error message verification here.

        driver.quit();
    }

    public static void main(String[] args) {

        FacebookTest testLogPass = new FacebookTest();
        testLogPass.testLogPass();

    }
}
