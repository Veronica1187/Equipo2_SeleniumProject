package youtube.pageobjects.leftpageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import youtube.pageobjects.YoutubeBasePageObject;

public class LeftMenuPageObject extends YoutubeBasePageObject {


    @FindBy(how = How.XPATH, using="//a[@id='endpoint' and @aria-label='Home']")
    private WebElement LeftHomeButton;

    @FindBy(how = How.XPATH, using="//a[@id='endpoint' and @aria-label='Trending']")
    private WebElement LeftTrendingButton;

    @FindBy(how = How.XPATH, using="//a[@id='endpoint' and @aria-label='Subscriptions']")
    private WebElement LeftSubscriptionsButton;

    @FindBy(how = How.XPATH, using="//a[@id='endpoint' and @aria-label='Library']")
    private WebElement LeftLibraryButton;

    @FindBy(how = How.XPATH, using="//a[@id='endpoint' and @aria-label='History']")
    private WebElement LeftHistoryButton;

    public LeftMenuPageObject(WebDriver driver, String baseURL) {
        super(driver, baseURL);
    }

    public void clickOnLeftHomeButton(){
        this.LeftHomeButton.click();
    }

    public void clickOnLeftTrendingButton(){
        this.LeftTrendingButton.click();
        WebDriverWait wait = new WebDriverWait(this.driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(local-name(),'sub-menu-avatar-renderer')]//div")));

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
