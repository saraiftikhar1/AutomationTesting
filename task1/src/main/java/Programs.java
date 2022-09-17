import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Programs extends MainClass{

    public void program() throws InterruptedException {

        driver.findElement(By.xpath("//*[@id=\"link-effect-3\"]/ul/li[3]/a")).click();

        Thread.sleep(2000);
        MainClass.driver.findElement(By.xpath("//*[@id=\"link-effect-3\"]/ul/li[3]/ul/li[1]/a")).click();
        AboutUs ab= new AboutUs();
        ab.scroll();
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/ul/li[4]/a")).click();
        ab.scroll();
        String clickln = Keys.chord(Keys.CONTROL,Keys.ENTER);
        driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[1]/div/div/div/div[1]/div/a")).sendKeys(clickln);
        driver.navigate().back();

    }
}
