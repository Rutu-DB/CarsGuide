package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

public class UsedCarSearchPage extends Utility {
    private static final Logger log = LogManager.getLogger(UsedCarSearchPage.class.getName());

    @FindBy(xpath = "//h1[contains(text(),'Used Cars For Sale')]")
    WebElement _verifyUsedCarText;

    @FindBy(xpath = "//select[@id='makes']")
    WebElement _anyMakeField;

    @FindBy(xpath = "//select[@id='models']")
    WebElement _anyModel;

    @FindBy(xpath = "//select[@id='locations']")
    WebElement _anyLocation;

    @FindBy(xpath = "//select[@id='priceTo']")
    WebElement _price;


    @FindBy(xpath = "//input[@id='search-submit']")
    WebElement _findMyNextCarBtn;

    public void verifyUsedCarPage() {

        Reporter.log("Verifies that User is on Used Car Search Page " + _verifyUsedCarText.toString() + "<br>");
        log.info("Verifies that user is on Used car Search Page " + _verifyUsedCarText.toString());
        String actualMessage = "Used Cars For Sale";
        Assert.assertEquals(actualMessage, getTextFromElement(_verifyUsedCarText));
    }


    // This method clicks on Any Make Field
    public void selectAnyMakeDropdown(String brand) {
        Reporter.log("Clicks on Any Make Field " + _anyMakeField.toString() + "<br>");
        log.info("Clicks on Any Make Field " + _anyMakeField.toString());
        selectByVisibleTextFromDropDown(_anyMakeField, brand);
    }

    //This method selects on Any Model Dropdown
    public void selectAnyModelDropdown(String model) {
        Reporter.log("This method selects Model" + _anyModel.toString() + "<br>");
        log.info("This method selects Model " + _anyModel.toString());
        selectByVisibleTextFromDropDown(_anyModel, model);
    }

    // This method selects  Any Location from Dropdown
    public void selectAnyLocationFromDropDown(String location) {
        Reporter.log("This method selects Location from DropDown " + _anyLocation.toString() + "<br>");
        log.info("This method selects Location " + _anyLocation.toString());
        selectByVisibleTextFromDropDown(_anyLocation, location);
    }

    //This method selects Price from Dropdown
    public void selectPriceFromDropDown(String amount) {
        Reporter.log("This selects price " + _price.toString() + "<br>");
        log.info("This method selects price " + _price.toString());
        selectByVisibleTextFromDropDown(_price, amount);
    }

    // This method clicks on Find my Next Car Button
    public void clickOnFindMyNextCarButton() {
        Reporter.log("This clicks on Find My Next Car Button " + _findMyNextCarBtn.toString() + "<br>");
        log.info("This clicks on Find My Next Car Button " + _findMyNextCarBtn.toString());
        clickOnElement(_findMyNextCarBtn);


    }
}