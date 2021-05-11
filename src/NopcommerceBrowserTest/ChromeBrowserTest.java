package NopcommerceBrowserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ChromeBrowserTest {

    public static void main(String[] args) {
        String baseurl = "https://demo.nopcommerce.com/\n";// url tobe checked in chrome browser
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");// key ,(driverpath) value as required in setproperty
        WebDriver driver = new ChromeDriver();// driver object in ChromeDriver class to operate different functionality of webpage
        driver.manage().window().maximize();//driver object used to maximise window from manage functionality
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);// driver object used to manage timeout waiting period implicity for  webpage
        driver.get(baseurl);// driver object used to get (access) given url

        String pagesource = driver.getPageSource();// string pagesource assign to driverobject to get page source
        System.out.println(pagesource);// print statment

        String title = driver.getTitle();// String title initalised by driver to gettitle name
        boolean verifytitle = title.equals("nope commerce demo store");// boolean type verifytitle initialised by title equals functionaltiy
        boolean verifytitlecontain= title.contains("login");
        System.out.println(title);
        System.out.println(verifytitle);
        System.out.println(verifytitlecontain);

        driver.close();// what is the difference between driver.close and driver.quit
        //driver.quit();// both are used to closed webpage at the end

    }

}
