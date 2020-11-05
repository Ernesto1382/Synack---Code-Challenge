package web.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home extends BasePage{

    @FindBy(id="twotabsearchtextbox")
    WebElement searchInput;

    @FindBy(id="nav-search-submit-text")
    WebElement searchButton;

    public Home(WebDriver driver){
        super(driver);
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
    }

    public void searchInBoxSearch(String criteriaToSerach){
        searchInput.sendKeys(criteriaToSerach);
    }

    public void searchClickOnButton(){
        searchButton.click();
    }

}
