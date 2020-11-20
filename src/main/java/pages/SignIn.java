package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SignIn {
    public WebDriver driver;

    public SignIn(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

//    public void assertSingInPage(){
//        Assert.assertTrue(driver.getTitle().contains("Login - My Store"));
//    }


}
