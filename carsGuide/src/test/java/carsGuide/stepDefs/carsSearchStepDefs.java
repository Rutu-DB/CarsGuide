package carsGuide.stepDefs;

import carsGuide.pages.BMW1SeriesPage;
import carsGuide.pages.HomePage;
import carsGuide.pages.NewAndUsedCarSearchPage;
import carsGuide.utility.Utility;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

public class carsSearchStepDefs {
    HomePage homePage = new HomePage();
    NewAndUsedCarSearchPage newAndUsedCarSearchPage = new NewAndUsedCarSearchPage();
    BMW1SeriesPage bmw1SeriesPage = new BMW1SeriesPage();
Utility utils = new Utility();
    // This method opens Home Page
    @Given("^I am on the Home Page of CarsGuide Website$")
    public void iAmOnTheHomePageOfCarsGuideWebsite() {
    }

    // This method mouse Hover to Buy and Sell Links
    @When("^I mouse hover to buy\\+sell Menu$")
    public void iMouseHoverToBuySellMenu() {
        homePage.mouseHoverToBuySellLink();
    }

    // This method  clicks on Search Car link
    @And("^click on Search Cars link$")
    public void clickOnSearchCarsLink() {
        homePage.clickOnSearchLink();
    }

    // this method selects Make
    @And("^select car brand as \"([^\"]*)\" from AnyMake dropdown$")
    public void selectCarBrandAsFromAnyMakeDropdown(String make) {
        newAndUsedCarSearchPage.selectAnyMakeDropdown(make);
    }

    // This method selects Model
    @And("^select \"([^\"]*)\" as car model$")
    public void selectAsCarModel(String model) {
        newAndUsedCarSearchPage.selectAnyModelDropdown(model);
    }

    // This method selects Location
    @And("^select location as \"([^\"]*)\" from Select Location dropdown$")
    public void selectLocationAsFromSelectLocationDropdown(String loc) {
        newAndUsedCarSearchPage.selectAnyLocationFromDropDown(loc);
    }
// This method selects Price
    @And("^select \"([^\"]*)\" as price$")
    public void selectAsPrice(String amt){
        newAndUsedCarSearchPage.selectPriceFromDropDown(amt);
    }
    // This method clicks on Next Car Button
    @And("^click on Find_My_Next_Car button$")
    public void clickOnFind_My_Next_CarButton() {
    newAndUsedCarSearchPage.clickOnFindMyNextCarButton();
    }
    //This method verifies searched cars list
    @Then("^I should see list of searched cars \"([^\"]*)\"$")
    public void iShouldSeeListOfSearchedCars(String arg0)  {
        bmw1SeriesPage.verifyUserNavigatesToBMWSeries1Page();
    }

    @And("^the page title should be \"([^\"]*)\"$")
    public void thePageTitleShouldBe(String arg0)  {
        bmw1SeriesPage.verifyGetTitleMessage();
    }
}
