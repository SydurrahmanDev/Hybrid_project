package com.sentexpro.qa.stepdefinitions;

import com.sentexpro.qa.pageobject.HomePage;
import com.sentexpro.qa.pageobject.TravelPage;
import com.sentexpro.qa.pageobject.TravelPage;
import com.sentexpro.qa.utilities.PropertiesReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class Travelstep {

    private WebDriver driver=Hooks.driver;
    PropertiesReader obj=new PropertiesReader();
    HomePage home=new HomePage(driver);
    TravelPage travel=new TravelPage(driver);





    @Given("select the travel page")
    public void select_the_travel_page() {
        home.HomePagedisplay();
        home.travelbuttonclick();
        home.captureScreen();




    }
    @When("fill up the travel visible page")
    public void fill_up_the_travel_visible_page() {
        travel.travelpageclick();
        travel.regionclick();
        travel.departureclick();
        travel.retrunclick();
        travel.flyingfromclick();
        travel.classclick();
        travel.roomclick();
        travel.adultsclick();
        travel.childrenclick();
        travel.captureScreen();







    }
    @Then("after fill up search button validation")
    public void after_fill_up_search_button_validation() {

        travel.searchclick();



    }










}
