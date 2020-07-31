package pages_reklama;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AdPage {
    @FindBy(how = How.CSS, using = ".favs")
    private WebElement addToFavoritesButton;
    @FindBy(how = How.CSS, using = "#favorites_count")
    private WebElement favoritesCountText;

    public void clickAddToFavoritesButton() {
        addToFavoritesButton.click();
    }

    public double getFavoritesCountText() {
        return Integer.parseInt(favoritesCountText.getText());
    }
}
