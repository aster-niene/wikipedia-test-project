package pages;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class MainPage {

    private static final String TITLE = "Wikipedia, the free encyclopedia";
    private static final String WIKIPEDIA_MAIN_PAGE = "https://en.wikipedia.org/";
    private static final String CSS_SEARCH_FIELD = "input[id='searchInput']";
    private static final String CSS_SEARCH_BUTTON = "input[id='searchButton']";

    private final ChromeDriver driver;

    public MainPage(ChromeDriver driver) {
        this.driver = driver;
    }

    public boolean isOnPage() {
        return driver.getTitle().equals(TITLE);
    }

    public void open() {
        driver.get(WIKIPEDIA_MAIN_PAGE);
    }

    private WebElement getSearchField() {
        return PageUtils.getElementWithExplicitWait(driver, CSS_SEARCH_FIELD);
    }

    private WebElement getSearchButton() {
        return PageUtils.getElementWithExplicitWait(driver, CSS_SEARCH_BUTTON);
    }

    public void inputSearchField(String text) {
        inputToFiled(getSearchField(), text);
    }


    public void searchButtonClick() {
        getSearchButton().click();
    }

    public void enterButtonClick() {
        getSearchField().sendKeys(Keys.ENTER);
    }

    private void inputToFiled(WebElement field, String text) {
        assertTrue(field.isDisplayed());
        field.click();
        field.clear();
        field.sendKeys(text);
    }

}
