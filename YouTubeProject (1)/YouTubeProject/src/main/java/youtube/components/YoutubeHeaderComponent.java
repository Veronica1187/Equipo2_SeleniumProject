package youtube.components;

import org.openqa.selenium.WebDriver;
import youtube.pageobjects.headerpageobjects.*;

public class YoutubeHeaderComponent {
    private HeaderSingleButtonsAndDropdownsMenuPageObject headerSingleButtonsAndDropdownsMenuPageObject;
    private HeaderHamburguerMainMenuPageObject headerHamburguerMainMenuPageObject;
    private HeaderSearchPageObject headerSearchPageObject;
    private HeaderSettingsPageObject headerSettingsPageObject;

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
