package youtube.pageobjects.headerpageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import youtube.pageobjects.YoutubeBasePageObject;

public class HeaderSingleButtonsAndDropdownsMenuPageObject extends YoutubeBasePageObject {

    @FindBy()
    private WebElement YoutubeIconButton;

    @FindBy()
    private WebElement createDropdown;

    @FindBy()
    private WebElement appsDropdown;

    @FindBy()
    private WebElement signInButton;

    public HeaderSingleButtonsAndDropdownsMenuPageObject(WebDriver driver, String baseURL) {
        super(driver, baseURL);
    }

    public void clickOnYoutubeIconButton(){

    }

    public void selectOnCreateDropdown(){

    }

    public void selectOnApssDropdown(){

    }

    public void clickOnSignInButton(){

    }

}
