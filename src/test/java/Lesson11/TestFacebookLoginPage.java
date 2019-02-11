package Lesson11;

import com.company.Lesson11.FacebookEnterPage;
import com.company.Lesson11.FacebookLogInPage;
import com.company.Lesson11.GoogleMainPage;
import com.company.Lesson11.GoogleSearchPage;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class TestFacebookLoginPage {
    static WebDriver driver;
    static GoogleMainPage googleMainPage;
    static GoogleSearchPage googleSearchPage;
    static FacebookEnterPage facebookEnterPage;
    static FacebookLogInPage facebookLogInPage;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        GoogleMainPage googleMainPage = PageFactory.initElements(driver, GoogleMainPage.class);
        googleMainPage.inputText("facebook");
        googleMainPage.enterSearch();
        GoogleSearchPage googleSearchPage = PageFactory.initElements(driver, GoogleSearchPage.class);
        googleSearchPage.clickLink();
    }

    @Test
    public void checkWrongPassword() {
        FacebookEnterPage facebookEnterPage = PageFactory.initElements(driver, FacebookEnterPage.class);
        facebookEnterPage.signUp("+0980261901", "111111111");
        facebookEnterPage.clickButtonLog();
        FacebookLogInPage facebookLogInPage = PageFactory.initElements(driver, FacebookLogInPage.class);
        Assert.assertTrue(facebookLogInPage.compareErrorTxtWrongPass());
    }

    @Test
    public void checkWrongMail() {
        FacebookEnterPage facebookEnterPage = PageFactory.initElements(driver, FacebookEnterPage.class);
        facebookEnterPage.signUp("sdfvsdfvs@gmail.com", "2130921309");
        facebookEnterPage.clickButtonLog();
        FacebookLogInPage facebookLogInPage = PageFactory.initElements(driver, FacebookLogInPage.class);
        Assert.assertTrue(facebookLogInPage.compareErrorTxtWrongMail());
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
