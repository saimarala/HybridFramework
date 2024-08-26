package IQ;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class selenium4 {

    @Test
    void test() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.and(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@role='combobox']")), ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@role='combobox']")),ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@role='combobox']"))));
  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@role='combobox']"))).sendKeys("selenium testing", Keys.ARROW_DOWN);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@role='combobox']")));
        wait.until(ExpectedConditions.visibilityOfElementLocated(RelativeLocator.with(By.tagName("input")).toLeftOf(By.xpath("(//input[contains(@value,'Feeling Lucky')])[2]")))).click();


        Thread.sleep(2000);
        driver.quit();
    }
}
