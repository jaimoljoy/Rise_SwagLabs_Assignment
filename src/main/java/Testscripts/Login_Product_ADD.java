package Testscripts;

import Base.browser;
import Elements.LoginElements;
import Elements.ProductElements;
import org.openqa.selenium.By;
import Excel.Rise_SwagLabs_DataProvider;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Login_Product_ADD extends browser
{
    @Test(dataProvider = "User_Login", dataProviderClass = Rise_SwagLabs_DataProvider.class, priority = 1)
    public void validLogin_Product_ADD(String[] params) throws InterruptedException
    {
        String username = params[0];
        String passwrd = params[1];
        try
        {

            LoginElements loginObj = new LoginElements(driver);
            jse.executeScript("arguments[0].scrollIntoView();", loginObj.setUser());
            loginObj.setUser().sendKeys(username);
            Reporter.log("Username Entered", true);
            loginObj.setpswrd().sendKeys(passwrd);
            Reporter.log("Password Entered", true);
            jse.executeScript("arguments[0].click();", loginObj.login());
            Reporter.log("Loggedin sucessfully", true);
        }
        catch (org.openqa.selenium.NoSuchElementException e)
        {
            System.out.println("Cannot login to the system");
        }
        try
        {
            ProductElements ProductObj = new ProductElements(driver);
            jse.executeScript("arguments[0].click();", ProductObj.Add_backpack());
            Reporter.log("1st Product Added", true);
            jse.executeScript("arguments[0].click();", ProductObj.Add_bike_light());
            Reporter.log("2nd Product Added", true);
            jse.executeScript("arguments[0].click();", ProductObj.Add_fleece_jacket());
            Reporter.log("3rd Product Added", true);
            jse.executeScript("arguments[0].click();", ProductObj.Cart_Button());
            Reporter.log("Cart button clicked", true);
        }
        catch (org.openqa.selenium.NoSuchElementException e)
        {
            System.out.println("Products cannot add to the system");
        }
    }
}
