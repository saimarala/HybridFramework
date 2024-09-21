package Reference;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class ExplicitWait {

    @Test
    void test(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
        WebElement element =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
        List<WebElement> webElementList =driver.findElements(By.xpath(""));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
        wait.until(ExpectedConditions.visibilityOf(element));

        wait.until(ExpectedConditions.visibilityOfAllElements(element));//webElement
        wait.until(ExpectedConditions.visibilityOfAllElements(webElementList));//List<WebElement>
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("")));

        wait.until(ExpectedConditions.visibilityOfNestedElementsLocatedBy(By.xpath("parent"),By.xpath("child")));
        wait.until(ExpectedConditions.visibilityOfNestedElementsLocatedBy(element,By.xpath("child")));

        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("")));
        wait.until(ExpectedConditions.invisibilityOf(element));

        wait.until(ExpectedConditions.invisibilityOfAllElements(element));//webElement
        wait.until(ExpectedConditions.invisibilityOfAllElements(webElementList));//List<WebElement>

        wait.until(ExpectedConditions.invisibilityOfElementWithText(By.xpath(""),"text"));

     //   wait.until(ExpectedConditions.textMatches(By.xpath(""),"a-z"));
        wait.until(ExpectedConditions.textToBePresentInElement(element,"text"));
        wait.until(ExpectedConditions.textToBePresentInElementValue(By.xpath(""),"text"));
        wait.until(ExpectedConditions.textToBePresentInElementValue(element,"text"));
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath(""),"text"));
        wait.until(ExpectedConditions.textToBe(By.xpath(""),"text"));

        wait.until(ExpectedConditions.titleIs("text"));
        wait.until(ExpectedConditions.titleContains("text"));

        wait.until(ExpectedConditions.elementToBeClickable(element));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("")));

        wait.until(ExpectedConditions.elementSelectionStateToBe(element,true));
        wait.until(ExpectedConditions.elementSelectionStateToBe(By.xpath(""),true));

        wait.until(ExpectedConditions.elementToBeSelected(element));
        wait.until(ExpectedConditions.elementToBeSelected(By.xpath("")));

        wait.until(ExpectedConditions.attributeContains(element,"test","test"));
        wait.until(ExpectedConditions.attributeContains(By.xpath(""),"test","test"));

        wait.until(ExpectedConditions.attributeToBe(element,"test","test"));
        wait.until(ExpectedConditions.attributeToBe(By.xpath(""),"test","test"));

        wait.until(ExpectedConditions.attributeToBeNotEmpty(element,"test"));

        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("")));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(1));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(element));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("frame"));

        wait.until(ExpectedConditions.alertIsPresent());
        wait.until(ExpectedConditions.domAttributeToBe(element,"attribute","value"));
        wait.until(ExpectedConditions.domPropertyToBe(element,"attribute","value"));

        wait.until(ExpectedConditions.urlContains("value"));
        wait.until(ExpectedConditions.urlMatches("value"));
        wait.until(ExpectedConditions.urlToBe("value"));

        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath(""),1));
        wait.until(ExpectedConditions.numberOfElementsToBeLessThan(By.xpath(""),5));
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath(""),5));
        wait.until(ExpectedConditions.numberOfWindowsToBe(5));

        wait.until(ExpectedConditions.refreshed(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@role='combobox']"))));

//and
//and
        wait.until(ExpectedConditions.and
                (ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@role='combobox']")),
                        ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@role='combobox']")),
                        ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@role='combobox']"))));
        //or
        wait.until(ExpectedConditions.or
                (ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@role='combobox']")),
                        ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@role='combobox']")),
                        ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@role='combobox']"))));








    }
}
