package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import pages_reklama.*;

import static org.junit.Assert.assertEquals;

public class ReklamaSteps {
    static HomePage homePage;
    static MenuPage menuPage;
    static TablePage tablePage;
    static AdPage adPage;
    static SearchPage searchPage;
    private final WebDriver driver;

    public ReklamaSteps() {
        this.driver = Hooks.driver;
        homePage = PageFactory.initElements(Hooks.driver, HomePage.class);
        menuPage = PageFactory.initElements(Hooks.driver, MenuPage.class);
        tablePage = PageFactory.initElements(Hooks.driver, TablePage.class);
        adPage = PageFactory.initElements(Hooks.driver, AdPage.class);
        searchPage = PageFactory.initElements(Hooks.driver, SearchPage.class);
    }

    @Given("^I (?:am on|open) the home page$")
    public void iAmOnHomePage() {

        driver.manage().window().maximize();
        driver.get(homePage.getPageUrl());
    }

    @And("^I go to Transport category and select the first subcategory from the list$")
    public void iGoToTransportCategoryAndSelectTheFirstSubcategoryFromTheList() {
        homePage.clickFirstSubCategoryOfTransportCategory();
    }

    @And("^I select Alfa Romeo category$")
    public void iSelectAlfaRomeoCategory() {
        menuPage.clickAlfaRomeoCategory();
    }

    @And("^I click Add to favorites Button$")
    public void iClickAddToFavoritesButton() {
        adPage.clickAddToFavoritesButton();
    }

    @Then("^I verify that favorite ads count is (\\d+)$")
    public void iVerifyThatFavoriteAdsCountIs(int count) {
        assertEquals("The favorite counts of ads is not as expected", count, adPage.getFavoritesCountText(), 0);
    }

    @And("^I select #(\\d+) ad from the list and add to Memo$")
    public void iSelectAdFromTheListAndAddToMemo(int adNumber) {
        Actions builder = new Actions(driver);
        builder.moveToElement(tablePage.firstAd(adNumber - 1)).perform();
        tablePage.clickAddToFavoriteButton(adNumber - 1);
    }

    @And("^I open #(\\d+) ad from the list$")
    public void iOpenAdFromTheList(int adNumber) {
        tablePage.clickAd(adNumber-1);
    }

    @And("^I click Advanced search button$")
    public void iClickAdvancedSearchButton() {
        homePage.clickAdvantageSearchButton();
    }

    @And("^I enter \"([^\"]*)\" to the Advanced search input field$")
    public void iEnterToTheAdvancedSearchInputField(String inputText) {
        searchPage.enterTextToAdvancedSearchInputField(inputText);
    }

    @And("^I click Search button for advanced search$")
    public void iClickSearchButtonForAdvancedSearch() {
        searchPage.clickAdvancedSearchButton();
    }
}