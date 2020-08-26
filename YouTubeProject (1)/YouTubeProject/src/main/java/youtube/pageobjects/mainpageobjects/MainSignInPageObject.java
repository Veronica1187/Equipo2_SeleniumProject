package youtube.pageobjects.mainpageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import youtube.pageobjects.YoutubeBasePageObject;

public class MainSignInPageObject extends YoutubeBasePageObject {
    @FindBy(how = How.XPATH, using = "//ytd-browse[@page-subtype='subscriptions']//div[@class='promo-message style-scope ytd-background-promo-renderer']")
    private WebElement mainSubscriptionMessage;

    @FindBy(how = How.XPATH, using ="//ytd-browse[@page-subtype='subscriptions']//paper-button[@id='button' and @aria-label='Acceder']")
    private WebElement mainSubscriptionSignInButton;

    @FindBy(how = How.XPATH, using="//ytd-browse[not(@page-subtype)]//div[@class='promo-message style-scope ytd-background-promo-renderer']")
    private WebElement mainLibraryMessage;

    @FindBy(how = How.XPATH, using = "//ytd-browse[not(@page-subtype)]//paper-button[@id='button' and @aria-label='Acceder']")
    private WebElement mainLibrarySignInButton;

    public MainSignInPageObject(WebDriver driver, String baseURL) {
        super(driver, baseURL);
    }

    private void getMainSubscriptionMessage(){
        this.mainSubscriptionMessage.getAttribute("innerText");
    }

    private void getMainLibraryMessage(){
        this.mainLibraryMessage.getAttribute("innerText");
    }

    public void clickOnMainSubscriptionSignInButton(){
        this.mainSubscriptionSignInButton.click();
    }

    public void clickOnMainLibrarySignInButton(){
        this.mainLibrarySignInButton.click();
    }
}
