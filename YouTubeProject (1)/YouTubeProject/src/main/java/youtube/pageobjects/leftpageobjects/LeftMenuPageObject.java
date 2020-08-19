package youtube.pageobjects.leftpageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import youtube.pageobjects.YoutubeBasePageObject;

public class LeftMenuPageObject extends YoutubeBasePageObject {


    @FindBy()
    private WebElement LeftHomeButton;

    @FindBy()
    private WebElement LeftTrendingButton;

    @FindBy()
    private WebElement LeftSubscriptionsButton;

    @FindBy()
    private WebElement LeftLibraryButton;

    @FindBy()
    private WebElement LeftHistoryButton;

    public LeftMenuPageObject(WebDriver driver, String baseURL) {
        super(driver, baseURL);
    }

    public void clickOnLeftHomeButton(){

    }

    public void clickOnLeftTrendingButton(){

    }

    public void clickOnLeftSubscriptionsButton(){

    }

    public void clickOnLeftLibraryButton(){

    }

    public void clickOnLeftHistoryButton(){

    }
}
