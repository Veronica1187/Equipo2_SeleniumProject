package YoutubeTestCases.YoutubeVideoDetailsPageTestCase;

import YoutubeTestCases.BaseTestCase;
import io.qameta.allure.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import youtube.usersteps.YoutubeVideoPageUserSteps;

import java.util.concurrent.TimeUnit;

@Epic("Youtube Testing")
@Feature("Video Details Page")

public class YouTubeVideoDetailsTestCases extends BaseTestCase {


    @Test (description = "Validate play button when clicks on it", groups = {"regression"}, alwaysRun = true)
    @Severity(SeverityLevel.NORMAL)
    @Description("Check if Video details is displayed correctly")
    @Story("Get to Video Details")
    public void testPlayVideo() {
        this.myDriver.get("https://www.youtube.com/watch?v=KyHQlowJVbc");
        YoutubeVideoPageUserSteps youtubeUserSteps = new YoutubeVideoPageUserSteps(this.myDriver);
        youtubeUserSteps.playVideo();
        WebDriverWait wait = new WebDriverWait(myDriver, 10);

    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Check if Video is correctly paused")
    public void testPauseVideo() {
        YoutubeVideoPageUserSteps youtubeUserSteps = new YoutubeVideoPageUserSteps(this.myDriver);
        youtubeUserSteps.pauseVideo();
        WebDriverWait wait = new WebDriverWait(myDriver, 10);

    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Check if Video is muted when clicks on Mute button")
    public void testMuteVideo() {
        YoutubeVideoPageUserSteps youtubeUserSteps = new YoutubeVideoPageUserSteps(this.myDriver);
        youtubeUserSteps.muteVideo();
        WebDriverWait wait = new WebDriverWait(myDriver, 10);

    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Check if Video is unmuted when click on sound button")
    public void testUnmuteVideo() {
        YoutubeVideoPageUserSteps youtubeUserSteps = new YoutubeVideoPageUserSteps(this.myDriver);
        youtubeUserSteps.unMuteVideo();
        WebDriverWait wait = new WebDriverWait(myDriver, 10);


    }


    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Check Like this video pop-up is displayed")
    public void testLikeVideo(){
        YoutubeVideoPageUserSteps youtubeUserSteps = new YoutubeVideoPageUserSteps(this.myDriver);
        youtubeUserSteps.likeVideo();
        WebDriverWait wait = new WebDriverWait(myDriver, 10);

    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Check UnLike this video pop-up is displayed")
    public void testUnlikeVideo(){
        YoutubeVideoPageUserSteps youtubeUserSteps = new YoutubeVideoPageUserSteps(this.myDriver);
        youtubeUserSteps.unlikeVideo();
        WebDriverWait wait = new WebDriverWait(myDriver, 10);

    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Validate Share pop-up is displayed")
    public void testShareVideo(){
        YoutubeVideoPageUserSteps youtubeUserSteps = new YoutubeVideoPageUserSteps(this.myDriver);
        youtubeUserSteps.shareVideo();
        WebDriverWait wait = new WebDriverWait(myDriver, 10);

    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Check Video Information displayed")
    public void testVideoInformation(){
        YoutubeVideoPageUserSteps youtubeUserSteps = new YoutubeVideoPageUserSteps(this.myDriver);
        youtubeUserSteps.videoInformation();
        WebDriverWait wait = new WebDriverWait(myDriver, 10);

    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Check Video changes to the next on when click on Next button")
    public void testSelectNextVideo(){
        YoutubeVideoPageUserSteps youtubeUserSteps = new YoutubeVideoPageUserSteps(this.myDriver);
        youtubeUserSteps.selectNextVideo();
        WebDriverWait wait = new WebDriverWait(myDriver, 10);

    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Check video thumbnail is selected")
    public void testSelectVideoThumbnail(){
        YoutubeVideoPageUserSteps youtubeUserSteps = new YoutubeVideoPageUserSteps(this.myDriver);
        youtubeUserSteps.selectVideoThumbnail();
        WebDriverWait wait = new WebDriverWait(myDriver, 10);

    }


}