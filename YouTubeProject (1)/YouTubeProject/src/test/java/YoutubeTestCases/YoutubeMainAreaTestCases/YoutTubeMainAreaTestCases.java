package YoutubeTestCases.YoutubeMainAreaTestCases;
import YoutubeTestCases.BaseTestCase;
import org.testng.annotations.Test;
import youtube.usersteps.YoutubeHomePageUserSteps;

public class YoutTubeMainAreaTestCases extends BaseTestCase {

    @Test(description = "Validate User can search for a video", groups = {"regression"}, alwaysRun = true)
    public void TestsearchForVideo() {
        this.myDriver.get("https://www.youtube.com/");
        YoutubeHomePageUserSteps youtubeUserSteps = new YoutubeHomePageUserSteps(this.myDriver);
        youtubeUserSteps.searchForVideo();
    }

    @Test(description = "Validate User can select video from Results of search", groups = {"regression"}, alwaysRun = true)
    public void TestselectVideoFromResults() {
        this.myDriver.get("https://www.youtube.com/");
        YoutubeHomePageUserSteps youtubeUserSteps = new YoutubeHomePageUserSteps(this.myDriver);
        youtubeUserSteps.selectVideoFromResults();

    }


    @Test(description = "Validate User can select video from Recommended section", groups = {"regression"}, alwaysRun = true)
    public void TestSelectVideoThumbnailFromRecommended() {
        this.myDriver.get("https://www.youtube.com/");
        YoutubeHomePageUserSteps youtubeUserSteps = new YoutubeHomePageUserSteps(this.myDriver);
        youtubeUserSteps.selectVideoThumbnailFromRecommended();

    }

    @Test(description = "Validate User can select video from Trending section", groups = {"regression"}, alwaysRun = true)
    public void TestSelectVideoThumbnailFromTrending() {
        this.myDriver.get("https://www.youtube.com/");
        YoutubeHomePageUserSteps youtubeUserSteps = new YoutubeHomePageUserSteps(this.myDriver);
        youtubeUserSteps.selectVideoThumbnailFromTrending();

    }

    @Test(description = "Validate User can select video from News section", groups = {"regression"}, alwaysRun = true)
    public void TestSelectVideoThumbnailFromNews() {
        this.myDriver.get("https://www.youtube.com/");
        YoutubeHomePageUserSteps youtubeUserSteps = new YoutubeHomePageUserSteps(this.myDriver);
        youtubeUserSteps.selectVideoThumbnailFromNews();

    }
}
