import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ContactUs extends MainClass{
    public void contact() {

        //clicking contact us
        driver.findElement(By.xpath("//*[@id=\"link-effect-3\"]/ul/li[6]/a")).click();
        driver.navigate().forward();

        //wait for 4 seconds
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        //key chords strings
        String clickln = Keys.chord(Keys.CONTROL,Keys.ENTER);

        //click the linkedIN link on a new tab
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[1]/p/span/a")).sendKeys(clickln);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");

    }


}
