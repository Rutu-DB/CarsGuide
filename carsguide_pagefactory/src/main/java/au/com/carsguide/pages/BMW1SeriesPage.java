package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

public class BMW1SeriesPage extends Utility {

    private static final Logger log = LogManager.getLogger(NewAndUsedCarSearchPage.class.getName());
    @FindBy(xpath = "//h1[contains(text(),'21 BMW 1 Series for Sale under $30,000 in Sydney, NSW')]")
    WebElement _verifyBMWText;

public void verifyUserNavigatesToBMWSeries1Page(){
    Reporter.log("Verify user can navigate to BMW Series 1 page " + _verifyBMWText.toString() + "<br>");
    log.info("Verify user can navigate to BMW Series 1 page " + _verifyBMWText.toString());
    String actualMesage = "21 BMW 1 Series for Sale under $30,000 in Sydney, NSW";
    Assert.assertEquals(actualMesage,getTextFromElement(_verifyBMWText));

}

public void verifyGetTitleMessage(){
    Reporter.log("Verify String - Bmw 1 Series Under 30000 for Sale Sydney NSW | carsguide");
    log.info("Bmw 1 Series Under 30000 for Sale Sydney NSW | carsguide");
    String  actual = driver.getTitle();
    Assert.assertEquals(actual,"Bmw 1 Series Under 30000 for Sale Sydney NSW | carsguide");
}



}
