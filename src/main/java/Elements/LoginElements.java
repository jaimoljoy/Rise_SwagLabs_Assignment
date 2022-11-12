package Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginElements {
    WebDriver driver;

    public LoginElements(WebDriver driver)
    {
        PageFactory.initElements(driver,this);

    }

    @FindBy(id = "user-name")
    private WebElement user_name;
    @FindBy(name ="password" )
    private  WebElement password;
    @FindBy(id = "login-button")
    private  WebElement login;

    public WebElement setUser()
    {

        return user_name;
    }
    public WebElement setpswrd()
    {


        return password;

    }
    public WebElement login()
    {

        return login;
    }


}

