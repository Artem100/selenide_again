package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class MainPage {
//    public WebDriver driver;
//
//    public MainPage(WebDriver driver){
//        PageFactory.initElements(driver, this);
//        this.driver = driver;
//    }

    //    public void assertMainPage(){
//        Assert.assertTrue(driver.getTitle().contains("My Store"));
//    }

//    @FindBy(how = How.CSS, using = "a.login")
//    private SelenideElement buttonSignIn;
//
//    public MainPage signInButtonClick(){
//        buttonSignIn.click();
//        return page(MainPage.class);
//    }

//    @FindBy(how = How.NAME, using = "q")
//    private SelenideElement searchBox;
//
//    public MainPage search(String query) {
//        searchBox.setValue(query).pressEnter();
//        return page(MainPage.class);
//    }
    private final By buttonSignIn = By.cssSelector("a.login");

    public void SignInButtonClick(){
        $(buttonSignIn).click();
    }

}
