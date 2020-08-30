package youtube.pageobjects.headerpageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import youtube.pageobjects.YoutubeBasePageObject;

import java.util.List;

public class HeaderSettingsPageObject extends YoutubeBasePageObject {

    @FindBy(how = How.XPATH, using = "//button[@id='button' and @aria-label='Configuración']")
    private WebElement settingsDropdown;

    @FindBy(how = How.XPATH, using = "//*[@id='items']//*[@id='label']/..//*[contains(text(), 'Dark theme: Off')]")
    private WebElement theme;

    @FindBy(how= How.XPATH, using = "//*[@id='items']//*[@id='label']/..//*[contains(text(), 'Language:')]")
    private WebElement language;

    @FindBy(how= How.XPATH, using = "//*[@id='items']//*[@id='label']/..//*[contains(text(), 'Location:')]")
    private WebElement location;

    @FindBy(how= How.XPATH, using="//*[@id='items']//*[@id='label']/..//*[contains(text(), 'Settings')]")
    private WebElement settings;

    @FindBy(how= How.XPATH, using= "//*[@id='items']//*[@id='label']/..//*[contains(text(), 'Your data in YouTube')]")
    private WebElement yourData;

    @FindBy(how= How.XPATH, using= "//*[@id='items']//*[@id='label']/..//*[contains(text(), 'Help')]")
    private WebElement help;

    @FindBy(how= How.XPATH, using="//*[@id='items']//*[@id='label']/..//*[contains(text(), 'Send feedback')]")
    private WebElement sendFeedBack;

    @FindBy(how= How.XPATH, using= "//*[@id='items']//*[@id='label']/..//*[contains(text(), 'Keyboard shortcuts')]")
    private WebElement keyboardShortcuts;

    @FindBy(how= How.XPATH, using= "//*[@id='items']//*[@id='label']/..//*[contains(text(), 'Restricted Mode: Off')]")
    private WebElement restrictedMode;

    public HeaderSettingsPageObject(WebDriver driver, String baseURL) {

        super(driver, driver.getCurrentUrl());
    }


    public void clickOnSettingsDropdown(){
        this.settingsDropdown.click();

    }

    public boolean isVisibleTheme(){
        return this.theme.isDisplayed();
    }

    public boolean isVisibleLanguage(){
        return this.language.isDisplayed();
    }

    public boolean isVisibleLocation(){
       return this.location.isDisplayed();
    }

    public boolean isVisibleSetings(){
       return this.settings.isDisplayed();
    }

   public boolean isVisbleYourData(){
        return this.yourData.isDisplayed();
   }

   public boolean isVisbleHelp(){
        return this.help.isDisplayed();
   }

   public boolean isVisbleSendFeedBack(){
        return this.sendFeedBack.isDisplayed();
   }

   public boolean isVisbleKeyboardShortcuts(){
        return this.keyboardShortcuts.isDisplayed();
   }

    public boolean isVisbleRestrictedMode(){
        return this.restrictedMode.isDisplayed();
    }

}
