package pages;


import org.openqa.selenium.chrome.ChromeDriver;

public class SearchResultPage {

    private static final String TITLE = "Search - Wikipedia";

    private final ChromeDriver driver;

    public SearchResultPage(ChromeDriver driver) {
        this.driver = driver;
    }

    public boolean titleContains(String title) {
        return driver.getTitle().contains(title);
    }

    public boolean atPage() {
        return driver.getTitle().equals(TITLE);
    }

}
