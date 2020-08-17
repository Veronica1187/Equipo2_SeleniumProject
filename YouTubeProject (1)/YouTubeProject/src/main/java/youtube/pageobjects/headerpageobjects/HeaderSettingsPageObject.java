package youtube.pageobjects.headerpageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import youtube.pageobjects.YoutubeBasePageObject;

import java.util.List;

public class HeaderSettingsPageObject extends YoutubeBasePageObject {

    @FindBy()
    private WebElement settingsDropdown;

    @FindBy()
    private WebElement theme;

    @FindBy()
    private WebElement language;

    @FindBy()
    private WebElement location;

    @FindBy()
    private WebElement settings;

    @FindBy()
    private WebElement yourData;

    @FindBy()
    private WebElement help;

    @FindBy()
    private WebElement sendFeedBack;

    @FindBy()
    private WebElement keyboardShortcuts;

    @FindBy()
    private WebElement restrictedMode;

    public HeaderSettingsPageObject(WebDriver driver, String baseURL) {
        super(driver, baseURL);
    }


    public void clickOnSettingsDropdown(){

    }

    public void clickOnTheme(){

    }

    public void clickOnLanguage(){

    }

    public void clickOnLocation(){

    }

    public void clickOnSettings(){

    }

    public void clickOnYourData(){

    }

    public void clickOnHelp(){

    }

    public void clickOnSendFeedBack(){

    }

    public void clickOnKeyboardShortcuts(){

    }

    public void clickOnRestrictedMode(){

    }
}
