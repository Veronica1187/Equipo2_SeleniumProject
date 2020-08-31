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
@Feature("History Option")
public class HistoryTestCase extends BaseTestCase{

    @Test(description = "Validar que al dar click el boton home lleve a la pagina de Signin y el menu de History type", groups = {"regression"}, alwaysRun = true)
    @Severity(SeverityLevel.NORMAL)
    @Description("Validate the History URL")
    @Story("Validate the History URL")
    public void validateHistoryURLHamburguer(){
        this.myDriver.get("https://www.youtube.com/");
        YoutubeHomePageUserSteps youtubeHomePageUserSteps = new YoutubeHomePageUserSteps(this.myDriver);
        youtubeHomePageUserSteps.goToHistoryURLHamburguer();
        WebDriverWait wait = new WebDriverWait(myDriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ytd-browse[@page-subtype='history']//paper-button[@id='button' and @aria-label='Sign in']")));
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(myDriver.getCurrentUrl(), "https://www.youtube.com/feed/history");
        softAssert.assertEquals(myDriver.getTitle(), "YouTube");
        softAssert.assertAll();

    }
}
