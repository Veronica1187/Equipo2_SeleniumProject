package youtube.pageobjects.videodetailspageobjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VideoDetailsPageObjects {

    @FindBy()
    private WebElement videoPlayer;

    @FindBy()
    private WebElement playButton;

    @FindBy()
    private WebElement pauseButton;

    @FindBy()
    private WebElement muteButton;

    @FindBy()
    private WebElement unmuteButton;

    @FindBy()
    private WebElement fullScreenButton;


    @FindBy()
    private WebElement likeVideo;

    //hasta aqui
    @FindBy()
    private WebElement unlikeVideo;

    @FindBy()
    private WebElement shareButton;

    @FindBy()
    private WebElement replayVideoButton;

    @FindBy()
    private WebElement nextVideoButton;

    @FindBy()
    private WebElement videoThumbnailDetailsPage;

    @FindBy()
    private WebElement miniPlayerButton;

    @FindBy()
    private WebElement thearerModeButton;

    @FindBy()
    private WebElement AddPublicComment;
}



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

    //Mary

    public void addPublicComment(){}

    public void changeToTheatherVideo(){}

    public void changeToMiniVideo(){}

    public void clickOnThumbnailsVideos(){}

    public void clickOnThumbnailsDetails(){}

    public void clickOnShareVideo(){}


    public void clickOnNextVideo(){}

    public void clickOnReplayVideo(){}