package youtube.pageobjects.headerpageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import youtube.pageobjects.YoutubeBasePageObject;

import java.util.List;

public class HeaderSingleButtonsAndDropdownsMenuPageObject extends YoutubeBasePageObject {

    @FindBy(how = How.ID, using="logo")
    private WebElement YoutubeIconButton;

    @FindBy(how = How.XPATH, using = "//button[@id='button' and @aria-label='Crear']")
    private WebElement createDropdown;

    @FindBy(how = How.XPATH, using = "//*[contains(local-name(),'compact-link-renderer')]")
    private List<WebElement> optionsCreateDropdown;

    @FindBy(how = How.XPATH, using = "//button[@id='button' and @aria-label='Apps de YouTube']")
    private WebElement appsDropdown;

    @FindBy(how = How.XPATH, using = "//*[contains(local-name(),'compact-link-renderer')]")
    private List<WebElement> optionsAppsDropdown;

    @FindBy(how = How.XPATH, using = "//div[@id='end']//paper-button[@id='button' and @aria-label='Acceder']")
    private WebElement signInButton;

    public HeaderSingleButtonsAndDropdownsMenuPageObject(WebDriver driver, String baseURL) {
        super(driver, baseURL);
    }

    public void clickOnYoutubeIconButton(){
        this.YoutubeIconButton.click();
    }

    public boolean isEmptyOptionsCreateDropdown(){
        return  this.optionsCreateDropdown.isEmpty();
    }
    public void selectOnCreateDropdown(){

    }

    public boolean isEmptyOptionsAppsDropdown(){
        return  this.optionsAppsDropdown.isEmpty();
    }

    public void selectOnAppsDropdown(){

    }

    public void clickOnSignInButton(){
        this.signInButton.click();
    }

}
