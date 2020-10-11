package testUI;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pages.LoginModalPage;
import pages.MainPage;
import session.Session;

public class LoginTodoistTest {

    LoginModalPage loginModalPage = new LoginModalPage();
    MainPage mainPage = new MainPage();

    @Before
    public void before(){
        Session.getInstance().getDriver().get("https://todoist.com/");
    }


    @DisplayName("Verify the LOGIN test using OWASP")
    @Description("This test case VERIFY")
    @Owner("Mariel")
    @Test
    public void verifyTheLoginUsingUserAndPassword() throws InterruptedException {
        mainPage.singUpFreeButton.click();
        loginModalPage.emailTextBox.type("Ejemplo@gmail.com");
        loginModalPage.passwordTextBox.type("Prueba123");
        loginModalPage.signupButton.click();
        // Verification
        Thread.sleep(500);Assert.assertEquals("ERROR, no se pudo realiza el login!",false,loginModalPage.verifyText.isDisplayOnePage());

    }

    @After
    public void after(){
       Session.getInstance().closeBrowser();
    }

}
