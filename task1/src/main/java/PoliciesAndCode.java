import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriverException;

public class PoliciesAndCode extends MainClass  {

    public void ploicies() throws InterruptedException {

        driver.findElement(By.xpath("//*[@id=\"link-effect-3\"]/ul/li[2]/a")).click();
        Thread.sleep(2000);

        MainClass.driver.findElement(By.xpath("//*[@id=\"link-effect-3\"]/ul/li[2]/ul/li[1]/a")).click();
        AboutUs ab= new AboutUs();
         ab.scroll();
         driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/ul/li[2]")).click();
         ab.scroll();


    }
}
