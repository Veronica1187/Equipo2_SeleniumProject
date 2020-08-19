package youtube.pageobjects.mainpageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import youtube.pageobjects.InterfaceVideo;
import youtube.pageobjects.YoutubeBasePageObject;

import java.util.List;

public class MainTrendingResultsPageObject extends YoutubeBasePageObject implements InterfaceVideo.Video{


    @FindBy()
    private WebElement mainTrendingMusicButton;

    @FindBy()
    private WebElement mainTrendingGamingButton;

    @FindBy()
    private WebElement mainTrendingNewsButton;

    @FindBy()
    private WebElement mainTrendingMoviesButton;

    @FindBy()
    private List<WebElement> listOfVideos;

    @FindBy()
    private WebElement mainTrendingThumbnail;

    @FindBy()
    private WebElement mainTrendingThumbnailDescription;

    @FindBy()
    private WebElement mainTrendingThumbnailChannelName;

    @FindBy()
    private WebElement mainTrendingThumbnailViews;

    @FindBy()
    private WebElement mainTrendingThumbnailReleasedDate;

    public MainTrendingResultsPageObject(WebDriver driver, String baseURL) {
        super(driver, baseURL);
    }

    public void clickOnMainTrendingMusicButton(){

    }

    public void clickOnMainTrendingGamingButton(){

    }

    public void clickOnMainTrendingNewsButton(){

    }

    public void clickOnMainTrendingMoviesButton(){

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
