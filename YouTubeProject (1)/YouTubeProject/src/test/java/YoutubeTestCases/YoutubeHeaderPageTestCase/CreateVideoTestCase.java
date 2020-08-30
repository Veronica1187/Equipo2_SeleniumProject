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

public class CreateVideoTestCase extends BaseTestCase {

    @Test(description = "Validar que al dar click se despliegue un menu con las dos opciones: Upload video and Go Live", groups = {"regression"}, alwaysRun = true)

    public void validateCreateDropdownOptions(){
        this.myDriver.get("https://www.youtube.com/");
        YoutubeHomePageUserSteps youtubeHomePageUserSteps = new YoutubeHomePageUserSteps(this.myDriver);
        WebDriverWait wait = new WebDriverWait(myDriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ytd-rich-item-renderer//a[@id='thumbnail']")));

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(youtubeHomePageUserSteps.optionExistInCreateDropdown("Upload video"));
        softAssert.assertTrue(youtubeHomePageUserSteps.optionExistInCreateDropdown("Go live"));
        softAssert.assertFalse(youtubeHomePageUserSteps.optionExistInCreateDropdown("No existe Opcion x"));
        softAssert.assertAll();
    }
}
