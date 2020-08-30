package youtube.components;

import org.openqa.selenium.WebDriver;
import youtube.pageobjects.headerpageobjects.*;
import youtube.pageobjects.leftpageobjects.LeftMenuPageObject;

public class YoutubeHeaderComponent {
    private HeaderSingleButtonsAndDropdownsMenuPageObject headerSingleButtonsAndDropdownsMenuPageObject;
    private HeaderHamburguerMainMenuPageObject headerHamburguerMainMenuPageObject;
    private HeaderSearchPageObject headerSearchPageObject;
    private HeaderSettingsPageObject headerSettingsPageObject;

    public YoutubeHeaderComponent(WebDriver driver){
        this.headerSettingsPageObject= new HeaderSettingsPageObject(driver, driver.getCurrentUrl());

    }

    public HeaderSingleButtonsAndDropdownsMenuPageObject getHeaderSingleButtonsAndDropdownsMenuPageObject() {
        return headerSingleButtonsAndDropdownsMenuPageObject;
    }

    public HeaderHamburguerMainMenuPageObject getHeaderHamburguerMainMenuPageObject() {
        return headerHamburguerMainMenuPageObject;
    }

    public HeaderSearchPageObject getHeaderSearchPageObject() {
        return headerSearchPageObject;
    }

    public HeaderSettingsPageObject getHeaderSettingsPageObject() {
        return headerSettingsPageObject;
    }
}
