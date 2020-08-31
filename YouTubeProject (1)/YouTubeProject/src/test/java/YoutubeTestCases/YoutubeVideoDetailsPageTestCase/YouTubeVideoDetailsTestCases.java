package YoutubeTestCases.YoutubeVideoDetailsPageTestCase;

import YoutubeTestCases.BaseTestCase;
import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
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
        this.myDriver.get("https://www.youtube.com/watch?v=bb3Esxf5I4g");
        YoutubeVideoPageUserSteps youtubeUserSteps = new YoutubeVideoPageUserSteps(this.myDriver);
        youtubeUserSteps.playVideo();
        //WebDriverWait wait = new WebDriverWait(myDriver, 20);

    }




    @Test (description = "Validate unmute button when clicks on it", groups = {"regression"}, alwaysRun = true)
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



    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Validate Share pop-up is displayed")
    public void testShareVideo(){
        WebDriverWait wait = new WebDriverWait(myDriver, 40);
        YoutubeVideoPageUserSteps youtubeUserSteps = new YoutubeVideoPageUserSteps(this.myDriver);
      //  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1/yt-formatted-string")));
        youtubeUserSteps.shareVideo();
        Assert.assertTrue(youtubeUserSteps.shareVideoVisible());


    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Check Video Information displayed")
    public void testVideoInformation(){
        YoutubeVideoPageUserSteps youtubeUserSteps = new YoutubeVideoPageUserSteps(this.myDriver);
        youtubeUserSteps.videoInformation();
        WebDriverWait wait = new WebDriverWait(myDriver, 10);
        Assert.assertTrue(youtubeUserSteps.videoInformationVisible());

    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Check Video changes to the next on when click on Next button")
    public void testSelectNextVideo(){
        YoutubeVideoPageUserSteps youtubeUserSteps = new YoutubeVideoPageUserSteps(this.myDriver);
        youtubeUserSteps.selectNextVideo();
        WebDriverWait wait = new WebDriverWait(myDriver, 10);
        Assert.assertTrue(youtubeUserSteps.nextVideoVisible());

    }

    @Test
    @Severity(SeverityLevel.NORMAL)
    @Description("Check video thumbnail is selected")
    public void testSelectVideoThumbnail(){
        YoutubeVideoPageUserSteps youtubeUserSteps = new YoutubeVideoPageUserSteps(this.myDriver);
        youtubeUserSteps.selectVideoThumbnail();
        WebDriverWait wait = new WebDriverWait(myDriver, 10);
        Assert.assertTrue(youtubeUserSteps.videoThumbnailVisible());

    }


}