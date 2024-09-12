package IQ;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class DOMAttributes {
    @Test
   void dom() throws InterruptedException {
       WebDriver driver = new ChromeDriver();
       driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
       driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("1223");

       System.out.println("getAttribute :"+driver.findElement(By.xpath("//input[@placeholder='Username']")).getAttribute("name"));
       System.out.println("getDomAttribute :"+driver.findElement(By.xpath("//input[@placeholder='Username']")).getDomAttribute("name"));
        System.out.println("getDomProperty :"+driver.findElement(By.xpath("//input[@placeholder='Username']")).getDomProperty("name"));
       System.out.println("getCssValue :"+driver.findElement(By.xpath("//button[@type='submit']")).getCssValue("background-color"));
       Thread.sleep(2000);
       driver.quit();
   }


    }


