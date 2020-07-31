package pages_reklama;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {
    @FindBy(how = How.CSS, using = "[href='/ru/transport/cars/menus.html']")
    private WebElement firstSubCategoryOfTransportCategory;
    @FindBy(how = How.CSS, using = "[href^='/ru/data/advsearch']")
    private WebElement advantageSearchButton;

    public String getPageUrl() {
        return "https://reklama.bb.lv/ru/";
    }

    public void clickFirstSubCategoryOfTransportCategory() {
        firstSubCategoryOfTransportCategory.click();
    }

    public void clickAdvantageSearchButton() {
        advantageSearchButton.click();
    }
}
