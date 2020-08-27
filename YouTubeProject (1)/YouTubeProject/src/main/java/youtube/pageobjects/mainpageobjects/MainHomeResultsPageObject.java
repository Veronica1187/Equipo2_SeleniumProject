package youtube.pageobjects.mainpageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import youtube.pageobjects.InterfaceVideo;
import youtube.pageobjects.YoutubeBasePageObject;

import java.util.List;

public class MainHomeResultsPageObject extends YoutubeBasePageObject implements InterfaceVideo.Video {

    @FindBy(how = How.XPATH, using = "//ytd-rich-item-renderer//a[@id='thumbnail']")
    private List<WebElement> allVideosList;

    @FindBy()
    private List<WebElement> recomendedVideos;

    @FindBy()
    private List<WebElement> trendingVideos;

    @FindBy()
    private List<WebElement> otherVideos;

    @FindBy()
    private WebElement thumbnail;

    @FindBy()
    private WebElement thumbnailDescription;

    @FindBy()
    private WebElement thumbnailChannelName;

    @FindBy()
    private WebElement thumbnailViews;

    @FindBy()
    private WebElement thumbnailReleasedDate;

    public MainHomeResultsPageObject(WebDriver driver, String baseURL) {
        super(driver, baseURL);
    }


    @Override
    public void clickOnThumbnail(int videoNumber) {
        this.allVideosList.get(videoNumber).click();
    }

    @Override
    public void clickOnThumbnailDescription(int x) {

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