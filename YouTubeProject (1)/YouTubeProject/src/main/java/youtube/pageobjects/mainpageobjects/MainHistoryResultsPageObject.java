/*package youtube.pageobjects.mainpageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import youtube.pageobjects.YoutubeBasePageObject;

import java.util.List;

public class MainHistoryResultsPageObject extends YoutubeBasePageObject {

    @FindBy(how= How.XPATH, using="")
    private WebElement mainHistoryMessage;

    @FindBy()
    private WebElement mainHistorySignInButton;

    @FindBy(how= How.XPATH, using="//div//ytd-sub-feed-option-renderer//a[contains(@href,'history')]/paper-radio-button")
    private WebElement mainHistoryOption;

    @FindBy(how=How.XPATH, using="//div//ytd-sub-feed-option-renderer//a[contains(@href,'search')]/paper-radio-button")
    private WebElement mainSearchHistOption;

    @FindBy(how=How.XPATH, using="//div//ytd-sub-feed-option-renderer//a[contains(@href,'comment')]/paper-radio-button")
    private WebElement mainCommentHistOption;

    @FindBy(how=How.XPATH, using="//div//ytd-sub-feed-option-renderer//a[contains(@href,'community')]/paper-radio-button")
    private WebElement mainCommunityHistOption;

    @FindBy(how=How.XPATH, using="//div//ytd-sub-feed-option-renderer//a[contains(@href,'live')]/paper-radio-button")
    private WebElement mainLiveHistOption;

    public MainHistoryResultsPageObject(WebDriver driver, String baseURL) {
        super(driver, baseURL);
    }

    public void clickOnMainSignInButton(){

    }

    public void clickOnMainHistoryType(String option){
           switch(option){
               case "Watch History":
                   this.mainHistoryOption.click();
                   this.mainHistoryOption.getText();
                   break;
               case "Search History":
                   this.mainSearchHistOption.click();
                   this.mainSearchHistOption.getText();
                   break;
               case "Comments":
                   this.mainCommentHistOption.click();
                   this.mainCommentHistOption.getText();
                   break;
               case "Community":
                   this.mainCommunityHistOption.click();
                   this.mainCommunityHistOption.getText();
                   break;
               case "Live Chat":
                   this.mainLiveHistOption.click();
                   this.mainLiveHistOption.getText();
                   break;
           }
    }
}
*/
