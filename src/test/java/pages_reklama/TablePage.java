package pages_reklama;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class TablePage {
    @FindBy(how = How.CSS, using = "tbody>tr[class]")
    private List<WebElement> ad;
    @FindBy(how = How.CSS, using = ".fav-add")
    private List<WebElement> addToFavoriteButton;

    public void clickAd(int index) {
        ad.get(index).click();
    }

    public void clickAddToFavoriteButton(int index) {
        addToFavoriteButton.get(index).click();
    }

    public WebElement firstAd(int index) {
        return ad.get(index);
    }
}
