package com.sentexpro.qa.pageobject;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.sentexpro.qa.utilities.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.sql.Driver;

public class TravelPage extends Base {

    public TravelPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
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


    public void travelpageclick() {
        Destination.isEnabled();
        Select select = new Select(Destination);
        select.selectByVisibleText("Canada");
    }
    public void regionclick() {
        region.isEnabled();
        Select select = new Select(region);
        select.selectByVisibleText("Montreal (YUL)");
    }

    public void departureclick() {
        Departure.isEnabled();
        Departure.sendKeys("04152023");

    }

    public void retrunclick() {
        Retrun.isEnabled();
        Retrun.sendKeys("05082023");
    }

    public void flyingfromclick() {
        FlyingFrom.isEnabled();
        FlyingFrom.sendKeys("(FAR) Hector Field");
        FlyingFrom.submit();
    }

    public void classclick() {
        Class.isEnabled();
        Select select = new Select(Class);
        select.selectByVisibleText("Business");

    }

    public void roomclick() {
        Rooms.isEnabled();
        Select select = new Select(Rooms);
        select.selectByVisibleText("2");
    }

    public void adultsclick() {
        Adults.isEnabled();
        Select select = new Select(Adults);
        select.selectByValue("3");
    }

    public void childrenclick() {
        Children.isEnabled();
        Select select = new Select(Children);
        select.selectByValue("0");

    }

    public void searchclick() {
        search.isEnabled();
        search.click();


    }


}
