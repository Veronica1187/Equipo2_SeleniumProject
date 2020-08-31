package YoutubeTestCases.YoutubeVideoDetailsPageTestCase;

import YoutubeTestCases.BaseTestCase;
import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import youtube.usersteps.YoutubeVideoPageUserSteps;

import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;

@Epic("Youtube Testing")
@Feature("Video Details Page")

public class YouTubeVideoDetailsTestCases extends BaseTestCase {



   @Test (description = "Validate play button when clicks on it", groups = {"regression"}, alwaysRun = true, priority = 1)
    @Severity(SeverityLevel.NORMAL)
    @Description("Check if Video details is displayed correctly")
    @Story("Get to Video Details")
    public void testPlayVideo() {

        this.myDriver.get("https://www.youtube.com/watch?v=4H5vrauw8l4");

        YoutubeVideoPageUserSteps youtubeUserSteps = new YoutubeVideoPageUserSteps(this.myDriver);

        youtubeUserSteps.playVideo();
        //WebDriverWait wait = new WebDriverWait(myDriver, 20);


        youtubeUserSteps.playVideo();
    }




    @Test (description = "Validate unmute button when clicks on it", groups = {"regression"}, alwaysRun = true, priority = 7)
    @Severity(SeverityLevel.NORMAL)
    @Description("Check if Video is unmuted when click on sound button")
    @Story("Get to Video Details")
    public void testUnmuteVideo() {
        this.myDriver.get("https://www.youtube.com/watch?v=bb3Esxf5I4g");

        YoutubeVideoPageUserSteps youtubeUserSteps = new YoutubeVideoPageUserSteps(this.myDriver);
        youtubeUserSteps.unMuteVideo();
        WebDriverWait wait = new WebDriverWait(myDriver, 30);
        Assert.assertTrue(youtubeUserSteps.unmuteVideoVisible());

    }
    @Test(priority = 4)
    @Severity(SeverityLevel.NORMAL)
    @Description("Check Like this video pop-up is displayed")
    public void testLikeVideo(){
        WebDriverWait wait = new WebDriverWait(myDriver, 25);
        YoutubeVideoPageUserSteps youtubeUserSteps = new YoutubeVideoPageUserSteps(this.myDriver);
        youtubeUserSteps.likeVideo();

    }

    @Test(priority = 3)
    @Severity(SeverityLevel.NORMAL)
    @Description("Check Like this video pop-up is displayed")
    public void testUnlike(){
        WebDriverWait wait = new WebDriverWait(myDriver, 25);
        YoutubeVideoPageUserSteps youtubeUserSteps = new YoutubeVideoPageUserSteps(this.myDriver);
        youtubeUserSteps.unlikeVideo();

    }

    @Test(priority = 2)
    @Severity(SeverityLevel.NORMAL)
    @Description("Check if Video is muted when clicks on Mute button")
    public void testMuteVideo() {
        WebDriverWait wait = new WebDriverWait(myDriver, 25);
        YoutubeVideoPageUserSteps youtubeUserSteps = new YoutubeVideoPageUserSteps(this.myDriver);
        youtubeUserSteps.muteVideo();

    }


    @Test(priority = 9)
    @Severity(SeverityLevel.NORMAL)
    @Description("Validate Share pop-up is displayed")
    public void testShareVideo(){
        WebDriverWait wait = new WebDriverWait(myDriver, 40);
        YoutubeVideoPageUserSteps youtubeUserSteps = new YoutubeVideoPageUserSteps(this.myDriver);
      //  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1/yt-formatted-string")));
        youtubeUserSteps.shareVideo();
        Assert.assertTrue(youtubeUserSteps.shareVideoVisible());


    }

    @Test(priority = 5)
    @Severity(SeverityLevel.NORMAL)
    @Description("Check Video Information displayed")
    public void testVideoInformation(){
        YoutubeVideoPageUserSteps youtubeUserSteps = new YoutubeVideoPageUserSteps(this.myDriver);
        youtubeUserSteps.videoInformation();
        WebDriverWait wait = new WebDriverWait(myDriver, 10);
        Assert.assertTrue(youtubeUserSteps.videoInformationVisible());

    }

    @Test(priority = 6)
    @Severity(SeverityLevel.NORMAL)
    @Description("Check Video changes to the next on when click on Next button")
    public void testSelectNextVideo(){
        YoutubeVideoPageUserSteps youtubeUserSteps = new YoutubeVideoPageUserSteps(this.myDriver);
        youtubeUserSteps.selectNextVideo();
        WebDriverWait wait = new WebDriverWait(myDriver, 10);
        Assert.assertTrue(youtubeUserSteps.nextVideoVisible());

    }

    @Test(priority = 8)
    @Severity(SeverityLevel.NORMAL)
    @Description("Check video thumbnail is selected")
    public void testSelectVideoThumbnail(){
        YoutubeVideoPageUserSteps youtubeUserSteps = new YoutubeVideoPageUserSteps(this.myDriver);
        youtubeUserSteps.selectVideoThumbnail();
        WebDriverWait wait = new WebDriverWait(myDriver, 10);
        Assert.assertTrue(youtubeUserSteps.videoThumbnailVisible());

    }


}