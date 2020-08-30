package youtube.pageobjects.headerpageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import youtube.pageobjects.YoutubeBasePageObject;

public class HeaderHamburguerMainMenuPageObject extends YoutubeBasePageObject {

    @FindBy(how = How.XPATH, using = "//button[@id='button' and @aria-pressed='false']")
    private WebElement unhideAllLeftMenuHamburguerButton;

    @FindBy(how = How.XPATH, using = "//button[@id='button' and @aria-pressed='true']")
    private WebElement hideAllLeftMenuHamburguerButton;

    @FindBy(how = How.XPATH, using="//a[@id='endpoint' and @role= 'tablist' and @title='Principal']")
    private WebElement hamburguerHomeButton;

    @FindBy(how = How.XPATH, using="//a[@id='endpoint' and @role= 'tablist' and @title='Tendencias']")
    private WebElement hamburguerTrendingButton;

    @FindBy(how = How.XPATH, using="//a[@id='endpoint' and @role= 'tablist' and @title='Suscripciones']")
    private WebElement hamburguerSubscriptionsButton;

    @FindBy(how = How.XPATH, using="//a[@id='endpoint' and @role= 'tablist' and @title='Biblioteca']")
    private WebElement hamburguerLibraryButton;

    @FindBy(how = How.XPATH, using="//a[@id='endpoint' and @role= 'tablist' and @title='Historial']")
    private WebElement hamburguerHistoryButton;

    public HeaderHamburguerMainMenuPageObject(WebDriver driver, String baseURL) {
        super(driver, baseURL);
    }

    public void clickOnUnhideAllLeftMenuHamburguerButton(){
        this.unhideAllLeftMenuHamburguerButton.click();
    }

    public void clickOnHideAllLeftMenuHamburguerButton(){
        this.hideAllLeftMenuHamburguerButton.click();
    }

    public void clickOnHamburguerHomeButton(){
        this.hamburguerHomeButton.click();
    }

    public void clickOnHamburguerTrendingButton(){
        this.hamburguerTrendingButton.click();
    }

    public void clickOnHamburguerSubscriptionsButton(){
        this.hamburguerSubscriptionsButton.click();
    }

    public void clickOnHamburguerLibraryButton(){
        this.hamburguerLibraryButton.click();
    }

    public void clickOnHamburguerHistoryButton(){
        this.hamburguerHistoryButton.click();
    }
}
