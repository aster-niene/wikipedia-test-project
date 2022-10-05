package tests;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.*;

import static org.assertj.core.api.Assertions.assertThat;

public class WikipediaSearchTest extends ChromeWebDriverTest {

    private MainPage mainPage;
    private SearchResultPage searchResultPage;

    private String lowerCaseText = "test";
    private String upperCaseText = "TEST";
    private String upperAndLowerCaseText = "Test";

    @BeforeEach
    public void init() {
        mainPage = new MainPage(driver);
        searchResultPage = new SearchResultPage(driver);
    }

    @Test
    public void openHomePage() {
        mainPage.open();
        assertThat(mainPage.isOnPage()).isTrue();
    }

    @Test
    public void openSearchPage() {
        mainPage.open();
        mainPage.searchButtonClick();
        assertThat(searchResultPage.atPage()).isTrue();
    }

    @Test
    public void searchLowerCase() {
        mainPage.open();
        mainPage.inputSearchField(lowerCaseText);
        mainPage.searchButtonClick();
        assertThat(searchResultPage.titleContains(upperAndLowerCaseText)).isTrue();
    }

    @Test
    public void searchUpperCase() {
        mainPage.open();
        mainPage.inputSearchField(upperCaseText);
        mainPage.searchButtonClick();
        assertThat(searchResultPage.titleContains(upperAndLowerCaseText)).isTrue();
    }

    @Test
    public void enterSearch() {
        mainPage.open();
        mainPage.inputSearchField(upperAndLowerCaseText);
        mainPage.enterButtonClick();
        assertThat(searchResultPage.titleContains(upperAndLowerCaseText)).isTrue();
    }

    @Test
    public void searchButtonSearch() {
        mainPage.open();
        mainPage.inputSearchField(upperAndLowerCaseText);
        mainPage.searchButtonClick();
        assertThat(searchResultPage.titleContains(upperAndLowerCaseText)).isTrue();
    }
}
