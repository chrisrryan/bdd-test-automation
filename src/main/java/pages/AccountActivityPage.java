package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AccountActivityPage {

    private By balance = By.id("balance");
    private By accountId = By.id("accountId");

    private WebDriver driver;

    public AccountActivityPage(WebDriver driver) {
        this.driver = driver;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(balance));
    }

    public String getAccountId() {
        return driver.findElement(accountId).getText();
    }
}
