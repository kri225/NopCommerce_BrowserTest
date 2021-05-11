package NopcommerceBrowserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class FirefoxBrowserTest {

    public static void main(String[] args) {
        String baseurl = "https://demo.nopcommerce.com/\n";// url tobe checked in firefox browser
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");// driver key and driverpath
        WebDriver driver = new FirefoxDriver();// driver object in firefox driver class to operate different functionality of webpage
        driver.manage().window().maximize();//driver object used to maximise window from manage functionality
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);// driver object used to manage timeout waiting period implicitly for webpage
        driver.get(baseurl);// driver object used to get (access) given url

        String pagesource = driver.getPageSource();// string pagesource assign to driverobject to get page source
        System.out.println(pagesource);// print statment


        String title = driver.getTitle();//String title assigned to driverobject to get title
        boolean verfytitle = title.equals("nop Commerce demo store");// verify title in equals functionality  with boolean type
        boolean verifytitlecontain = title.contains("login");// verify title contain in contains functionality with boolean type
        System.out.println(title);
        System.out.println(verfytitle);
        System.out.println(verifytitlecontain);

        driver.close();// object used to give close command to the webpage at the end after implicit wait time

}



}
