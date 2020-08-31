package youtube.usersteps;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import youtube.pageobjects.leftpageobjects.LeftMenuPageObject;
import youtube.pageobjects.videodetailspageobjects.VideoDetailsPageObjects;
import youtube.pages.YoutubeHomePage;
import youtube.pages.YoutubeVideoPage;

public class YoutubeVideoPageUserSteps {

    private YoutubeVideoPage youtubeVideoPage;

        VideoDetailsPageObjects videoDetailsPageObjects;

    public YoutubeVideoPageUserSteps(WebDriver driver){

        this.youtubeVideoPage = new YoutubeVideoPage(driver);
    }

    public boolean nextVideoVisible(){

        videoDetailsPageObjects= this.youtubeVideoPage.getYoutubeVideoDetailsComponent().getVideoDetailsPageObjects();
        return  videoDetailsPageObjects.isVisibleSelectNext();

    }

    public boolean videoThumbnailVisible(){

        videoDetailsPageObjects= this.youtubeVideoPage.getYoutubeVideoDetailsComponent().getVideoDetailsPageObjects();
        return  videoDetailsPageObjects.isVisibleThumbnail();

    }

    public boolean shareVideoVisible(){

        videoDetailsPageObjects= this.youtubeVideoPage.getYoutubeVideoDetailsComponent().getVideoDetailsPageObjects();
        return  videoDetailsPageObjects.isVisibleShare();

    }

    public boolean videoInformationVisible(){

        videoDetailsPageObjects= this.youtubeVideoPage.getYoutubeVideoDetailsComponent().getVideoDetailsPageObjects();
        return  videoDetailsPageObjects.informationVisible();

    }

    public boolean unmuteVideoVisible(){

        videoDetailsPageObjects= this.youtubeVideoPage.getYoutubeVideoDetailsComponent().getVideoDetailsPageObjects();
        return  videoDetailsPageObjects.isVisibleUnmute();

    }

    public void playVideo() {
        VideoDetailsPageObjects videoDetailsPageObjects = this.youtubeVideoPage.getYoutubeVideoDetailsComponent().getVideoDetailsPageObjects();
        videoDetailsPageObjects.clickOnPlayButton();
    }


    public void pauseVideo() {
        VideoDetailsPageObjects videoDetailsPageObjects = this.youtubeVideoPage.getYoutubeVideoDetailsComponent().getVideoDetailsPageObjects();
        videoDetailsPageObjects.clickOnPauseButton();
    }

    public void muteVideo() {
        VideoDetailsPageObjects videoDetailsPageObjects = this.youtubeVideoPage.getYoutubeVideoDetailsComponent().getVideoDetailsPageObjects();
        videoDetailsPageObjects.clickOnMuteButton();
    }

    public void unMuteVideo() {
        VideoDetailsPageObjects videoDetailsPageObjects = this.youtubeVideoPage.getYoutubeVideoDetailsComponent().getVideoDetailsPageObjects();
        videoDetailsPageObjects.clickOnUnmuteButton();
    }


    public void likeVideo() {
        VideoDetailsPageObjects videoDetailsPageObjects = this.youtubeVideoPage.getYoutubeVideoDetailsComponent().getVideoDetailsPageObjects();
        videoDetailsPageObjects.clickOnLikeVideo();
    }

    public void unlikeVideo() {
        VideoDetailsPageObjects videoDetailsPageObjects = this.youtubeVideoPage.getYoutubeVideoDetailsComponent().getVideoDetailsPageObjects();
        videoDetailsPageObjects.clickOnUnlikeVideo();
    }

    public void shareVideo() {
        VideoDetailsPageObjects videoDetailsPageObjects = this.youtubeVideoPage.getYoutubeVideoDetailsComponent().getVideoDetailsPageObjects();
        videoDetailsPageObjects.clickOnShareVideo();
        videoDetailsPageObjects.clickCloseShare();
    }

    public void videoInformation() {
        VideoDetailsPageObjects videoDetailsPageObjects = this.youtubeVideoPage.getYoutubeVideoDetailsComponent().getVideoDetailsPageObjects();
        videoDetailsPageObjects.videoInformation();
    }

    public void selectNextVideo() {
        VideoDetailsPageObjects videoDetailsPageObjects = this.youtubeVideoPage.getYoutubeVideoDetailsComponent().getVideoDetailsPageObjects();
        videoDetailsPageObjects.clickOnNextVideo();
    }

    public void selectVideoThumbnail() {
        VideoDetailsPageObjects videoDetailsPageObjects = this.youtubeVideoPage.getYoutubeVideoDetailsComponent().getVideoDetailsPageObjects();
        videoDetailsPageObjects.clickOnThumbnailsVideos();
    }




}