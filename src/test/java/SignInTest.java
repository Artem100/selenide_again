import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.SignIn;
import setup.UiSetup;

import static com.codeborne.selenide.Selenide.open;

public class SignInTest {

    public static MainPage main;
    public static SignIn signIn;

    @BeforeTest
    public void setup(){
//        UiSetup.prepareUI();
        main = new MainPage();
//        signIn = new SignIn(UiSetup.driver);
    }

//    @Test
//    public void test_01(){
//        UiSetup.openURL("http://automationpractice.com/index.php1");
//        main.assertMainPage();
//        main.SignInButtonClick();
//        signIn.assertSingInPage();
//    }
//
//    @AfterTest
//    public void end(){
//        UiSetup.closeDriver();
//    }

    @Test
    public void google_open(){
        open("https://www.google.com.ua/");
        main.SignInButtonClick();

    }
}
