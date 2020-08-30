package YoutubeTestCases.YoutubeHeaderPageTestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import youtube.pageobjects.headerpageobjects.HeaderSingleButtonsAndDropdownsMenuPageObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import YoutubeTestCases.BaseTestCase;
import youtube.usersteps.YoutubeHomePageUserSteps;

public class YoutubeAppsTestCase extends BaseTestCase {

    @Test(description = "Validar que al dar click se despliegue un menu", groups = {"regression"}, alwaysRun = true)

    public void validateAppsDropdownOptions(){
        this.myDriver.get("https://www.youtube.com/");
        YoutubeHomePageUserSteps youtubeHomePageUserSteps = new YoutubeHomePageUserSteps(this.myDriver);
        WebDriverWait wait = new WebDriverWait(myDriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ytd-rich-item-renderer//a[@id='thumbnail']")));

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(youtubeHomePageUserSteps.optionExistInAppsDropdown("YouTube TV"));
        softAssert.assertTrue(youtubeHomePageUserSteps.optionExistInAppsDropdown("YouTube Music"));
        softAssert.assertTrue(youtubeHomePageUserSteps.optionExistInAppsDropdown("YouTube Kids"));
        softAssert.assertTrue(youtubeHomePageUserSteps.optionExistInAppsDropdown("Creator Academy"));
        softAssert.assertTrue(youtubeHomePageUserSteps.optionExistInAppsDropdown("Youtube for Artist"));
        softAssert.assertAll();
    }

}
