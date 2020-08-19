package youtube.pageobjects.mainpageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import youtube.pageobjects.InterfaceVideo;
import youtube.pageobjects.YoutubeBasePageObject;

import java.util.List;

public class MainSearchResultsPageObject extends YoutubeBasePageObject implements InterfaceVideo.Video {

    @FindBy()
    private List<WebElement> mainSearchListOfVideos;

    @FindBy()
    private WebElement mainSearchthumbnail;

    @FindBy()
    private WebElement mainSearchthumbnailDescription;

    @FindBy()
    private WebElement mainSearchthumbnailChannelName;

    @FindBy()
    private WebElement mainSearchthumbnailViews;

    @FindBy()
    private WebElement mainSearchthumbnailReleasedDate;

    public MainSearchResultsPageObject(WebDriver driver, String baseURL) {
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

