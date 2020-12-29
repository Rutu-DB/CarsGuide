$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/resources/featurefile/UsedCarSearchSale.feature");
formatter.feature({
  "line": 1,
  "name": "Acceptance testing to validate Search Cars Page is working.",
  "description": "\r\nIn order to validate that\r\n\r\nthe Used Search Cars page is working\r\n\r\nPerforming the Acceptance Testing",
  "id": "acceptance-testing-to-validate-search-cars-page-is-working.",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7294833100,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Validate Used  Search Cars Page",
  "description": "",
  "id": "acceptance-testing-to-validate-search-cars-page-is-working.;validate-used--search-cars-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "I am on the Home Page of CarsGuide Website",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I mouse hover to buy+sell Menu",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "click on submenu Used Search link",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "select carMaker \"Audi\" from AnyMake dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "select carModel \"A4\" from AmyModel dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "select location \"SA - All\"  from SelectLocation dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "select price \"$20,000\" from price dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "click on Find_My_Car button",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I should see list of Used cars \"10 Used Audi A4s for Sale under $20,000 in SA\"",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "the page title should match expected title  \"Used Audi A4 Under 20000 for Sale SA | carsguide\"",
  "keyword": "And "
});
formatter.match({
  "location": "carsSearchStepDefs.iAmOnTheHomePageOfCarsGuideWebsite()"
});
formatter.result({
  "duration": 212046600,
  "status": "passed"
});
formatter.match({
  "location": "carsSearchStepDefs.iMouseHoverToBuySellMenu()"
});
formatter.result({
  "duration": 1361143400,
  "status": "passed"
});
formatter.match({
  "location": "UsedCarSearchSaleStepDef.clickOnSubmenuUsedSearchLink()"
});
formatter.result({
  "duration": 850476500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Audi",
      "offset": 17
    }
  ],
  "location": "UsedCarSearchSaleStepDef.selectCarMakerFromAnyMakeDropdown(String)"
});
formatter.result({
  "duration": 229693000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "A4",
      "offset": 17
    }
  ],
  "location": "UsedCarSearchSaleStepDef.selectCarModelFromAmyModelDropdown(String)"
});
formatter.result({
  "duration": 195089600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SA - All",
      "offset": 17
    }
  ],
  "location": "UsedCarSearchSaleStepDef.selectLocationFromSelectLocationDropdown(String)"
});
formatter.result({
  "duration": 268843200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$20,000",
      "offset": 14
    }
  ],
  "location": "UsedCarSearchSaleStepDef.selectPriceFromPriceDropdown(String)"
});
formatter.result({
  "duration": 327081900,
  "status": "passed"
});
formatter.match({
  "location": "UsedCarSearchSaleStepDef.clickOnFind_My_CarButton()"
});
formatter.result({
  "duration": 546273100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10 Used Audi A4s for Sale under $20,000 in SA",
      "offset": 32
    }
  ],
  "location": "UsedCarSearchSaleStepDef.iShouldSeeListOfUsedCars(String)"
});
formatter.result({
  "duration": 2483044500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Used Audi A4 Under 20000 for Sale SA | carsguide",
      "offset": 45
    }
  ],
  "location": "UsedCarSearchSaleStepDef.thePageTitleShouldMatchExpectedTitle(String)"
});
formatter.result({
  "duration": 39588000,
  "status": "passed"
});
formatter.after({
  "duration": 736926600,
  "status": "passed"
});
formatter.uri("src/test/java/resources/featurefile/carSearch.feature");
formatter.feature({
  "line": 1,
  "name": "Acceptance testing to validate Search Cars Page is working",
  "description": "In order to validate that\r\nthe Search Cars page is working\r\nDoing the Acceptance Testing",
  "id": "acceptance-testing-to-validate-search-cars-page-is-working",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6203319400,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Validate Search Cars Page",
  "description": "",
  "id": "acceptance-testing-to-validate-search-cars-page-is-working;validate-search-cars-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I am on the Home Page of CarsGuide Website",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I mouse hover to buy+sell Menu",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "click on Search Cars link",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "select car brand as \"BMW\" from AnyMake dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "select \"1 Series\" as car model",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "select location as \"NSW - Sydney\" from Select Location dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "select \"$30,000\" as price",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "click on Find_My_Next_Car button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I should see list of searched cars \"21 BMW 1 Series for Sale under $30,000 in Sydney, NSW\"",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "the page title should be \"Bmw 1 Series Under 30000 for Sale Sydney NSW | carsguide\"",
  "keyword": "And "
});
formatter.match({
  "location": "carsSearchStepDefs.iAmOnTheHomePageOfCarsGuideWebsite()"
});
formatter.result({
  "duration": 9163100,
  "status": "passed"
});
formatter.match({
  "location": "carsSearchStepDefs.iMouseHoverToBuySellMenu()"
});
formatter.result({
  "duration": 1275186100,
  "status": "passed"
});
formatter.match({
  "location": "carsSearchStepDefs.clickOnSearchCarsLink()"
});
formatter.result({
  "duration": 943469600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "BMW",
      "offset": 21
    }
  ],
  "location": "carsSearchStepDefs.selectCarBrandAsFromAnyMakeDropdown(String)"
});
formatter.result({
  "duration": 344414600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1 Series",
      "offset": 8
    }
  ],
  "location": "carsSearchStepDefs.selectAsCarModel(String)"
});
formatter.result({
  "duration": 263480200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "NSW - Sydney",
      "offset": 20
    }
  ],
  "location": "carsSearchStepDefs.selectLocationAsFromSelectLocationDropdown(String)"
});
formatter.result({
  "duration": 151747700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "$30,000",
      "offset": 8
    }
  ],
  "location": "carsSearchStepDefs.selectAsPrice(String)"
});
formatter.result({
  "duration": 148465000,
  "status": "passed"
});
formatter.match({
  "location": "carsSearchStepDefs.clickOnFind_My_Next_CarButton()"
});
formatter.result({
  "duration": 549575500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "21 BMW 1 Series for Sale under $30,000 in Sydney, NSW",
      "offset": 36
    }
  ],
  "location": "carsSearchStepDefs.iShouldSeeListOfSearchedCars(String)"
});
formatter.result({
  "duration": 30136958300,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//h1[contains(text(),\u002721 BMW 1 Series for Sale under $30,000 in Sydney, NSW\u0027)]\"}\n  (Session info: chrome\u003d87.0.4280.88)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LAPTOP-39B32HH7\u0027, ip: \u0027192.168.137.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 87.0.4280.88, chrome: {chromedriverVersion: 86.0.4240.22 (398b0743353ff..., userDataDir: C:\\Users\\rutun\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:57535}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: f8f55cce863d54c169e1252f55ff77b3\n*** Element info: {Using\u003dxpath, value\u003d//h1[contains(text(),\u002721 BMW 1 Series for Sale under $30,000 in Sydney, NSW\u0027)]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy20.getText(Unknown Source)\r\n\tat carsGuide.utility.Utility.getTextFromElement(Utility.java:72)\r\n\tat carsGuide.pages.BMW1SeriesPage.verifyUserNavigatesToBMWSeries1Page(BMW1SeriesPage.java:21)\r\n\tat carsGuide.stepDefs.carsSearchStepDefs.iShouldSeeListOfSearchedCars(carsSearchStepDefs.java:66)\r\n\tat ✽.Then I should see list of searched cars \"21 BMW 1 Series for Sale under $30,000 in Sydney, NSW\"(src/test/java/resources/featurefile/carSearch.feature:15)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bmw 1 Series Under 30000 for Sale Sydney NSW | carsguide",
      "offset": 26
    }
  ],
  "location": "carsSearchStepDefs.thePageTitleShouldBe(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 1051022200,
  "status": "passed"
});
});