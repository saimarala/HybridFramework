package IQ;

import io.opentelemetry.semconv.UrlAttributes;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class BrokenLinks {

    public static void main(String[] args) throws IOException {

        WebDriver driver = new ChromeDriver();
        driver.get("http://www.deadlinkcity.com/");
        
        int count =0;
        for (WebElement link : driver.findElements(By.tagName("a"))) {
            String href = link.getAttribute("href");
            if(href.isEmpty()||href==null){
                continue;
            }

            URL linkURL=new URL(href);
            HttpURLConnection conn=(HttpURLConnection)linkURL.openConnection();
            conn.connect();
            if(conn.getResponseCode()>=400){
                System.out.println("broken links");
                count++;
            }else{
                System.out.println();
            }


        }

    }
}
