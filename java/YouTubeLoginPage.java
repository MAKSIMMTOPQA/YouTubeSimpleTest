import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static java.lang.Thread.sleep;


public class YouTubeLoginPage extends YouTubeVideoBasePage{


    @FindBy(xpath = "//input[@id='search']")
    private WebElement searchfield;
    @FindBy(xpath = "//button[@id='search-icon-legacy']")
    private WebElement searchButton;

    public YouTubeLoginPage(WebDriver webDriver) {
        super(webDriver);
        PageFactory.initElements(webDriver,this);
    }

    public YouTubeSearchPage searchclick() throws InterruptedException {
        searchfield.click();
        searchfield.sendKeys("Matt Reyes");
        searchButton.click();
        sleep(1000);
        return new YouTubeSearchPage(webDriver);
    }
        public boolean isPageLoaded() {
        return searchButton.isDisplayed();
    }
}


