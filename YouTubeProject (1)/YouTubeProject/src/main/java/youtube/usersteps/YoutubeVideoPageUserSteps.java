package youtube.usersteps;

import org.openqa.selenium.WebDriver;
import youtube.pageobjects.videodetailspageobjects.VideoDetailsPageObjects;
import youtube.pages.YoutubeVideoPage;

public class YoutubeVideoPageUserSteps {

    private YoutubeVideoPage youtubeVideoPage;

    private VideoDetailsPageObjects videoDetailsPageObjects;

    public YoutubeVideoPageUserSteps(WebDriver driver){
        this.youtubeVideoPage = new YoutubeVideoPage(driver);
    }

    public void playVideo(){
        this.videoDetailsPageObjects.clickOnPlayButton();
    }

    public void pauseVideo(){

    }

    public void muteVideo(){

    }

    public void unMuteVideo(){

    }

    public void selectFullScreenButton(){

    }

    public void likeVideo(){

    }

    public void unlikeVideo(){

    }

    public void shareVideo(){

    }

    public void replayVideo(){

    }

    public void selectNextVideo(){

    }

    public void selectVideoThumbnail(){

    }

    public void selectMiniPLayerButton(){

    }

    public void selectTheaterButton(){

    }

    public void addPublicComment(){

    }

}



