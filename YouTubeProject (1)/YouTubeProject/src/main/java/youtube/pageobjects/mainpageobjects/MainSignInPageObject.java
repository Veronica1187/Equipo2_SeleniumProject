package youtube.pageobjects.mainpageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import youtube.pageobjects.YoutubeBasePageObject;

public class MainSignInPageObject extends YoutubeBasePageObject {
    @FindBy()
    private WebElement mainSignInMessage;

    @FindBy()
    private WebElement mainSignInButton;

    public MainSignInPageObject(WebDriver driver, String baseURL) {
        super(driver, baseURL);
    }

    public void clickOnMainSignInButton(){

    }
}
