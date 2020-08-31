package YoutubeTestCases.YoutubeMainAreaTestCases;
import YoutubeTestCases.BaseTestCase;
import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import youtube.pages.YoutubeHomePage;
import youtube.usersteps.YoutubeHomePageUserSteps;
@Epic("Youtube Testing")
@Feature("Main Area")
public class YoutTubeMainAreaTestCases extends BaseTestCase {

    @Test(description = "Validate User can search for a video", groups = {"regression"}, alwaysRun = true)
    @Severity(SeverityLevel.NORMAL)
    @Description("Search for video")
    @Story("Validate the Search Video")
    public void TestsearchForVideo() {
        this.myDriver.get("https://www.youtube.com/");
        YoutubeHomePageUserSteps youtubeUserSteps = new YoutubeHomePageUserSteps(this.myDriver);
        youtubeUserSteps.searchForVideo();
    }

    @Test(description = "Validate User can select video from Results of search", groups = {"regression"}, alwaysRun = true)
    @Severity(SeverityLevel.NORMAL)
    @Description("Select video from results")
    @Story("Select video from results")
    public void TestselectVideoFromResults() {
        this.myDriver.get("https://www.youtube.com/");
        YoutubeHomePageUserSteps youtubeUserSteps = new YoutubeHomePageUserSteps(this.myDriver);
        youtubeUserSteps.selectVideoFromResults();

    }


    @Test(description = "Validate User can select video from Recommended section", groups = {"regression"}, alwaysRun = true)
    @Severity(SeverityLevel.NORMAL)
    @Description("Select video thumbnail")
    @Story("Select video thumbnail")
    public void TestSelectVideoThumbnailFromRecommended() {
        this.myDriver.get("https://www.youtube.com/");
        YoutubeHomePageUserSteps youtubeUserSteps = new YoutubeHomePageUserSteps(this.myDriver);
        youtubeUserSteps.selectVideoThumbnailFromRecommended();

    }

    @Test(description = "Validate User can select video from Trending section", groups = {"regression"}, alwaysRun = true)
    @Severity(SeverityLevel.NORMAL)
    @Description("Select video from Trending")
    @Story("Select video from Trending")
    public void TestSelectVideoThumbnailFromTrending() {
        this.myDriver.get("https://www.youtube.com/");
        YoutubeHomePageUserSteps youtubeUserSteps = new YoutubeHomePageUserSteps(this.myDriver);
        youtubeUserSteps.selectVideoThumbnailFromTrending();

    }

    @Test(description = "Validate User can select video from News section", groups = {"regression"}, alwaysRun = true)
    @Severity(SeverityLevel.NORMAL)
    @Description("Select video from Thumbnail from News")
    @Story("Select video from Thumbnail from News")
    public void TestSelectVideoThumbnailFromNews() {
        this.myDriver.get("https://www.youtube.com/");
        YoutubeHomePageUserSteps youtubeUserSteps = new YoutubeHomePageUserSteps(this.myDriver);
        youtubeUserSteps.selectVideoThumbnailFromNews();

    }
    @Test(description = "Validate the History", groups = {"regression"}, alwaysRun = true)
    @Severity(SeverityLevel.NORMAL)
    @Description("Validate the History")
    @Story("Validate the History")
    public void TestSelectHistoryOption() {
        this.myDriver.get("https://www.youtube.com/feed/history");
        YoutubeHomePageUserSteps youtubeHomePageUserSteps=new YoutubeHomePageUserSteps(this.myDriver);
        WebDriverWait wait = new WebDriverWait(myDriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div//ytd-sub-feed-option-renderer//a[contains(@href,'community')]/paper-radio-button")));
        youtubeHomePageUserSteps.historyMenu("Community");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(myDriver.getCurrentUrl(),"https://www.youtube.com/feed/history/live_chat_history");
        softAssert.assertEquals(myDriver.getCurrentUrl(),"https://www.youtube.com/feed/history/community_history");
        softAssert.assertAll();
    }
}
