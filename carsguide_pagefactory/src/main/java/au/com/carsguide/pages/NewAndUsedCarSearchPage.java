package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

public class NewAndUsedCarSearchPage extends Utility {

    private static final Logger log = LogManager.getLogger(NewAndUsedCarSearchPage.class.getName());

    @FindBy(xpath = "//h1[contains(text(),'New & Used Car Search - carsguide')]")
    WebElement _verifySearchCarText;

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

       // This method verifies user is on New and Used Cars Search
    public void verifyUserIsOnNewAndUsedCarSearchPage() {
        Reporter.log("Verifies that User is on New & Used Car Search Page " + _verifySearchCarText.toString() + "<br>");
        log.info("Verifies that user is on New & Used car Search Page " + _verifySearchCarText.toString());
        String actualMessage = "New & Used Car Search - carsguide";
        Assert.assertEquals(actualMessage, getTextFromElement(_verifySearchCarText));
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
