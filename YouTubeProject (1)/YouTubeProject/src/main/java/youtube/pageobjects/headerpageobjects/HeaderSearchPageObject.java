package youtube.pageobjects.headerpageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import youtube.pageobjects.YoutubeBasePageObject;

public class HeaderSearchPageObject extends YoutubeBasePageObject {

    @FindBy(how = How.XPATH, using = "//div[@id='search-input']//input[@id='search']" )
    private WebElement searchBox;
    @FindBy(how = How.ID, using ="search-icon-legacy")
    private WebElement searchButton;

    public HeaderSearchPageObject(WebDriver driver, String baseURL) {
        super(driver, baseURL);
    }

    public void sendKeysSearchBox(String word){
        this.searchBox.clear();
        this.searchBox.sendKeys(word);
    }

    public void clickOnSearchButton(){
        this.searchButton.click();
    }

}
