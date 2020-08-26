package youtube.pageobjects.leftpageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import youtube.pageobjects.YoutubeBasePageObject;

public class LeftMenuPageObject extends YoutubeBasePageObject {


    @FindBy(how = How.XPATH, using="//a[@id='endpoint' and @aria-label='Principal']")
    private WebElement LeftHomeButton;

    @FindBy(how = How.XPATH, using="//a[@id='endpoint' and @aria-label='Tendencias']")
    private WebElement LeftTrendingButton;

    @FindBy(how = How.XPATH, using="//a[@id='endpoint' and @aria-label='Suscripciones']")
    private WebElement LeftSubscriptionsButton;

    @FindBy(how = How.XPATH, using="//a[@id='endpoint' and @aria-label='Biblioteca']")
    private WebElement LeftLibraryButton;

    @FindBy(how = How.XPATH, using="//a[@id='endpoint' and @aria-label='Historial']")
    private WebElement LeftHistoryButton;

    public LeftMenuPageObject(WebDriver driver, String baseURL) {
        super(driver, baseURL);
    }

    public void clickOnLeftHomeButton(){
        this.LeftHomeButton.click();
    }

    public void clickOnLeftTrendingButton(){
        this.LeftTrendingButton.click();
    }

    public void clickOnLeftSubscriptionsButton(){
        this.LeftSubscriptionsButton.click();
    }

    public void clickOnLeftLibraryButton(){
        this.LeftLibraryButton.click();
    }

    public void clickOnLeftHistoryButton(){
        this.LeftHistoryButton.click();
    }
}
