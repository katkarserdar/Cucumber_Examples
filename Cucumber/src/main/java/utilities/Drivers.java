package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Drivers {

    private static WebDriver driver;

    public static WebDriver getDriver(){
        if(driver == null){
            System.setProperty("webdriver.chrome.driver","C:/Users/serda/Selenium/ChromeDriver/chromedriver.exe");
            driver = new ChromeDriver();
        }
        return driver;

    }

    public static void closeDrivers(){

        if(driver != null){
            driver.quit();
            driver=null;

        }

    }


}
