package NopcommerceBrowserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class InternetExplorerBrowserTest {

    public static void main(String[] args) {
        String baseurl = "https://demo.nopcommerce.com/\n";// url tobe checked in internet explorer browser
        System.setProperty("webdriver.ie.driver","drivers/IEDriverServer.exe");// driver key and driver path in setproperty functionality requirement
        WebDriver driver = new InternetExplorerDriver();// driver object in internet explorer driver class to operate different functionality of webpage
        driver.get(baseurl);// driver object used to get (access) given url
        driver.manage().window().maximize();//driver object used to maximise window from manage functionality
        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);// driver object used to manage timeout waiting period implicitly for webpage


        String pagesource = driver.getPageSource();// string pagesource assign to driverobject to get page source
        System.out.println(pagesource);

        String title = driver.getTitle();
        boolean verifytilte = title.equals("nop commerce demo store");// verify title in equals functionality  with boolean type
        boolean verifytitlecontain = title.contains("login");// verify title contain in contains functionality with boolean type
        System.out.println(title);
        System.out.println(verifytilte);
        System.out.println(verifytitlecontain);
        driver.close();      // object used to give close command to the webpage at the end after implicit wait time

    }


}
