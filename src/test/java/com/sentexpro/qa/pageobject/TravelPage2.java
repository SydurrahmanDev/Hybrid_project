package com.sentexpro.qa.pageobject;

import com.sentexpro.qa.utilities.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TravelPage2 extends Base {

    public TravelPage2(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);

    }


    @FindBy(id = "vacation_package_destination")
    @CacheLookup
    WebElement Destination;

    @FindBy(id = "region")
    @CacheLookup
    WebElement region;

    @FindBy(id = "departureDateWidget")
    @CacheLookup
    WebElement Departure;

    @FindBy(id = "returnDateWidget")
    @CacheLookup
    WebElement Retrun;
    @FindBy(id = "departureCityTextWidget")
    @CacheLookup
    WebElement FlyingFrom;
    @FindBy(id = "serviceClassWidget")
    @CacheLookup
    WebElement Class;
    @FindBy(xpath = "//*[@id=\"number_of_rooms_widget\"]/select")
    @CacheLookup
    WebElement Rooms;
    @FindBy(id = "adultsInRoomForWidget_1")
    @CacheLookup
    WebElement Adults;
    @FindBy(id = "childrenInRoomForWidget_1")
    @CacheLookup
    WebElement Children;
    @FindBy(xpath ="//*[@id=\"vpSearchSubmitId\"]/button")
    @CacheLookup
    WebElement search;


    public void travelpageclick(String destination_name ) {
        Destination.isEnabled();
        Select select = new Select(Destination);
        select.selectByVisibleText(destination_name);
    }
    public void regionclick(String region_name ) {
        region.isEnabled();
        Select select = new Select(region);
        select.selectByVisibleText(region_name);
    }

    public void departureclick(String departure_date) {
        Departure.isEnabled();
        Departure.sendKeys(departure_date);

    }

    public void retrunclick(String return_date) {
        Retrun.isEnabled();
        Retrun.sendKeys(return_date);
    }

    public void flyingfromclick(String departure_airport) {
        FlyingFrom.isEnabled();
        FlyingFrom.sendKeys(departure_airport);
        FlyingFrom.click();
    }

    public void classclick(String class_name) {
        Class.isEnabled();
        Select select = new Select(Class);
        select.selectByVisibleText(class_name);

    }

    public void roomclick(String room_n) {
        Rooms.isEnabled();
        Select select = new Select(Rooms);
        select.selectByVisibleText(room_n);
    }

    public void adultsclick(String adults ) {
        Adults.isEnabled();
        Select select = new Select(Adults);
        select.selectByValue(adults);
    }

    public void childrenclick(String children) {
        Children.isEnabled();
        Select select = new Select(Children);
        select.selectByValue(children);

    }

    public void searchclick( ) {
        search.isEnabled();
        search.click();


    }


}
























