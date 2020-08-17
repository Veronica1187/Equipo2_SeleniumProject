package youtube.pageobjects.headerpageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import youtube.pageobjects.YoutubeBasePageObject;

public class HeaderSearchPageObject extends YoutubeBasePageObject {

    @FindBy()
    private WebElement searchBox;
    @FindBy()
    private WebElement searchButton;

    public HeaderSearchPageObject(WebDriver driver, String baseURL) {
        super(driver, baseURL);
    }

    public void clickOnSearchButton(){

    }

    public void sendKeysSearchBox(){

    }

}
