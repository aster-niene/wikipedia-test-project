package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public final class PageUtils {

    private static final int TIME_OUT_IN_SECONDS = 10;

    private PageUtils() {
    }

    public static WebElement getElementWithExplicitWait(ChromeDriver driver, String cssSelector) {
        WebDriverWait wait = new WebDriverWait(driver, TIME_OUT_IN_SECONDS);
        WebElement element = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.cssSelector(cssSelector)));
        return element;
    }
}