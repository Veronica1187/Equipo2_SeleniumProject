package youtube.usersteps;

import org.openqa.selenium.WebDriver;
import youtube.pages.YoutubeVideoPage;

public class YoutubeVideoPageUserSteps {

    private YoutubeVideoPage youtubeVideoPage;

    public YoutubeVideoPageUserSteps(WebDriver driver){
        this.youtubeVideoPage = new YoutubeVideoPage(driver);
    }
}
