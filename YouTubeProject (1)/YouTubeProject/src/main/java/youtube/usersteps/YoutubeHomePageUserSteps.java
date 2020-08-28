package youtube.usersteps;

import org.openqa.selenium.WebDriver;
import youtube.pageobjects.headerpageobjects.HeaderHamburguerMainMenuPageObject;
import youtube.pageobjects.headerpageobjects.HeaderSearchPageObject;
import youtube.pageobjects.leftpageobjects.LeftMenuPageObject;
import youtube.pageobjects.mainpageobjects.MainTrendingResultsPageObject;
import youtube.pages.YoutubeHomePage;

public class YoutubeHomePageUserSteps {

    private YoutubeHomePage youtubeHomePage;
    //LeftMenuPageObject leftMenuPageObject = this.youtubeHomePage.getYoutubeLeftComponent().getLeftMenuPageObject();
    //HeaderHamburguerMainMenuPageObject headerHamburguerMainMenuPageObject = this.youtubeHomePage.getYoutubeHeaderComponent().getHeaderHamburguerMainMenuPageObject();
    public YoutubeHomePageUserSteps(WebDriver driver){
        this.youtubeHomePage = new YoutubeHomePage(driver);
    }

    public void goToHomeURL(){
        LeftMenuPageObject leftMenuPageObject = this.youtubeHomePage.getYoutubeLeftComponent().getLeftMenuPageObject();
        //MainTrendingResultsPageObject mainTrendingResultsPageObject = this.youtubeHomePage.getYoutubeMainComponent().getMainTrendingResultsPageObject();
        HeaderHamburguerMainMenuPageObject headerHamburguerMainMenuPageObject = this.youtubeHomePage.getYoutubeHeaderComponent().getHeaderHamburguerMainMenuPageObject();
        headerHamburguerMainMenuPageObject.clickOnHideAllLeftMenuHamburguerButton();
        leftMenuPageObject.clickOnLeftHomeButton();
    }

    public void goToTrendingURL(){
        LeftMenuPageObject leftMenuPageObject = this.youtubeHomePage.getYoutubeLeftComponent().getLeftMenuPageObject();
        //MainTrendingResultsPageObject mainTrendingResultsPageObject = this.youtubeHomePage.getYoutubeMainComponent().getMainTrendingResultsPageObject();
        HeaderHamburguerMainMenuPageObject headerHamburguerMainMenuPageObject = this.youtubeHomePage.getYoutubeHeaderComponent().getHeaderHamburguerMainMenuPageObject();
        headerHamburguerMainMenuPageObject.clickOnHideAllLeftMenuHamburguerButton();
        leftMenuPageObject.clickOnLeftTrendingButton();
    }

    public void goToSubscriptionsURL(){
        LeftMenuPageObject leftMenuPageObject = this.youtubeHomePage.getYoutubeLeftComponent().getLeftMenuPageObject();
        //MainTrendingResultsPageObject mainTrendingResultsPageObject = this.youtubeHomePage.getYoutubeMainComponent().getMainTrendingResultsPageObject();
        HeaderHamburguerMainMenuPageObject headerHamburguerMainMenuPageObject = this.youtubeHomePage.getYoutubeHeaderComponent().getHeaderHamburguerMainMenuPageObject();
        headerHamburguerMainMenuPageObject.clickOnHideAllLeftMenuHamburguerButton();
        leftMenuPageObject.clickOnLeftSubscriptionsButton();
    }

    public void goToLibraryURL(){
        LeftMenuPageObject leftMenuPageObject = this.youtubeHomePage.getYoutubeLeftComponent().getLeftMenuPageObject();
        //MainTrendingResultsPageObject mainTrendingResultsPageObject = this.youtubeHomePage.getYoutubeMainComponent().getMainTrendingResultsPageObject();
        HeaderHamburguerMainMenuPageObject headerHamburguerMainMenuPageObject = this.youtubeHomePage.getYoutubeHeaderComponent().getHeaderHamburguerMainMenuPageObject();
        headerHamburguerMainMenuPageObject.clickOnHideAllLeftMenuHamburguerButton();
        leftMenuPageObject.clickOnLeftLibraryButton();
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

    public void searchForVideo(){
    }

    public void selectVideoFromResults(){

    }

    public void selectVideoThumbnailFromRecommended(){

    }

    public void selectVideoThumbnailFromTrending(){

    }


    public void selectVideoThumbnailFromNews(){

    }


}
