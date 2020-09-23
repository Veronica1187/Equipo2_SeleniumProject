package youtube.components;

import org.openqa.selenium.WebDriver;
import youtube.pageobjects.leftpageobjects.LeftMenuPageObject;

public class YoutubeLeftComponent {
    private LeftMenuPageObject leftMenuPageObject;

    public YoutubeLeftComponent(WebDriver driver){
        this.leftMenuPageObject = new LeftMenuPageObject(driver, driver.getCurrentUrl());
    }

    public LeftMenuPageObject getLeftMenuPageObject() {
        return leftMenuPageObject;
    }

}
