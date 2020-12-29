package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy(xpath = "//a[contains(text(),'buy + sell')]")
    WebElement _buySellLink;

    @FindBy(xpath = "//a[contains(text(),'Search Cars')]")
    WebElement _searchCarsLink;


    @FindBy(xpath = "//header/div[@id='u_H']/div[1]/div[1]/ul[1]/li[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")
    WebElement _usedCarSearchLink;

    // This method will mouseHover to the Buy + Sell Link
    public void mouseHoverToBuySellLink() {
        Reporter.log("This will mouse hover on Buy + Sell Link " + _buySellLink.toString() + "<br>");
        log.info("This will mouse hover on Buy + Sell Link " + _buySellLink.toString());
        mouseHoverToElement(_buySellLink);
    }

    //This method will click on Search Cars Link
    public void clickOnSearchLink() {

        Reporter.log("This will click on Search Cars Link" + _searchCarsLink.toString() + "<br>");
        log.info("This will click on Search Cars Link " + _searchCarsLink.toString());
        clickOnElement(_searchCarsLink);
    }

    //This method will click on Used Cars Link
    public void clickOnUsedCarSearchLink(){
        Reporter.log("This will click on Used Cars Link" + _usedCarSearchLink.toString() + "<br>");
        log.info("This will click on Search Cars Link " + _usedCarSearchLink.toString());
        clickOnElement(_usedCarSearchLink);
            }


}
