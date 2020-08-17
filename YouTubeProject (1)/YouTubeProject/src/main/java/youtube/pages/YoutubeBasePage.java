package youtube.pages;

import org.openqa.selenium.WebDriver;
import youtube.components.YoutubeHeaderComponent;
import youtube.components.YoutubeLeftComponent;
import youtube.components.YoutubeMainComponent;

public class YoutubeBasePage {

    private YoutubeHeaderComponent youtubeHeaderComponent;
    private YoutubeLeftComponent youtubeLeftComponent;
    private YoutubeMainComponent youtubeMainComponent;

    public YoutubeBasePage(WebDriver driver){
        this.youtubeHeaderComponent = new YoutubeHeaderComponent(driver);
        this.youtubeLeftComponent = new YoutubeLeftComponent(driver);
        this.youtubeMainComponent = new YoutubeMainComponent(driver);
    }
}
