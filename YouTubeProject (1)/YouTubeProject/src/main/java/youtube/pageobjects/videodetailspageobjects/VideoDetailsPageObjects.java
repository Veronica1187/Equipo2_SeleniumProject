package youtube.pageobjects.videodetailspageobjects;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import youtube.pageobjects.YoutubeBasePageObject;

public class VideoDetailsPageObjects extends YoutubeBasePageObject{

    JavascriptExecutor js = (JavascriptExecutor) driver;

    @FindBy(how=How.XPATH, using="//button[@class='ytp-play-button ytp-button’]")
    private WebElement videoPlayer;

    @FindBy(how=How.XPATH, using="//a[@class='ytp-next-button ytp-button']")
    private WebElement playButton;

    @FindBy(how=How.XPATH, using ="//a[@class='ytp-next-button ytp-button']")
    private WebElement pauseButton;

    @FindBy(how=How.XPATH, using ="//button[@class='ytp-mute-button ytp-button']" )
    private WebElement muteButton;

    @FindBy(how=How.XPATH, using="//button[@class='ytp-mute-button ytp-button']")
    private WebElement unmuteButton;

    @FindBy(how=How.XPATH, using="//button[@class='ytp-fullscreen-button ytp-button']")
    private WebElement fullScreenButton;

    @FindBy(how=How.XPATH, using="//h1/yt-formatted-string")
    private WebElement titlevideo;

    @FindBy(how=How.XPATH, using="//div//span[@class='view-count style-scope it-view-count-renderer']")
    private WebElement videoviews;

    @FindBy(how=How.XPATH, using="//div/yt-formatted-string[@class='style-scope ytd-video-primary-info-renderer']")
    private WebElement publisheddate;

    @FindBy(how=How.XPATH, using="//div//a[@class='yt-simple-endpoint style-scope ytd-toggle-button-renderer']")
    private WebElement likeVideo;

    @FindBy(how=How.XPATH, using="//div//a[@class='yt-simple-endpoint style-scope ytd-toggle-button-renderer']//yt-icon-button//button[contains(@aria-label,'dislike')]")
    private WebElement unlikeVideo;

    @FindBy(how=How.XPATH, using="//a//yt-icon-button[@class='style-scope ytd-button-renderer style-default size-default']")
    private WebElement shareButton;

    @FindBy(how=How.XPATH, using="//paper-dialog[@class='style-scope ytd-popup-container']/ytd-unified-share-panel-renderer/yt-icon-button[@id='close-button']/button[contains(@aria-label,'Cancel')]")
    private WebElement shareclose;


    @FindBy(how=How.XPATH, using)
    private WebElement replayVideoButton;

    @FindBy(how=How.XPATH, using="//a[@class='ytp-next-button ytp-button']")
    private WebElement nextVideoButton;

    @FindBy(how=How.XPATH, using="//div[@class='details style-scope ytd-compact-video-renderer']")
    private WebElement videoThumbnailDetailsPage;

    @FindBy(how=How.XPATH, using="//button[@class='ytp-miniplayer-button ytp-button']")
    private WebElement miniPlayerButton;

    @FindBy(how=How.XPATH, using="//button[@class='ytp-size-button ytp-button']")
    private WebElement thearerModeButton;

    @FindBy(how=How.ID, using="placeholder-area")
    private WebElement AddPublicComment;






public  VideoDetailsPageObjects(WebDriver driver, String baseURL){
    super(driver, baseURL);
}

    public void clickOnPlayButton(){
    this.playButton.click();
    }

    public void clickOnPauseButton(){
        this.pauseButton.click();
    }
    public void clickOnMuteButton(){
        this.muteButton.click();
    }

    public void clickOnUnmuteButton(){
        this.unmuteButton.click();
    }

    public void clickOnFullscreenButton(){
        this.fullScreenButton.click();
    }

    public void clickOnLikeVideo(){
        this.likeVideo.click();
    }

    public void clickOnUnlikeVideo(){
        this.unlikeVideo.click();
    }

    public void addPublicComment(){this.AddPublicComment.click();}

    public void changeToTheatherVideo(){this.thearerModeButton.click();}

    public void changeToMiniVideo(){this.miniPlayerButton.click();}

    public void clickOnThumbnailsVideos(){this.videoThumbnailDetailsPage.click();}

    public void clickOnThumbnailsDetails(){}

    public void clickOnShareVideo(){this.shareButton.click();

        js.executeScript("arguments[0].click();",this.shareclose);}


    public void clickOnNextVideo(){this.nextVideoButton.click();}

    public void clickOnReplayVideo(){this.replayVideoButton.click();}

    public void videoInformation(){
    this.titlevideo.getText();
    this.videoviews.getText();
    this.publisheddate.getText();
    }

}