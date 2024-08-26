package IQ;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MethodOverLoadingSelenium {

    public static void main(String[] args) {
        WebDriver driver= new ChromeDriver();
        driver.switchTo().frame(0);
        Actions a =new Actions(driver);
        a.click();
     //   ((JavascriptExecutor) driver).executeScript();
    }
}
