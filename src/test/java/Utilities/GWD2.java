package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GWD2 {
    private static WebDriver driver;
    public static WebDriver getDriver()
    {


        if (driver == null) {

            driver = new EdgeDriver();
            driver.manage().window().maximize();
        }

        return driver;
    }
}
