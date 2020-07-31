package pages_reklama;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MenuPage {
    @FindBy(how = How.CSS, using = "[href='/ru/transport/cars/alfa_romeo/table.html']")
    private WebElement alfaRomeoCategory;

    public void clickAlfaRomeoCategory() {
        alfaRomeoCategory.click();
    }
}
