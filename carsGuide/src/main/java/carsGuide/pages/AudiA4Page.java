package carsGuide.pages;

import carsGuide.utility.Utility;
import com.cucumber.listener.Reporter;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class AudiA4Page extends Utility {

    private static final Logger log = LogManager.getLogger(AudiA4Page.class.getName());
    @FindBy(xpath = "//h1[contains(text(),'10 Used Audi A4s for Sale under $20,000 in SA')]")
    WebElement _verifyMessage;

    public void verifyUserShouldNavigateSuccessfully() {
        Reporter.addStepLog("Verify user navigte to Audi A4 Page " + _verifyMessage.toString() + "<br>");
        log.info("Verify user navigate to Audi A4 Page " + _verifyMessage.toString());
        String actualMessage = "10 Used Audi A4s for Sale under $20,000 in SA";
        Assert.assertEquals(actualMessage, "10 Used Audi A4s for Sale under $20,000 in SA");

    }

    public String getAudiPageTitle() {
        return driver.getTitle();
    }


}
