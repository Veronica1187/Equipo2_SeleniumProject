package youtube.pageobjects.mainpageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import youtube.pageobjects.InterfaceVideo;
import youtube.pageobjects.YoutubeBasePageObject;

import java.util.List;

public class MainSearchResultsPageObject extends YoutubeBasePageObject implements InterfaceVideo.Video {

    @FindBy(how = How.XPATH, using = "//div[@id='contents']//ytd-video-renderer")
    private List<WebElement> mainSearchListOfVideos;

    @FindBy(how= How.XPATH, using = "//div[@id='contents']//ytd-video-renderer//a[@id='thumbnail']")
    private List<WebElement> mainSearchthumbnail;

    @FindBy(how= How.XPATH, using = "//div[@id='contents']//ytd-video-renderer//a[@id='video-title']")
    private List<WebElement> mainSearchthumbnailDescription;

    @FindBy(how= How.XPATH, using = "//div[@id='contents']//ytd-video-renderer//ytd-channel-name[@class='long-byline style-scope ytd-video-renderer']//a")
    private List<WebElement> mainSearchthumbnailChannelName;

    @FindBy(how= How.XPATH, using = "//div[@id='contents']//ytd-video-renderer//div[@id='metadata-line']")
    private List<WebElement> mainSearchthumbnailViewsReleasedDate;

    public MainSearchResultsPageObject(WebDriver driver, String baseURL) {
        super(driver, baseURL);
    }

    public String[] getNumberOfViewsAndReleaseDate(int videoNumber){
        String viewsRelease = this.mainSearchthumbnailViewsReleasedDate.get(videoNumber).getAttribute("innerText");
        String[] arrayViewsrelease = viewsRelease.split("\\n");
        return arrayViewsrelease;

    }

    public String getVideoTitle(int videoNumber){
        String videoTitle = this.mainSearchthumbnailDescription.get(videoNumber).getAttribute("innerText");
        return videoTitle;
    }

    public String getChannelName(int videoNumber){
        String channelName = this.mainSearchthumbnailChannelName.get(videoNumber).getAttribute("innerText");
        return channelName;
    }

    @Override
    public void clickOnThumbnail(int videoNumber) {
        this.mainSearchthumbnail.get(videoNumber).click();
    }


    @Override
    public void clickOnThumbnailDescription(int videoNumber) {
        this.mainSearchthumbnailDescription.get(videoNumber).click();
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

