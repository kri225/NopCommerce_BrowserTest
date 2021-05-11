package NopcommerceBrowserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class MultipleBrowserTest {
    static String browser=  "Internetexplorer";// multiple browser given to check access of given url
    static String baseurl1= "https://demo.nopcommerce.com/";// url to be checked in given browser
    static WebDriver driver;// object name for different webdriver class
    
    public static void main(String[] args) {

        if (browser.equalsIgnoreCase("Chrome")){// if given browser is chrome open url in the same browser
            System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");// as driver key and path
            driver = new ChromeDriver();// object initialised by Chormedriver class
            driver.close();// close command given to close the page
        }else if (browser.equalsIgnoreCase("Firefox")) {
            System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
            driver = new FirefoxDriver();
            driver.close();
        }else if (browser.equalsIgnoreCase("Internetexplorer")) {
            System.setProperty("webdriver.ie.driver","drivers/IEDriverServer.exe");
            driver = new InternetExplorerDriver();
            driver.close();
        }else{
            System.out.println("Wrong Browser name");// if given browser name is not mathes with given opetion than send this message
        }
        driver.get(baseurl1);
        driver.manage().window().maximize();// objet used to manage window maximize
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);// timeout managed by object
        driver.close();// close command

    }


}
