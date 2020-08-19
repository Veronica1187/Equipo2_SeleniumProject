package youtube.pageobjects.mainpageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import youtube.pageobjects.YoutubeBasePageObject;

import java.util.List;

public class MainHistoryResultsPageObject extends YoutubeBasePageObject {

    @FindBy()
    private WebElement mainHistoryMessage;

    @FindBy()
    private WebElement mainHistorySignInButton;

    @FindBy
    private List<WebElement> mainHistoryType;

    public MainHistoryResultsPageObject(WebDriver driver, String baseURL) {
        super(driver, baseURL);
    }

    public void clickOnMainSignInButton(){

    }

    public void clickOnMainHistoryType(String option){

    }
}
