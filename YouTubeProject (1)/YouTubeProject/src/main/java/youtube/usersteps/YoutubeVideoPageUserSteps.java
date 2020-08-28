package youtube.usersteps;

import org.openqa.selenium.WebDriver;
import youtube.pageobjects.videodetailspageobjects.VideoDetailsPageObjects;
import youtube.pages.YoutubeVideoPage;

public class YoutubeVideoPageUserSteps {

    private VideoDetailsPageObjects videoDetailsPageObjects;

    public YoutubeVideoPageUserSteps(WebDriver driver){
        this.videoDetailsPageObjects = new VideoDetailsPageObjects(driver);
    }


    public void playVideo(){
        this.videoDetailsPageObjects.clickOnPlayButton();
    }

    public void pauseVideo(){
        this.videoDetailsPageObjects.clickOnPauseButton();
    }

    public void muteVideo(){
        this.videoDetailsPageObjects.clickOnMuteButton();
    }

    public void unMuteVideo(){
        this.videoDetailsPageObjects.clickOnUnmuteButton();
    }

    public void selectFullScreenButton(){
        this.videoDetailsPageObjects.clickOnFullscreenButton();
    }

    public void likeVideo(){
        this.videoDetailsPageObjects.clickOnLikeVideo();
    }

    public void unlikeVideo(){
        this.videoDetailsPageObjects.clickOnUnlikeVideo();
    }

    public void shareVideo(){
        this.videoDetailsPageObjects.clickOnShareVideo();
    }

    public void replayVideo(){
        this.videoDetailsPageObjects.clickOnReplayVideo();
    }

    public void selectNextVideo(){
        this.videoDetailsPageObjects.clickOnNextVideo();
    }


    public void videoInformation(){
        this.videoDetailsPageObjects.videoInformation();

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



