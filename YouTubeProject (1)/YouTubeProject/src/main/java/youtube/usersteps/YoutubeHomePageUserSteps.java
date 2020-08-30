package youtube.usersteps;

import org.openqa.selenium.WebDriver;
import youtube.pageobjects.headerpageobjects.HeaderHamburguerMainMenuPageObject;
import youtube.pageobjects.headerpageobjects.HeaderSearchPageObject;
import youtube.pageobjects.headerpageobjects.HeaderSingleButtonsAndDropdownsMenuPageObject;
import youtube.pageobjects.leftpageobjects.LeftMenuPageObject;
import youtube.pageobjects.mainpageobjects.MainHistoryResultsPageObject;
import youtube.pageobjects.mainpageobjects.MainSearchResultsPageObject;
import youtube.pageobjects.mainpageobjects.MainTrendingResultsPageObject;
import youtube.pages.YoutubeHomePage;
import youtube.pageobjects.headerpageobjects.HeaderSettingsPageObject;

public class YoutubeHomePageUserSteps {

    private YoutubeHomePage youtubeHomePage;
    LeftMenuPageObject leftMenuPageObject;
    HeaderSettingsPageObject headerSettingsPageObject;
    HeaderHamburguerMainMenuPageObject headerHamburguerMainMenuPageObject;
    HeaderSingleButtonsAndDropdownsMenuPageObject headerSingleButtonsAndDropdownsMenuPageObject;
    HeaderSearchPageObject youtubeSearchPageObject;
    MainSearchResultsPageObject mainSearchResultsPageObject;
    MainHistoryResultsPageObject mainHistoryResultsPageObject;

    public YoutubeHomePageUserSteps(WebDriver driver){

        this.youtubeHomePage = new YoutubeHomePage(driver);
    }

    public void goToSignURLHeader(){
        headerSingleButtonsAndDropdownsMenuPageObject = this.youtubeHomePage.getYoutubeHeaderComponent().getHeaderSingleButtonsAndDropdownsMenuPageObject();
        headerSingleButtonsAndDropdownsMenuPageObject.clickOnSignInButton();

    }

    public boolean compareSignInURL(String actualURL){
        String expectedURL = "https://accounts.google.com/signin/v2/identifier?service=youtube&uilel=3&passive=true&continue=https%3A%2F%2Fwww.youtube.com%2Fsignin%3Faction_handle_signin%3Dtrue%26app%3Ddesktop%26hl%3Des-419%26next%3Dhttps%253A%252F%252Fwww.youtube.com%252F&hl=es-419&ec=65620&flowName=GlifWebSignIn&flowEntry=ServiceLogin";
        return actualURL.trim().equals(expectedURL);

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

    public void historyMenu(String option){
        mainHistoryResultsPageObject = this.youtubeHomePage.getYoutubeMainComponent().getMainHistoryResultsPageObject();
        mainHistoryResultsPageObject.clickOnMainHistoryType(option);

    }

    public void displayHamburguerMenu(){

    }

    public void selectOptionFromCreateMenu(){

    }

    public void selectOptionFromAppsMenu(){

    }

  /*  public void selectOptionFromSettingsMenu(){
        
        headerSettingsPageObject= this.youtubeHomePage.getYoutubeHeaderComponent().getHeaderSettingsPageObject();
        headerSettingsPageObject.clickOnSettingsDropdown();
        
    }*/

    public void selectSettingsDropMenu(){

        headerSettingsPageObject= this.youtubeHomePage.getYoutubeHeaderComponent().getHeaderSettingsPageObject();
        headerSettingsPageObject.clickOnSettingsDropdown();

    }

    public boolean selectOptionTheme(){

        headerSettingsPageObject= this.youtubeHomePage.getYoutubeHeaderComponent().getHeaderSettingsPageObject();
        return  headerSettingsPageObject.isVisibleTheme();

    }

    public boolean selectOptionLanguage(){

        headerSettingsPageObject= this.youtubeHomePage.getYoutubeHeaderComponent().getHeaderSettingsPageObject();
        return  headerSettingsPageObject.isVisibleLanguage();

    }

    public boolean selectOptionLocation(){

        headerSettingsPageObject= this.youtubeHomePage.getYoutubeHeaderComponent().getHeaderSettingsPageObject();
        return  headerSettingsPageObject.isVisibleLocation();

    }

    public boolean selectOptionSetings(){

        headerSettingsPageObject= this.youtubeHomePage.getYoutubeHeaderComponent().getHeaderSettingsPageObject();
        return  headerSettingsPageObject.isVisibleSetings();

    }

    public boolean selectOptionYourData(){

        headerSettingsPageObject= this.youtubeHomePage.getYoutubeHeaderComponent().getHeaderSettingsPageObject();
        return  headerSettingsPageObject.isVisbleYourData();

    }

    public boolean selectOptionHelp(){

        headerSettingsPageObject= this.youtubeHomePage.getYoutubeHeaderComponent().getHeaderSettingsPageObject();
        return  headerSettingsPageObject.isVisbleHelp();

    }

    public boolean selectOptionSendFeedBack(){

        headerSettingsPageObject= this.youtubeHomePage.getYoutubeHeaderComponent().getHeaderSettingsPageObject();
        return  headerSettingsPageObject.isVisbleSendFeedBack();

    }

    public boolean selectOptionKeyBoard(){

        headerSettingsPageObject= this.youtubeHomePage.getYoutubeHeaderComponent().getHeaderSettingsPageObject();
        return  headerSettingsPageObject.isVisbleKeyboardShortcuts();

    }

    public boolean selectOptionRestrictedMode(){

        headerSettingsPageObject= this.youtubeHomePage.getYoutubeHeaderComponent().getHeaderSettingsPageObject();
        return  headerSettingsPageObject.isVisbleRestrictedMode();

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
