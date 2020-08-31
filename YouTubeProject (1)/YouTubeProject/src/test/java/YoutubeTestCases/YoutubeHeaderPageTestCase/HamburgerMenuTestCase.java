package YoutubeTestCases.YoutubeHeaderPageTestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import youtube.pageobjects.headerpageobjects.HeaderHamburguerMainMenuPageObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import YoutubeTestCases.BaseTestCase;
import youtube.usersteps.YoutubeHomePageUserSteps;

public class HamburgerMenuTestCase extends BaseTestCase {

<<<<<<< HEAD

=======
>>>>>>> a59d209e7a1c46a435bddc306c69907622596e94
    @Test(description = "Validar que al dar click se despliegue un menu con las opciones: Home, Trending, Subscriptions, Library, History", groups = {"regression"}, alwaysRun = true)

    public static void hamburgerMenu(){



    }


    @Test(description = "Click on Home", groups = {"regression"}, alwaysRun = true)

    public void validateHomeURLHamburguer(){
        this.myDriver.get("https://www.youtube.com/");
        YoutubeHomePageUserSteps youtubeHomePageUserSteps = new YoutubeHomePageUserSteps(this.myDriver);
        youtubeHomePageUserSteps.goToHomeURLHamburguer();
        WebDriverWait wait = new WebDriverWait(myDriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ytd-rich-item-renderer//a[@id='thumbnail']")));
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(myDriver.getCurrentUrl(), "https://www.youtube.com/");
        softAssert.assertEquals(myDriver.getTitle(), "YouTube");
        softAssert.assertAll();

    }

    @Test(description = "Click en Trending", groups = {"regression"}, alwaysRun = true)

    public void validateTrendingURLInHamburguer(){
        this.myDriver.get("https://www.youtube.com/");
        YoutubeHomePageUserSteps youtubeHomePageUserSteps = new YoutubeHomePageUserSteps(this.myDriver);
        youtubeHomePageUserSteps.goToTrendingURLHamburguer();
        WebDriverWait wait = new WebDriverWait(myDriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(local-name(),'sub-menu-avatar-renderer')]//div")));
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(myDriver.getCurrentUrl(), "https://www.youtube.com/feed/trending");
        softAssert.assertEquals(myDriver.getTitle(), "Trending - YouTube");
        softAssert.assertAll();

    }

    @Test(description = "Click on Subscription", groups = {"regression"}, alwaysRun = true)

    public void validateSubscriptionsURLHamburguer(){
        this.myDriver.get("https://www.youtube.com/");
        YoutubeHomePageUserSteps youtubeHomePageUserSteps = new YoutubeHomePageUserSteps(this.myDriver);
        youtubeHomePageUserSteps.goToSubscriptionsURLHamburguer();
        WebDriverWait wait = new WebDriverWait(myDriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ytd-browse[@page-subtype='subscriptions']//paper-button[@id='button' and @aria-label='Sign in']")));
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(myDriver.getCurrentUrl(), "https://www.youtube.com/feed/subscriptions");
        softAssert.assertEquals(myDriver.getTitle(), "Subscriptions - YouTube");
        softAssert.assertAll();

    }

    @Test(description = "Click on Library", groups = {"regression"}, alwaysRun = true)

    public void validateLibraryURLInHamburguer(){
        this.myDriver.get("https://www.youtube.com/");
        YoutubeHomePageUserSteps youtubeHomePageUserSteps = new YoutubeHomePageUserSteps(this.myDriver);
        youtubeHomePageUserSteps.goToLibraryURLHamburguer();
        WebDriverWait wait = new WebDriverWait(myDriver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ytd-browse[not(@page-subtype)]//paper-button[@id='button' and @aria-label='Acceder']")));
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(myDriver.getCurrentUrl(), "https://www.youtube.com/feed/library");
        softAssert.assertEquals(myDriver.getTitle(), "Library - YouTube");
        softAssert.assertAll();

    }

    @Test(description = "Click on History", groups = {"regression"}, alwaysRun = true)

    public void validateHistoryURLInLeft(){
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
