package youtube.usersteps;

import org.openqa.selenium.WebDriver;
import youtube.pageobjects.headerpageobjects.HeaderHamburguerMainMenuPageObject;
import youtube.pageobjects.headerpageobjects.HeaderSearchPageObject;
import youtube.pageobjects.headerpageobjects.HeaderSingleButtonsAndDropdownsMenuPageObject;
import youtube.pageobjects.leftpageobjects.LeftMenuPageObject;
import youtube.pageobjects.mainpageobjects.MainSearchResultsPageObject;
import youtube.pageobjects.mainpageobjects.MainTrendingResultsPageObject;
import youtube.pages.YoutubeHomePage;

public class YoutubeHomePageUserSteps {

    private YoutubeHomePage youtubeHomePage;
    LeftMenuPageObject leftMenuPageObject;
    HeaderHamburguerMainMenuPageObject headerHamburguerMainMenuPageObject;
    HeaderSingleButtonsAndDropdownsMenuPageObject headerSingleButtonsAndDropdownsMenuPageObject;
    HeaderSearchPageObject youtubeSearchPageObject;
    MainSearchResultsPageObject mainSearchResultsPageObject;

    public YoutubeHomePageUserSteps(WebDriver driver){
        this.youtubeHomePage = new YoutubeHomePage(driver);
    }

    public void goToHomeURL(){
        leftMenuPageObject = this.youtubeHomePage.getYoutubeLeftComponent().getLeftMenuPageObject();
        headerHamburguerMainMenuPageObject = this.youtubeHomePage.getYoutubeHeaderComponent().getHeaderHamburguerMainMenuPageObject();
        headerHamburguerMainMenuPageObject.clickOnHideAllLeftMenuHamburguerButton();
        leftMenuPageObject.clickOnLeftHomeButton();
    }

    public void goToHomeURLHamburguer(){
        headerHamburguerMainMenuPageObject = this.youtubeHomePage.getYoutubeHeaderComponent().getHeaderHamburguerMainMenuPageObject();
        headerHamburguerMainMenuPageObject.clickOnHamburguerHomeButton();

    }

    public void goToTrendingURL(){
        leftMenuPageObject = this.youtubeHomePage.getYoutubeLeftComponent().getLeftMenuPageObject();
        headerHamburguerMainMenuPageObject = this.youtubeHomePage.getYoutubeHeaderComponent().getHeaderHamburguerMainMenuPageObject();
        headerHamburguerMainMenuPageObject.clickOnHideAllLeftMenuHamburguerButton();
        leftMenuPageObject.clickOnLeftTrendingButton();
    }

    public void goToTrendingURLHamburguer(){
        headerHamburguerMainMenuPageObject = this.youtubeHomePage.getYoutubeHeaderComponent().getHeaderHamburguerMainMenuPageObject();
        headerHamburguerMainMenuPageObject.clickOnHamburguerTrendingButton();

    }

    public void goToSubscriptionsURL(){
        leftMenuPageObject = this.youtubeHomePage.getYoutubeLeftComponent().getLeftMenuPageObject();
        headerHamburguerMainMenuPageObject = this.youtubeHomePage.getYoutubeHeaderComponent().getHeaderHamburguerMainMenuPageObject();
        headerHamburguerMainMenuPageObject.clickOnHideAllLeftMenuHamburguerButton();
        leftMenuPageObject.clickOnLeftSubscriptionsButton();
    }

    public void goToSubscriptionsURLHamburguer(){
        headerHamburguerMainMenuPageObject = this.youtubeHomePage.getYoutubeHeaderComponent().getHeaderHamburguerMainMenuPageObject();
        headerHamburguerMainMenuPageObject.clickOnHamburguerSubscriptionsButton();

    }
    public void goToLibraryURL(){
        leftMenuPageObject = this.youtubeHomePage.getYoutubeLeftComponent().getLeftMenuPageObject();
        headerHamburguerMainMenuPageObject = this.youtubeHomePage.getYoutubeHeaderComponent().getHeaderHamburguerMainMenuPageObject();
        headerHamburguerMainMenuPageObject.clickOnHideAllLeftMenuHamburguerButton();
        leftMenuPageObject.clickOnLeftLibraryButton();
    }

    public void goToLibraryURLHamburguer(){
        headerHamburguerMainMenuPageObject = this.youtubeHomePage.getYoutubeHeaderComponent().getHeaderHamburguerMainMenuPageObject();
        headerHamburguerMainMenuPageObject.clickOnHamburguerLibraryButton();

    }
    public void goToHistoryURL(){
        leftMenuPageObject = this.youtubeHomePage.getYoutubeLeftComponent().getLeftMenuPageObject();
        headerHamburguerMainMenuPageObject = this.youtubeHomePage.getYoutubeHeaderComponent().getHeaderHamburguerMainMenuPageObject();
        headerHamburguerMainMenuPageObject.clickOnHideAllLeftMenuHamburguerButton();
        leftMenuPageObject.clickOnLeftHistoryButton();
    }

    public void goToHistoryURLHamburguer(){
        headerHamburguerMainMenuPageObject = this.youtubeHomePage.getYoutubeHeaderComponent().getHeaderHamburguerMainMenuPageObject();
        headerHamburguerMainMenuPageObject.clickOnHamburguerHistoryButton();

    }

    public boolean optionExistInCreateDropdown(String option){
        headerSingleButtonsAndDropdownsMenuPageObject = this.youtubeHomePage.getYoutubeHeaderComponent().getHeaderSingleButtonsAndDropdownsMenuPageObject();
        headerSingleButtonsAndDropdownsMenuPageObject.clickOnCreateButton();
        return headerSingleButtonsAndDropdownsMenuPageObject.isOptionInCreateDropdown(option);
    }

    public boolean optionExistInAppsDropdown(String option){
        headerSingleButtonsAndDropdownsMenuPageObject = this.youtubeHomePage.getYoutubeHeaderComponent().getHeaderSingleButtonsAndDropdownsMenuPageObject();
        headerSingleButtonsAndDropdownsMenuPageObject.clickOnAppsButton();
        return headerSingleButtonsAndDropdownsMenuPageObject.isOptionInAppsDropdown(option);
    }

    public void searchVideos(String videos){
        youtubeSearchPageObject = this.youtubeHomePage.getYoutubeHeaderComponent().getHeaderSearchPageObject();
        youtubeSearchPageObject.sendKeysSearchBox(videos);
        youtubeSearchPageObject.clickOnSearchButton();

    }

    public boolean valorDeTitle(String contentVideo, String pageTitle){

        String search = contentVideo.replace(" ", "") + "-YouTube";
        return pageTitle.replace(" ","").equals(search);
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
