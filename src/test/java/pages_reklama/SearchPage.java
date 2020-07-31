package pages_reklama;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearchPage {
    @FindBy(how = How.CSS, using = "input[type='text'][name*='andlike_txt']")
    private WebElement advancedSearchInputField;
    @FindBy(how = How.CSS, using = "input[type='submit'][onclick*='testSearch'][name='btnSearch']")
    private WebElement advancedSearchButton;
    @FindBy(how = How.CSS, using = "#favorites_count")
    private WebElement favoritesCountText;

    public void enterTextToAdvancedSearchInputField(String inputText) {
        advancedSearchInputField.clear();
        advancedSearchInputField.sendKeys(inputText);
    }

    public void clickAdvancedSearchButton() {
        advancedSearchButton.click();
    }
}
