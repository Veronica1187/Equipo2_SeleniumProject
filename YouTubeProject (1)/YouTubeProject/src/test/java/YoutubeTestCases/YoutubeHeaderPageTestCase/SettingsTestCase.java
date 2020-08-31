package YoutubeTestCases.YoutubeHeaderPageTestCase;

import io.qameta.allure.*;
import org.testng.annotations.Test;
import YoutubeTestCases.BaseTestCase;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import youtube.usersteps.YoutubeHomePageUserSteps;

@Epic("Youtube Testing")
@Feature("Settings Option")

public class SettingsTestCase extends BaseTestCase {

    @Test(description = "Validar que al dar click se despliegue un menu", groups = {"regression"}, alwaysRun = true)
    @Severity(SeverityLevel.NORMAL)
    @Description("Check if settings menu is not empty")
    @Story("Get to Settings Drop down menu")

    public void settingsClickOnMenu(){
        this.myDriver.get("https://www.youtube.com/");
        YoutubeHomePageUserSteps youtubeHomePageUserSteps=new YoutubeHomePageUserSteps(this.myDriver);
        youtubeHomePageUserSteps.selectSettingsDropMenu();
        WebDriverWait wait = new WebDriverWait(myDriver, 10);
    }

    @Test(description = "Validar que la opcion Theme", groups = {"regression"}, alwaysRun = true)
    @Severity(SeverityLevel.NORMAL)
    @Description("Check if theme menu is available")
    @Story("Get to Theme menu")

    public void settingsValidateTheme() {
        this.myDriver.get("https://www.youtube.com/");
        YoutubeHomePageUserSteps youtubeHomePageUserSteps=new YoutubeHomePageUserSteps(this.myDriver);
        youtubeHomePageUserSteps.selectSettingsDropMenu();
        WebDriverWait wait = new WebDriverWait(myDriver, 10);
        YoutubeHomePageUserSteps youtubeHomePageUserSteps1 = new YoutubeHomePageUserSteps(this.myDriver);
        Assert.assertTrue(youtubeHomePageUserSteps1.selectOptionTheme());
    }

    @Test(description = "Validar que la opcion Language", groups = {"regression"}, alwaysRun = true)
    @Severity(SeverityLevel.NORMAL)
    @Description("Check if language menu is available")
    @Story("Get to Language menu")
    public void validateOptionLanguage() {
        this.myDriver.get("https://www.youtube.com/");
        YoutubeHomePageUserSteps youtubeHomePageUserSteps=new YoutubeHomePageUserSteps(this.myDriver);
        youtubeHomePageUserSteps.selectSettingsDropMenu();
        WebDriverWait wait = new WebDriverWait(myDriver, 10);
        YoutubeHomePageUserSteps youtubeHomePageUserSteps2 = new YoutubeHomePageUserSteps(this.myDriver);
        WebDriverWait wait1 = new WebDriverWait(myDriver, 10);
        Assert.assertTrue(youtubeHomePageUserSteps2.selectOptionLanguage());
    }

    @Test(description = "Validar la opcion Location", groups = {"regression"}, alwaysRun = true)
    @Severity(SeverityLevel.NORMAL)
    @Description("Check if location menu is available")
    @Story("Get to Location menu")
    public void validateOptionLocation() {
        this.myDriver.get("https://www.youtube.com/");
        YoutubeHomePageUserSteps youtubeHomePageUserSteps=new YoutubeHomePageUserSteps(this.myDriver);
        youtubeHomePageUserSteps.selectSettingsDropMenu();
        WebDriverWait wait = new WebDriverWait(myDriver, 10);
        YoutubeHomePageUserSteps youtubeHomePageUserSteps3 = new YoutubeHomePageUserSteps(this.myDriver);
        WebDriverWait wait2 = new WebDriverWait(myDriver, 10);
        Assert.assertTrue(youtubeHomePageUserSteps3.selectOptionLocation());
    }

    @Test(description = "Validar la opcion Settings", groups = {"regression"}, alwaysRun = true)
    @Severity(SeverityLevel.NORMAL)
    @Description("Check if Settings menu is available")
    @Story("Get to Settings menu")
    public void validateOptionSettings() {
        this.myDriver.get("https://www.youtube.com/");
        YoutubeHomePageUserSteps youtubeHomePageUserSteps=new YoutubeHomePageUserSteps(this.myDriver);
        youtubeHomePageUserSteps.selectSettingsDropMenu();
        WebDriverWait wait = new WebDriverWait(myDriver, 10);
        YoutubeHomePageUserSteps youtubeHomePageUserSteps4 = new YoutubeHomePageUserSteps(this.myDriver);
        WebDriverWait wait3 = new WebDriverWait(myDriver, 10);
        Assert.assertTrue(youtubeHomePageUserSteps4.selectOptionSetings());
    }

    @Test(description = "Validar la opcion Data", groups = {"regression"}, alwaysRun = true)
    @Severity(SeverityLevel.NORMAL)
    @Description("Check if Validate your Data menu is available")
    @Story("Get to Validate your Data menu")
    public void validateOptionYourData() {
        this.myDriver.get("https://www.youtube.com/");
        YoutubeHomePageUserSteps youtubeHomePageUserSteps=new YoutubeHomePageUserSteps(this.myDriver);
        youtubeHomePageUserSteps.selectSettingsDropMenu();
        WebDriverWait wait = new WebDriverWait(myDriver, 10);
        YoutubeHomePageUserSteps youtubeHomePageUserSteps5 = new YoutubeHomePageUserSteps(this.myDriver);
        WebDriverWait wait4 = new WebDriverWait(myDriver, 10);
        Assert.assertTrue(youtubeHomePageUserSteps5.selectOptionYourData());
    }

    @Test(description = "Validar la opcion Help", groups = {"regression"}, alwaysRun = true)
    @Severity(SeverityLevel.NORMAL)
    @Description("Check if Validate Help option menu is available")
    @Story("Get to Validate Help option menu")
    public void validateOptionHelp() {
        this.myDriver.get("https://www.youtube.com/");
        YoutubeHomePageUserSteps youtubeHomePageUserSteps=new YoutubeHomePageUserSteps(this.myDriver);
        youtubeHomePageUserSteps.selectSettingsDropMenu();
        WebDriverWait wait = new WebDriverWait(myDriver, 10);
        YoutubeHomePageUserSteps youtubeHomePageUserSteps6 = new YoutubeHomePageUserSteps(this.myDriver);
        WebDriverWait wait5 = new WebDriverWait(myDriver, 10);
        Assert.assertTrue(youtubeHomePageUserSteps6.selectOptionHelp());
    }

    @Test(description = "Validar la opcion FeedBack", groups = {"regression"}, alwaysRun = true)
    @Severity(SeverityLevel.NORMAL)
    @Description("Check if Validate FeedBack menu is available")
    @Story("Get to Validate FeedBack menu")
    public void validateOptionFeedBack() {
        this.myDriver.get("https://www.youtube.com/");
        YoutubeHomePageUserSteps youtubeHomePageUserSteps=new YoutubeHomePageUserSteps(this.myDriver);
        youtubeHomePageUserSteps.selectSettingsDropMenu();
        WebDriverWait wait = new WebDriverWait(myDriver, 10);
        YoutubeHomePageUserSteps youtubeHomePageUserSteps7 = new YoutubeHomePageUserSteps(this.myDriver);
        WebDriverWait wait6 = new WebDriverWait(myDriver, 10);
        Assert.assertTrue(youtubeHomePageUserSteps7.selectOptionSendFeedBack());
    }

    @Test(description = "Validar la opcion KeyBoard", groups = {"regression"}, alwaysRun = true)
    @Severity(SeverityLevel.NORMAL)
    @Description("Check if Validate your Key Board menu is available")
    @Story("Get to Validate your Key Board menu")
    public void validateOptionKeyBoard() {
        this.myDriver.get("https://www.youtube.com/");
        YoutubeHomePageUserSteps youtubeHomePageUserSteps=new YoutubeHomePageUserSteps(this.myDriver);
        youtubeHomePageUserSteps.selectSettingsDropMenu();
        WebDriverWait wait = new WebDriverWait(myDriver, 10);
        YoutubeHomePageUserSteps youtubeHomePageUserSteps8 = new YoutubeHomePageUserSteps(this.myDriver);
        WebDriverWait wait7 = new WebDriverWait(myDriver, 10);
        Assert.assertTrue(youtubeHomePageUserSteps8.selectOptionKeyBoard());
    }

    @Test(description = "Validar la opcion Restricted Mode", groups = {"regression"}, alwaysRun = true)
    @Severity(SeverityLevel.NORMAL)
    @Description("Check if Validate Restricted Mode menu is available")
    @Story("Get to Validate Restricted Mode menu")
    public void validateOptionRestrictedMode() {
        this.myDriver.get("https://www.youtube.com/");
        YoutubeHomePageUserSteps youtubeHomePageUserSteps=new YoutubeHomePageUserSteps(this.myDriver);
        youtubeHomePageUserSteps.selectSettingsDropMenu();
        WebDriverWait wait = new WebDriverWait(myDriver, 10);
        YoutubeHomePageUserSteps youtubeHomePageUserSteps9 = new YoutubeHomePageUserSteps(this.myDriver);
        WebDriverWait wait8 = new WebDriverWait(myDriver, 10);
        Assert.assertTrue(youtubeHomePageUserSteps9.selectOptionRestrictedMode());
    }
}
