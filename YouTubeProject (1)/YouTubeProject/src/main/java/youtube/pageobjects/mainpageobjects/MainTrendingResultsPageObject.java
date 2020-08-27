package youtube.pageobjects.mainpageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import youtube.pageobjects.InterfaceVideo;
import youtube.pageobjects.YoutubeBasePageObject;

import java.util.List;

public class MainTrendingResultsPageObject extends YoutubeBasePageObject implements InterfaceVideo.Video{

    @FindBy(how = How.XPATH, using = "//*[contains(local-name(),'sub-menu-avatar-renderer')]//div")
    private List<WebElement> mainTrendingMenu;

    @FindBy()
    private List<WebElement> listOfVideos;

    @FindBy(how= How.XPATH, using = "//div[@id='contents']//ytd-video-renderer//a[@id='thumbnail']")
    private List<WebElement> mainTrendingThumbnail;

    @FindBy(how= How.XPATH, using = "//div[@id='contents']//ytd-video-renderer//a[@id='video-title']")
    private List<WebElement> mainTrendingThumbnailDescription;

    @FindBy(how= How.XPATH, using = "//div[@id='contents']//ytd-video-renderer//ytd-channel-name[@class='long-byline style-scope ytd-video-renderer']//a")
    private List<WebElement> mainTrendingThumbnailChannelName;

    @FindBy(how= How.XPATH, using = "//div[@id='contents']//ytd-video-renderer//div[@id='metadata-line']")
    private List<WebElement> mainTrendingThumbnailViewsReleasedDate;


    public MainTrendingResultsPageObject(WebDriver driver, String baseURL) {
        super(driver, baseURL);
    }

    public void clickOnMainTrendingMusicButton(){
        this.mainTrendingMenu.get(0).click();
    }

    public void clickOnMainTrendingGamingButton(){
        this.mainTrendingMenu.get(1).click();
    }

    public void clickOnMainTrendingNewsButton(){
        this.mainTrendingMenu.get(2).click();
    }

    public void clickOnMainTrendingMoviesButton(){
        this.mainTrendingMenu.get(3).click();
    }

    public String[] getNumberOfViewsAndReleaseDate(int videoNumber){
        String viewsRelease = this.mainTrendingThumbnailViewsReleasedDate.get(videoNumber).getAttribute("innerText");
        String[] arrayViewsrelease = viewsRelease.split("\\n");
        return arrayViewsrelease;

    }

    public String getVideoTitle(int videoNumber){
        String videoTitle = this.mainTrendingThumbnailDescription.get(videoNumber).getAttribute("innerText");
        return videoTitle;
    }

    public String getChannelName(int videoNumber){
        String channelName = this.mainTrendingThumbnailChannelName.get(videoNumber).getAttribute("innerText");
        return channelName;
    }

    @Override
    public void clickOnThumbnail(int videoNumber) {
        this.mainTrendingThumbnail.get(videoNumber).click();
    }


    @Override
    public void clickOnThumbnailDescription(int videoNumber) {
        this.mainTrendingThumbnailDescription.get(videoNumber).click();
    }

    @Override
    public void clickOnThumbnailChannelName() {

    }

    @Override
    public void clickOnThumbnailViews() {

    }

    @Override
    public void clickOnThumbnailReleaseDate() {

    }
}
