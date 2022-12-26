package Util;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class Hooks {
    WebDriver driver;
    Properties properties;

    @Before
    public void before() {
        String browser = driver.getCurrentUrl(browser);
        properties = ConfigReader.initialize_Properties();
        driver = DriverFactory.initialize_Driver(browser);
    }
    @After
    public void after(){
        driver.quit();
    }
}