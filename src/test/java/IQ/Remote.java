package IQ;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.AbstractDriverOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Remote {

    public WebDriver initializeBrowser(String browserName) throws MalformedURLException {
        AbstractDriverOptions options = null;
        if(browserName.equals("chrome")){
            options=new ChromeOptions();
            options.setCapability("browserName","chrome");

        }else if(browserName.equals("firefox")){
            options = new FirefoxOptions();
            options.setCapability("browserName","firefox");

        }
        WebDriver driver =new RemoteWebDriver(new URL(""),options);
        return driver;


    }
}
