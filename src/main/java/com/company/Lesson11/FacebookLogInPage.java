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

//    public String elementErrorTxt() {
//        String elementErrorTxt = elementError.getText();
//        return elementErrorTxt;
//    }

    public boolean compareErrorTxt() {

//        String txtEn = "The email or phone number you’ve entered doesn’t match any account.";
//        String txtRu = "Вы ввели неверный пароль.";
//        String txtUa = "Ви ввели неправильний пароль. Забули пароль?";
//        String elementErrorTxt = elementErrorTxt();
//        boolean testResult;
//
//        if (elementErrorTxt.contains(txtEn)) {
//            testResult = true;
//        }if (elementErrorTxt.contains(txtRu)) {
//            testResult = true;
//        }if (elementErrorTxt.contains(txtUa)) {
//            testResult = true;
//        } else {
//            testResult = false;
//        }
//        return testResult;
        String elementErrorTxt = elementError.getText();
       // return elementErrorTxt;

        if (elementErrorTxt.contains("Ви ввели неправильний пароль")) {

            return true;
        }
        if (elementErrorTxt.contains("The email or phone number you’ve entered doesn’t match any account.")) {

            return true;
        }
        if (elementErrorTxt.contains("Вы ввели неверный пароль")) {

            return true;
        } else {

            return false;
        }
    }
}
