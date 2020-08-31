package YoutubeTestCases.YoutubeHeaderPageTestCase;

import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import YoutubeTestCases.BaseTestCase;
import youtube.usersteps.YoutubeHomePageUserSteps;

@Epic("Youtube Testing")
@Feature("Signin Feature")

public class SigninTestCase extends BaseTestCase {

    @Test(description = "Validar el Signin de la pagina", groups = {"regression"}, alwaysRun = true)
    @Severity(SeverityLevel.NORMAL)
    @Description("Validate the sign in")
    @Story("Sign in")
    public void validateSignInURLHamburguer(){
        this.myDriver.get("https://www.youtube.com/");
        YoutubeHomePageUserSteps youtubeHomePageUserSteps = new YoutubeHomePageUserSteps(this.myDriver);
        youtubeHomePageUserSteps.goToSignURLHeader();
        Assert.assertTrue(youtubeHomePageUserSteps.compareSignInURL(myDriver.getCurrentUrl()));
    }

}
