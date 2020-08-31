package YoutubeTestCases.YoutubeLeftMenuPageTestCase;

import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import youtube.pageobjects.leftpageobjects.LeftMenuPageObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import YoutubeTestCases.BaseTestCase;
import youtube.usersteps.YoutubeHomePageUserSteps;
@Epic("Youtube Testing")
@Feature("Trending Option")
public class TrendingTestCase extends BaseTestCase {

    @Test(description = "Validar que al dar click el boton home lleve a la pagina Trending", groups = {"regression"}, alwaysRun = true)
    @Severity(SeverityLevel.NORMAL)
    @Description("Validate the Trending URL")
    @Story("Validate the Trending URL")
    public void validateTrendingURLInLeft(){
        this.myDriver.get("https://www.youtube.com/");
        YoutubeHomePageUserSteps youtubeHomePageUserSteps = new YoutubeHomePageUserSteps(this.myDriver);
        youtubeHomePageUserSteps.goToTrendingURL();
        WebDriverWait wait = new WebDriverWait(myDriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(local-name(),'sub-menu-avatar-renderer')]//div")));
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(myDriver.getCurrentUrl(), "https://www.youtube.com/feed/trending");
        softAssert.assertEquals(myDriver.getTitle(), "Tendencias - YouTube");
        softAssert.assertAll();

    }
}
