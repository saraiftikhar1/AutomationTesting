import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

public class Links extends MainClass {

    public void link() {

        driver.findElement(By.xpath("//*[@id=\"link-effect-3\"]/ul/li[4]/a")).click();
        AboutUs ab = new AboutUs();
        driver.findElement(By.xpath("//*[@id=\"link-effect-3\"]/ul/li[4]/ul/li[1]/a")).click();
        ab.scroll();

    }
}