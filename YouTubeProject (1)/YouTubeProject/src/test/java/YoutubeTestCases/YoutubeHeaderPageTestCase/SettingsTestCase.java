package YoutubeTestCases.YoutubeHeaderPageTestCase;

import youtube.pageobjects.headerpageobjects.HeaderSettingsPageObject;
import org.testng.annotations.Test;
import YoutubeTestCases.BaseTestCase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import org.testng.Assert;
import youtube.usersteps.YoutubeHomePageUserSteps;

public class SettingsTestCase extends BaseTestCase {

    @Test(description = "Validar que al dar click se despliegue un menu", groups = {"regression"}, alwaysRun = true)

    public void settingsClickOnMenu(){
        this.myDriver.get("https://www.youtube.com/");
        YoutubeHomePageUserSteps youtubeHomePageUserSteps=new YoutubeHomePageUserSteps(this.myDriver);
        youtubeHomePageUserSteps.selectSettingsDropMenu();
        WebDriverWait wait = new WebDriverWait(myDriver, 10);
    }

    public void settingsValidateTheme() {
        this.myDriver.get("https://www.youtube.com/");
        YoutubeHomePageUserSteps youtubeHomePageUserSteps = new YoutubeHomePageUserSteps(this.myDriver);
        WebDriverWait wait = new WebDriverWait(myDriver, 10);
        Assert.assertTrue(youtubeHomePageUserSteps.selectOptionTheme());
    }

    public void validateOptionLanguage() {
        this.myDriver.get("https://www.youtube.com/");
        YoutubeHomePageUserSteps youtubeHomePageUserSteps = new YoutubeHomePageUserSteps(this.myDriver);
        WebDriverWait wait = new WebDriverWait(myDriver, 10);
        Assert.assertTrue(youtubeHomePageUserSteps.selectOptionLanguage());
    }

    public void validateOptionLocation() {
        this.myDriver.get("https://www.youtube.com/");
        YoutubeHomePageUserSteps youtubeHomePageUserSteps = new YoutubeHomePageUserSteps(this.myDriver);
        WebDriverWait wait = new WebDriverWait(myDriver, 10);
        Assert.assertTrue(youtubeHomePageUserSteps.selectOptionLocation());
    }

    public void validateOptionSettings() {
        this.myDriver.get("https://www.youtube.com/");
        YoutubeHomePageUserSteps youtubeHomePageUserSteps = new YoutubeHomePageUserSteps(this.myDriver);
        WebDriverWait wait = new WebDriverWait(myDriver, 10);
        Assert.assertTrue(youtubeHomePageUserSteps.selectOptionSetings());
    }

    public void validateOptionYourData() {
        this.myDriver.get("https://www.youtube.com/");
        YoutubeHomePageUserSteps youtubeHomePageUserSteps = new YoutubeHomePageUserSteps(this.myDriver);
        WebDriverWait wait = new WebDriverWait(myDriver, 10);
        Assert.assertTrue(youtubeHomePageUserSteps.selectOptionYourData());
    }

    public void validateOptionHelp() {
        this.myDriver.get("https://www.youtube.com/");
        YoutubeHomePageUserSteps youtubeHomePageUserSteps = new YoutubeHomePageUserSteps(this.myDriver);
        WebDriverWait wait = new WebDriverWait(myDriver, 10);
        Assert.assertTrue(youtubeHomePageUserSteps.selectOptionHelp());
    }

    public void validateOptionFeedBack() {
        this.myDriver.get("https://www.youtube.com/");
        YoutubeHomePageUserSteps youtubeHomePageUserSteps = new YoutubeHomePageUserSteps(this.myDriver);
        WebDriverWait wait = new WebDriverWait(myDriver, 10);
        Assert.assertTrue(youtubeHomePageUserSteps.selectOptionSendFeedBack());
    }

    public void validateOptionKeyBoard() {
        this.myDriver.get("https://www.youtube.com/");
        YoutubeHomePageUserSteps youtubeHomePageUserSteps = new YoutubeHomePageUserSteps(this.myDriver);
        WebDriverWait wait = new WebDriverWait(myDriver, 10);
        Assert.assertTrue(youtubeHomePageUserSteps.selectOptionKeyBoard());
    }

    public void validateOptionRestrictedMode() {
        this.myDriver.get("https://www.youtube.com/");
        YoutubeHomePageUserSteps youtubeHomePageUserSteps = new YoutubeHomePageUserSteps(this.myDriver);
        WebDriverWait wait = new WebDriverWait(myDriver, 10);
        Assert.assertTrue(youtubeHomePageUserSteps.selectOptionRestrictedMode());
    }
}
