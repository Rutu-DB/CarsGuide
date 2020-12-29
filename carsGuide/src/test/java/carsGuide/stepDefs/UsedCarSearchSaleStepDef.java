package carsGuide.stepDefs;

import carsGuide.pages.AudiA4Page;
import carsGuide.pages.HomePage;
import carsGuide.pages.NewAndUsedCarSearchPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class UsedCarSearchSaleStepDef {


    @And("^click on submenu Used Search link$")
    public void clickOnSubmenuUsedSearchLink() {
        new HomePage().clickOnUsedCarSearchLink();
    }

    @And("^select carMaker \"([^\"]*)\" from AnyMake dropdown$")
    public void selectCarMakerFromAnyMakeDropdown(String brand)  {
        new NewAndUsedCarSearchPage().selectAnyMakeDropdown(brand);


    }
    @And("^select carModel \"([^\"]*)\" from AmyModel dropdown$")
    public void selectCarModelFromAmyModelDropdown(String model){
    new NewAndUsedCarSearchPage().selectAnyModelDropdown(model);
    }

    @And("^select location \"([^\"]*)\"  from SelectLocation dropdown$")
    public void selectLocationFromSelectLocationDropdown(String loc) {
        new NewAndUsedCarSearchPage().selectAnyLocationFromDropDown(loc);
    }

    @And("^select price \"([^\"]*)\" from price dropdown$")
    public void selectPriceFromPriceDropdown(String amt) {
    new NewAndUsedCarSearchPage().selectPriceFromDropDown(amt);
    }

    @And("^click on Find_My_Car button$")
    public void clickOnFind_My_CarButton() {
        new NewAndUsedCarSearchPage().clickOnFindMyNextCarButton();
    }

    @Then("^I should see list of Used cars \"([^\"]*)\"$")
    public void iShouldSeeListOfUsedCars(String arg0)  {
    new AudiA4Page().verifyUserShouldNavigateSuccessfully();
    }

    @And("^the page title should match expected title  \"([^\"]*)\"$")
    public void thePageTitleShouldMatchExpectedTitle(String title) {
        Assert.assertEquals(title,new AudiA4Page().getAudiPageTitle());
    }
}
