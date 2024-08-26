package IQ;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ConsOverloadingSelenium {
    public static void main(String[] args) {
        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--headless=new");

        WebDriver driver = new ChromeDriver(opt);
        //WebDriver driver = new ChromeDriver();
        WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(20));

    }
}
