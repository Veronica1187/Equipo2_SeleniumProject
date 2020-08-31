package YoutubeTestCases.YoutubeHeaderPageTestCase;

import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.Test;
import YoutubeTestCases.BaseTestCase;
import youtube.usersteps.YoutubeHomePageUserSteps;


@Epic("Youtube Testing")
@Feature("Youtube Apps Feature")

public class YoutubeAppsTestCase extends BaseTestCase {

    @Test(description = "Validar que al dar click se despliegue un menu", groups = {"regression"}, alwaysRun = true)
    @Severity(SeverityLevel.NORMAL)
    @Description("Validate Apps Dropdown Options")
    @Story("Validate Apps Dropdown Options")
    public void validateAppsDropdownOptions(){
        this.myDriver.get("https://www.youtube.com/");
        YoutubeHomePageUserSteps youtubeHomePageUserSteps = new YoutubeHomePageUserSteps(this.myDriver);
        WebDriverWait wait = new WebDriverWait(myDriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ytd-rich-item-renderer//a[@id='thumbnail']")));

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(youtubeHomePageUserSteps.optionExistInAppsDropdown("YouTube TV"));
        softAssert.assertTrue(youtubeHomePageUserSteps.optionExistInAppsDropdown("YouTube Music"));
        softAssert.assertTrue(youtubeHomePageUserSteps.optionExistInAppsDropdown("YouTube Kids"));
        softAssert.assertTrue(youtubeHomePageUserSteps.optionExistInAppsDropdown("Academia de Creadores"));
        softAssert.assertTrue(youtubeHomePageUserSteps.optionExistInAppsDropdown("YouTube para Artistas"));
        softAssert.assertAll();
    }

}
