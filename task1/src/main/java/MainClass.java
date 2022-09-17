import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainClass {
    public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rao Asad Iftikhar\\Downloads\\New folder\\chromedriver.exe");
      driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.thesparksfoundationsingapore.org/");// hitting url to browser

        //test case for link page
        linkPage link= new linkPage();
        link.LinkPage();

        //test case for about us
        AboutUs ab = new AboutUs();
        ab.AboutUSAS();

        //test case for polocies and codes navigator
        PoliciesAndCode pol = new PoliciesAndCode();
        pol.ploicies();

        //test case for program navigator
        Programs pro= new Programs();
        pro.program();

        //test case for link navigator
        Links l= new Links();
        l.link();

        //test case for contact us navigator
        ContactUs con = new ContactUs();
        con.contact();
    }
}
