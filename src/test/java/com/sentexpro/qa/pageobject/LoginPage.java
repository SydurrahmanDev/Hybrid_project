package com.sentexpro.qa.pageobject;

import com.sentexpro.qa.utilities.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Base {


    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);

    }

    @FindBy(id = "signInName")
    @CacheLookup
    WebElement emailadress;

    @FindBy(id = "password")
    @CacheLookup
    WebElement passwordfield;
public  void fillemail(String email){
    emailadress.isEnabled();
    emailadress.clear();
    emailadress.sendKeys(email);
}
public  void fillpassword(String password){
passwordfield.isEnabled();
passwordfield.clear();
passwordfield.sendKeys(password);




}







}
