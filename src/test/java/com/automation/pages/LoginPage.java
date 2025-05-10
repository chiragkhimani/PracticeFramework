package com.automation.pages;

import com.automation.utils.PropertyReaderUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    //WebElement userName = driver.findElement(By.id("user-name"));
    @FindBy(id = "user-name")
    WebElement userName;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(id = "login-button")
    WebElement loginBtn;

    public void openWebsite() {
        driver.get(PropertyReaderUtils.getProperty("url"));
    }


    public void doLogin() {
        userName.sendKeys(PropertyReaderUtils.getProperty("userName"));
        password.sendKeys(PropertyReaderUtils.getProperty("password"));
        loginBtn.click();
    }



}
