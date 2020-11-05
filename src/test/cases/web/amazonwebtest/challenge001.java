package web.amazonwebtest;

import com.relevantcodes.extentreports.LogStatus;
import org.testng.annotations.Test;
import org.testng.Assert;
import java.lang.reflect.Method;
import java.text.ParseException;

import web.pages.BaseTest;
import web.pages.Home;
import web.pages.SearchResults;
import web.report.ExtentManager;
import web.report.ExtentTestManager;

public class challenge001 extends BaseTest {

    @Test(priority = 0, description = "Get list of all Best Sellers headphones")
    public void ListOfSearchResults() throws ParseException {

        ExtentTestManager.startTest("Amazon Web Page" , "Get list of all Best Sellers headphones");

        ExtentTestManager.getTest().log(LogStatus.INFO, "Test: Begin on homepage");
        Home amazonHomePage = new Home(getDriver());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Load home page");
        amazonHomePage.searchInBoxSearch("Best Sellers headphones");
        amazonHomePage.searchClickOnButton();

        SearchResults amazonSearchResultPage = new SearchResults(getDriver());
        Assert.assertTrue(amazonSearchResultPage.listHaveElements());
        ExtentTestManager.getTest().log(LogStatus.PASS, "Brings results");
        Assert.assertTrue(amazonSearchResultPage.contentText());

        ExtentTestManager.endTest();
        ExtentManager.getReporter().flush();
    }

}
