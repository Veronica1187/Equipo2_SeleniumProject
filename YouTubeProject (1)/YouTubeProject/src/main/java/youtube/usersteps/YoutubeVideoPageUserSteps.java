package youtube.usersteps;

import org.openqa.selenium.WebDriver;
import youtube.pageobjects.leftpageobjects.LeftMenuPageObject;
import youtube.pageobjects.videodetailspageobjects.VideoDetailsPageObjects;
import youtube.pages.YoutubeHomePage;
import youtube.pages.YoutubeVideoPage;

public class YoutubeVideoPageUserSteps {

    private YoutubeVideoPage youtubeVideoPage;
    public YoutubeVideoPageUserSteps(WebDriver driver){
        this.youtubeVideoPage = new YoutubeVideoPage(driver);
    }

    public void selectVideoThumbnail(){
        VideoDetailsPageObjects videoDetailsPageObjects = this.youtubeVideoPage.getYoutubeVideoDetailsComponent().getVideoDetailsPageObjects();
        videoDetailsPageObjects.clickOnPlayButton();
    }

    public void selectMiniPLayerButton(){

    }

    public void selectTheaterButton(){

    }

    public void addPublicComment(){

    }

}



