package youtube.components;

import org.openqa.selenium.WebDriver;
import youtube.pageobjects.leftpageobjects.LeftMenuPageObject;
import youtube.pageobjects.videodetailspageobjects.VideoDetailsPageObjects;

public class YoutubeVideoDetailsComponent {
    private VideoDetailsPageObjects videoDetailsPageObjects;

    public VideoDetailsPageObjects (WebDriver driver) {
        this.videoDetailsPageObjects = new VideoDetailsPageObjects(driver, driver.getCurrentUrl());
    }

    public VideoDetailsPageObjects getVideoDetailsPageObjects() {
        return videoDetailsPageObjects;
    }
}
