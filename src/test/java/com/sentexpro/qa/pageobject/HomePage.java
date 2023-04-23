package com.sentexpro.qa.pageobject;

import com.sentexpro.qa.utilities.Base;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Base {

    public HomePage(WebDriver driver) {
        super(driver);

        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "search-field")
    @CacheLookup
    WebElement searchbutton;

    @FindBy(id = "header_sign_in")
    @CacheLookup
    WebElement signinbutton;

    @FindBy(id="Home_Ancillary_8")
    WebElement Travelbutton;


    public Boolean HomePagedisplay(){

        searchbutton.isDisplayed();
        signinbutton.isDisplayed();
        return true;
    }
    public  void clicksigninbutton(){
        signinbutton.isEnabled();
        signinbutton.click();
    }
    public void travelbuttonclick(){
      Travelbutton.isEnabled();
      Travelbutton.click();



    }






}
