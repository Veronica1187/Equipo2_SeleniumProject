package youtube.pageobjects.mainpageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import youtube.pageobjects.InterfaceVideo;
import youtube.pageobjects.YoutubeBasePageObject;

import java.util.List;

public class MainHomeResultsPageObject extends YoutubeBasePageObject implements InterfaceVideo.Video {

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
    public void clickOnThumbnail() {

    }

    @Override
    public void clickOnThumbnailDescription() {

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