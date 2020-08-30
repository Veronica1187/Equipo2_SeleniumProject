package YoutubeTestCases.YoutubeHeaderPageTestCase;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import youtube.pages.YoutubeSigninPage.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import YoutubeTestCases.BaseTestCase;

import youtube.usersteps.YoutubeHomePageUserSteps;


public class SigninTestCase extends BaseTestCase {

    @Test(description = "Validar el Signin de la pagina", groups = {"regression"}, alwaysRun = true)

    public void validateSignInURLHamburguer(){
        this.myDriver.get("https://www.youtube.com/");
        YoutubeHomePageUserSteps youtubeHomePageUserSteps = new YoutubeHomePageUserSteps(this.myDriver);
        youtubeHomePageUserSteps.goToSignURLHeader();
        Assert.assertTrue(youtubeHomePageUserSteps.compareSignInURL(myDriver.getCurrentUrl()));
    }

}
