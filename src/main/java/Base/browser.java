package Base;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class browser
{
        public WebDriver driver;
        public String url ="https://www.saucedemo.com/";
        public JavascriptExecutor jse;
        @BeforeClass
        public void Rise_Swag()
        {
            System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get(url);
            driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
            jse = (JavascriptExecutor) driver;
        }



}
