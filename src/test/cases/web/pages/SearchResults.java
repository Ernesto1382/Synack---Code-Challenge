package web.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;

public class SearchResults extends BasePage{

    @FindBy(xpath="//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div")
    WebElement searchHead;

    @FindBy(xpath="//*[@id=\"search\"]/div[1]/div[2]/div")
    WebElement listOfResults;

    public SearchResults(WebDriver driver) {
        super(driver);
    }

    public boolean contentText(){
        return searchHead.isDisplayed();
    }

    public boolean listHaveElements() throws ParseException {
        String max;
        double m=0, r=0;

        //No.of rows
        List  rows = driver.findElements(By.xpath ("//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[2]/div"));
        System.out.println("Total No of rows are : " + rows.size());
        for (int i =1;i<rows.size();i++)
        {
            max= driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[2]/div[" + (i+1)+ "]")).getText();
            System.out.println(max);
        }

        return true;
    }

}
