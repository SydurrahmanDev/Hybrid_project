package com.sentexpro.qa.stepdefinitions;

import com.sentexpro.qa.pageobject.HomePage;
import com.sentexpro.qa.pageobject.LoginPage;
import com.sentexpro.qa.utilities.PropertiesReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class LoginStep {

  private   WebDriver driver=Hooks.driver;

    PropertiesReader obj=new PropertiesReader();
    HomePage home=new HomePage(driver);
    LoginPage login=new LoginPage(driver);


  //  public LoginStep() {
     //   PropertiesReader obj=new PropertiesReader();

   // }

    @Given("Login from in log page")
    public void login_from_in_log_page() {

       // HomePage home=new HomePage(driver);
        home.HomePagedisplay();
        home.clicksigninbutton();
        home.captureScreen();


    }

    @When("Submit email using {string} and password using {string}")
    public void submit_email_using_and_password_using(String email, String password) {
      //  LoginPage login=new LoginPage(driver);
        login.fillemail(email);
        login.fillpassword(password);
        login.captureScreen();







    }









}
