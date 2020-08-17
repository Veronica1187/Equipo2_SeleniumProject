package youtube.pageobjects.mainpageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import youtube.pageobjects.YoutubeBasePageObject;

import java.util.List;

public class MainHomeResultsPageObject extends YoutubeBasePageObject {

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

    public void clickOnThumbnail(){

    }

    public void clickOnThumbnailDescription(){

    }

    public void clickOnThumbnailChannelName(){

    }

    public void clickOnThumbnailViews(){

    }

    public void clickOnThumbnailReleaseDate(){

    }
}
