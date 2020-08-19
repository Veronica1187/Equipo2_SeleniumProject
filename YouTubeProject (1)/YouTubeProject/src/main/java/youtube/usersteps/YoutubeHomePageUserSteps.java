package youtube.usersteps;

import org.openqa.selenium.WebDriver;
import youtube.pageobjects.headerpageobjects.HeaderSearchPageObject;
import youtube.pages.YoutubeHomePage;

public class YoutubeHomePageUserSteps {

    private YoutubeHomePage youtubeHomePage;

    public YoutubeHomePageUserSteps(WebDriver driver){
        this.youtubeHomePage = new YoutubeHomePage(driver);
    }

    public void searchVideos(String videos){
        HeaderSearchPageObject youtubeSearchPageObject = this.youtubeHomePage.getYoutubeHeaderComponent().getHeaderSearchPageObject();
        youtubeSearchPageObject.sendKeysSearchBox(videos);
        youtubeSearchPageObject.clickOnSearchButton();
    }

    public void displayHamburguerMenu(){

    }

    public void selectOptionFromCreateMenu(){

    }

    public void selectOptionFromAppsMenu(){

    }

    public void selectOptionFromSettingsMenu(){

    }

}
