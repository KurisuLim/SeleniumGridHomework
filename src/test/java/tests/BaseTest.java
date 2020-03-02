package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

public class BaseTest {
    public WebDriver driver;

    @BeforeClass
    //Will be added on the other branch
//    @Parameters({"browser", "url"})
//    public void setup(String browser, String url){
//
//        if(browser.equalsIgnoreCase("chrome")){
//            System.setProperty("webdriver.chrome.driver", "chromedriver");
//            System.setProperty("webdriver.chrome.silentOutput", "true");
//            java.util.logging.Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
//            driver = new ChromeDriver();
//            driver.manage().window().fullscreen();
//            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        }else if(browser.equalsIgnoreCase("firefox")){
//            System.setProperty("webdriver.gecko.driver", "geckodriver");
//            System.setProperty("webdriver.gecko.silentOutput", "true");
//            java.util.logging.Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
//            driver = new FirefoxDriver();
//            driver.manage().window().fullscreen();
//            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        }
//        driver.get(url);
//    }

    @AfterClass
    public void teardown(){
        driver.quit();
    }
}
