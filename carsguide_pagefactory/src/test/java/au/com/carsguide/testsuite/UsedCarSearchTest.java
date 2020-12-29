package au.com.carsguide.testsuite;

import au.com.carsguide.pages.AudiA4Page;
import au.com.carsguide.pages.HomePage;
import au.com.carsguide.pages.UsedCarSearchPage;
import au.com.carsguide.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UsedCarSearchTest extends TestBase {
    HomePage homePage;
    UsedCarSearchPage usedCarSearchPage;
    AudiA4Page audiA4Page;

    @BeforeMethod (groups = {"Sanity","Regression"})
    public void setUp() {

        homePage = new HomePage();
        usedCarSearchPage = new UsedCarSearchPage();
        audiA4Page = new AudiA4Page();
    }

    @Test(groups = {"Sanity","Regression"})
    public void verifyUserCanNavigateUsedCarsPage() {
        homePage.mouseHoverToBuySellLink();
        homePage.clickOnUsedCarSearchLink();
        usedCarSearchPage.verifyUsedCarPage();
        usedCarSearchPage.selectAnyMakeDropdown("Audi");
        usedCarSearchPage.selectAnyModelDropdown("A4");
        usedCarSearchPage.selectAnyLocationFromDropDown("SA - All");
        usedCarSearchPage.selectPriceFromDropDown("$20,000");
        usedCarSearchPage.clickOnFindMyNextCarButton();
        audiA4Page.verifyUserShouldNavigateSuccessfully();
        audiA4Page.getAudiPageTitle();

    }


}
