import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class AboutUs extends MainClass{

        public void AboutUSAS() throws InterruptedException {

        //open navigator about us
        MainClass.driver.findElement(By.linkText("About Us")).click();
        Thread.sleep(2000);
        //open
                MainClass.driver.findElement(By.xpath("//a[@href='/about/advisors-and-patrons/']")).click();
            JavascriptExecutor js = (JavascriptExecutor) MainClass.driver;
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
            driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/ul/li[1]/a")).click();

}
           public void scroll(){
               JavascriptExecutor js = (JavascriptExecutor) MainClass.driver;
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
    }

    }




