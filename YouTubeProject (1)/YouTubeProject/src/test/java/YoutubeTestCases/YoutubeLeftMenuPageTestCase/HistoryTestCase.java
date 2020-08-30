package YoutubeTestCases.YoutubeLeftMenuPageTestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import youtube.pageobjects.leftpageobjects.LeftMenuPageObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import YoutubeTestCases.BaseTestCase;
import youtube.usersteps.YoutubeHomePageUserSteps;

public class HistoryTestCase extends BaseTestCase{

    @Test(description = "Validar que al dar click el boton home lleve a la pagina de Signin y el menu de History type", groups = {"regression"}, alwaysRun = true)

    public void validateHistoryURLInLeft(){
        this.myDriver.get("https://www.youtube.com/");
        YoutubeHomePageUserSteps youtubeHomePageUserSteps = new YoutubeHomePageUserSteps(this.myDriver);
        youtubeHomePageUserSteps.goToHistoryURL();
        WebDriverWait wait = new WebDriverWait(myDriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ytd-browse[@page-subtype='history']//paper-button[@id='button' and @aria-label='Accesar']")));
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(myDriver.getCurrentUrl(), "https://www.youtube.com/feed/history");
        softAssert.assertEquals(myDriver.getTitle(), "YouTube");
        softAssert.assertAll();

    }
}
