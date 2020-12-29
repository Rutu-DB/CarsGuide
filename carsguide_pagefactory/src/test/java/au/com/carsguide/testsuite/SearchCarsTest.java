package au.com.carsguide.testsuite;

import au.com.carsguide.pages.BMW1SeriesPage;
import au.com.carsguide.pages.HomePage;
import au.com.carsguide.pages.NewAndUsedCarSearchPage;
import au.com.carsguide.testbase.TestBase;
import au.com.carsguide.utility.Utility;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchCarsTest extends TestBase {
HomePage homePage;
NewAndUsedCarSearchPage newAndUsedCarSearchPage;
BMW1SeriesPage bmw1SeriesPage;
@BeforeMethod (groups = {"Smoke","Regression"})
    public void setUp(){
    homePage=new HomePage();
    newAndUsedCarSearchPage = new NewAndUsedCarSearchPage();
    bmw1SeriesPage = new BMW1SeriesPage();
}
@Test(groups = {"Smoke","Regression"})
    public void validateSearchCarsPage(){
    homePage.mouseHoverToBuySellLink();
    homePage.clickOnSearchLink();
    newAndUsedCarSearchPage.verifyUserIsOnNewAndUsedCarSearchPage();
    newAndUsedCarSearchPage.selectAnyMakeDropdown("BMW");
    newAndUsedCarSearchPage.selectAnyModelDropdown("1 Series");
    newAndUsedCarSearchPage.selectAnyLocationFromDropDown("NSW - Sydney");
    newAndUsedCarSearchPage.selectPriceFromDropDown("$30,000");
    newAndUsedCarSearchPage.clickOnFindMyNextCarButton();
    bmw1SeriesPage.verifyUserNavigatesToBMWSeries1Page();
    bmw1SeriesPage.verifyGetTitleMessage();
}



}
