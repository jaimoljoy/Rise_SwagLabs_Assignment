package Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductElements
{
    WebDriver driver;

    public ProductElements(WebDriver driver)
    {
        PageFactory.initElements(driver,this);

    }

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    private WebElement sauce_labs_backpack;
    @FindBy(id ="add-to-cart-sauce-labs-bike-light" )
    private  WebElement sauce_labs_bike_light;
    @FindBy(id = "add-to-cart-sauce-labs-fleece-jacket")
    private  WebElement sauce_labs_fleece_jacket;
    @FindBy(className = "shopping_cart_link")
    private  WebElement Cart;
    public WebElement Add_backpack()
    {

        return sauce_labs_backpack;
    }
    public WebElement Add_bike_light()
    {


        return sauce_labs_bike_light;

    }
    public WebElement Add_fleece_jacket()
    {

        return sauce_labs_fleece_jacket;
    }
    public WebElement Cart_Button()
    {

        return Cart;
    }
}
