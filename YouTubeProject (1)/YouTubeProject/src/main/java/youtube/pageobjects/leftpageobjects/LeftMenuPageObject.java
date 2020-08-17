package youtube.pageobjects.leftpageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import youtube.pageobjects.YoutubeBasePageObject;

public class LeftMenuPageObject extends YoutubeBasePageObject {


    @FindBy()
    private WebElement HomeButton;

    @FindBy()
    private WebElement trendingButton;

    @FindBy()
    private WebElement subscriptionsButton;

    @FindBy()
    private WebElement libraryButton;

    @FindBy()
    private WebElement historyButton;

    public LeftMenuPageObject(WebDriver driver, String baseURL) {
        super(driver, baseURL);
    }

    public void clickOnHamburguerButton(){

    }

    public void clickOnHomeButton(){

    }

    public void clickOnTrendingButton(){

    }

    public void clickOnSubscriptionsButton(){

    }

    public void clickOnLibraryButton(){

    }

    public void clickOnHistoryButton(){

    }
}
