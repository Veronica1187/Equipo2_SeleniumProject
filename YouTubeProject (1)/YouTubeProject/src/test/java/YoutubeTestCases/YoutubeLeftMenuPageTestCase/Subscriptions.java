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


public class Subscriptions extends BaseTestCase {

    @Test(description = "Validar que al dar click el boton home lleve a la pagina de Signin", groups = {"regression"}, alwaysRun = true)

    public void validateSubscriptionsURLInLeft(){
        this.myDriver.get("https://www.youtube.com/");
        YoutubeHomePageUserSteps youtubeHomePageUserSteps = new YoutubeHomePageUserSteps(this.myDriver);
        youtubeHomePageUserSteps.goToSubscriptionsURL();
        WebDriverWait wait = new WebDriverWait(myDriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ytd-browse[@page-subtype='subscriptions']//paper-button[@id='button' and @aria-label='Acceder']")));
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(myDriver.getCurrentUrl(), "https://www.youtube.com/feed/subscriptions");
        softAssert.assertEquals(myDriver.getTitle(), "Suscripciones - YouTube");
        softAssert.assertAll();

    }
}
