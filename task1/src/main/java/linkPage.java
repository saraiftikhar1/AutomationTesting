import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class linkPage extends MainClass {

    public void LinkPage() throws InterruptedException {

        //validate if your Title of the page is correct
        System.out.println(driver.getTitle());

        //validate if you are landed on correct url
        System.out.println(driver.getCurrentUrl());

        //logo exist or not
        driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[1]/h1/a")).click();

        //wait for 4 sec
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[2]/div/section/div/ol/li[3]/a")).click(); //to validate the number points*/
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[2]/div/section/div/ol/li[6]/a")).click();
        driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);


        JavascriptExecutor js = (JavascriptExecutor) driver;
        // This  will scroll down the page by  1000 pixel vertical
        try {Thread.sleep(3000);
            int i = 0;
            for (; i <= 2000; i++) {
                ((JavascriptExecutor) MainClass.driver).executeScript(("window.scrollBy(0,1)"), "");
            }
            for (; i > 0; i--) {
                ((JavascriptExecutor) MainClass.driver).executeScript(("window.scrollBy(0,1)"), "");
            }
        } catch (WebDriverException wde) {
        } catch (Exception e) {
        }
        try {
            int j = 0;
            for (; j > -300; j--) {
                ((JavascriptExecutor) MainClass.driver).executeScript(("window.scrollBy(0," + j + ")"), "");
            }
            for (; j < 0; j++) {
                ((JavascriptExecutor) MainClass.driver).executeScript(("window.scrollBy(0," + j + ")"), "");
            }
        } catch (WebDriverException wde) {
        } catch (Exception e) {
        }


        js.executeScript("window.scrollBy(0,300)", "");
        //key chords strings
        //String clickln = Keys.chord(Keys.CONTROL,Keys.ENTER);
         //to click the button
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/a")).click();
        Thread.sleep(2000);




    }


}
