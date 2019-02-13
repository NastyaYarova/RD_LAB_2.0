package com.company.Lesson11;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FacebookLogInPage {
    private WebDriver driver;

    public FacebookLogInPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "//div[@class='_4rbf _53ij']")
    private WebElement elementError;

    public String elementErrorTxt() {
        String elementErrorTxt = elementError.getText();
        return elementErrorTxt;
    }

    public boolean compareErrorTxtWrongPass() {
        String elementErrorTxt = elementErrorTxt();

        if (elementErrorTxt.contains("Ви ввели неправильний пароль")) {
            return true;
        }
        if (elementErrorTxt.contains("The password you’ve entered is incorrect")) {
            return true;
        }
        if (elementErrorTxt.contains("Вы ввели неверный пароль")) {
            return true;
        } else {
            return false;
        }
    }

    public boolean compareErrorTxtWrongMail() {
        String elementErrorTxt = elementErrorTxt();

        if (elementErrorTxt.contains("Эл. адрес, который вы указали, не соответствует ни одному аккаунту")) {
            return true;
        }
        if (elementErrorTxt.contains("The email you’ve entered doesn’t match any account")) {
            return true;
        }
        if (elementErrorTxt.contains("Указана електронна адреса (або номер телефону) не пов'язана з жодним обліковим записом")) {
            return true;
        } else {
            return false;
        }
    }

}
