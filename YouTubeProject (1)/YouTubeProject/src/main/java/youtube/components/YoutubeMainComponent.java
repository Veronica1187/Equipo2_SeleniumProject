package youtube.components;

import org.openqa.selenium.WebDriver;
import youtube.pageobjects.mainpageobjects.MainHomeResultsPageObject;

public class YoutubeMainComponent {
    MainHomeResultsPageObject mainHomeResultsPageObject;

    public YoutubeMainComponent(WebDriver driver){
        this.mainHomeResultsPageObject = new MainHomeResultsPageObject(driver, driver.getCurrentUrl());
    }

    public MainHomeResultsPageObject getMainHomeResultsPageObject() {
        return mainHomeResultsPageObject;
    }
}
