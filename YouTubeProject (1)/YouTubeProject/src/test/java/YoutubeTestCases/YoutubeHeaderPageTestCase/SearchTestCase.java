package YoutubeTestCases.YoutubeHeaderPageTestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import youtube.pageobjects.headerpageobjects.HeaderSearchPageObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import YoutubeTestCases.BaseTestCase;
import youtube.usersteps.YoutubeHomePageUserSteps;


public class SearchTestCase extends BaseTestCase {

    @Test(description = "Introducir una busqueda y dar click", groups = {"regression"}, alwaysRun = true)

    public void validateSearchURL(){
        this.myDriver.get("https://www.youtube.com/");
        YoutubeHomePageUserSteps youtubeHomePageUserSteps;
        youtubeHomePageUserSteps = new YoutubeHomePageUserSteps(this.myDriver);
        String contentOfVideo = "Testing using selenium";
        youtubeHomePageUserSteps.searchVideos(contentOfVideo);
        WebDriverWait wait = new WebDriverWait(myDriver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='contents']//ytd-video-renderer//a[@id='thumbnail']")));
        String newTitle= this.myDriver.getTitle();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(youtubeHomePageUserSteps.valorDeTitle(contentOfVideo, newTitle));
        softAssert.assertAll();

    }
}
