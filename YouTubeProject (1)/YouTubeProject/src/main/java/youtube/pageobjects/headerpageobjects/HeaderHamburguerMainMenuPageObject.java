package youtube.pageobjects.headerpageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import youtube.pageobjects.YoutubeBasePageObject;

public class HeaderHamburguerMainMenuPageObject extends YoutubeBasePageObject {

    @FindBy()
    private WebElement hamburguerButton;

    @FindBy()
    private WebElement hamburguerHomeButton;

    @FindBy()
    private WebElement hamburguertrendingButton;

    @FindBy()
    private WebElement hamburguersubscriptionsButton;

    @FindBy()
    private WebElement hamburguerlibraryButton;

    @FindBy()
    private WebElement hamburguerhistoryButton;

    public HeaderHamburguerMainMenuPageObject(WebDriver driver, String baseURL) {
        super(driver, baseURL);
    }

    public void clickOnHamburguerButton(){

    }

    public void clickOnHamburguerHomeButton(){

    }

    public void clickOnHamburguerTrendingButton(){

    }

    public void clickOnHamburguerSubscriptionsButton(){

    }

    public void clickOnHamburguerLibraryButton(){

    }

    public void clickOnHistoryButton(){

    }
}
