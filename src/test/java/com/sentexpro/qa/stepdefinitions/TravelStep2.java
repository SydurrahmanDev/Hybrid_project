package com.sentexpro.qa.stepdefinitions;

import com.sentexpro.qa.pageobject.HomePage;
import com.sentexpro.qa.pageobject.TravelPage2;
import com.sentexpro.qa.utilities.PropertiesReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;

public class TravelStep2 {
    private WebDriver driver = Hooks.driver;
    PropertiesReader obj = new PropertiesReader();
    HomePage home = new HomePage(driver);
    TravelPage2 travels = new TravelPage2(driver);


    @Given("costco travel page click")
    public void costco_travel_page_click() {
        home.HomePagedisplay();
        home.travelbuttonclick();

    }

    @When("choose my destination {string} and region {string}")
    public void choose_my_destination_and_region(String destination_name, String region_name) {
        travels.travelpageclick(destination_name);
        travels.regionclick(region_name);


    }


    @Then("choose the departure {string} and return {string}")
    public void choose_the_departure_and_return(String departure_date, String return_date) {
        travels.departureclick(departure_date);
        travels.retrunclick(return_date);

    }

    @Then("choose the departure airport {string} and class {string}")
    public void choose_the_departure_airport_and_class(String departure_airport, String class_name) throws InterruptedException {
        travels.flyingfromclick(departure_airport);
        Thread.sleep(5000);
        travels.classclick(class_name);

    }

    @Then("choose rooms {string}, {string} ,{string}")
    public void choose_rooms(String room_n, String adults, String children) {
        travels.roomclick(room_n);
        travels.adultsclick(adults);
        travels.childrenclick(children);


    }

    @Then("enter search")
    public void enter_search() throws InterruptedException {
        travels.searchclick();
        Thread.sleep(10000);
      //  String title="Costco Travel";
       // Assertions.assertEquals(title,driver.getTitle());
        System.out.printf(driver.getTitle());



    }


}
