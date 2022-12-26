package Util;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


public class DriverFactory {
    static WebDriver driver;
    static Properties properties;

    public static WebDriver initialize_Driver( String browser){
        properties= ConfigReader.getProperties();
        if (browser.equals("Chorome")){
            WebDriverManager.chromedriver().setup();
            driver= new ChromeDriver();
        }
        String url = properties.getProperty("url");
        int pageWait = Integer.parseInt(properties.getProperty("pageLoadTimeout"));
        int impWait = Integer.parseInt(properties.getProperty("imlicityWait"));
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(pageWait, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(impWait,TimeUnit.SECONDS);
         return getDriver();
    }
public  static WebDriver getDriver(){
        return driver;

}
}
