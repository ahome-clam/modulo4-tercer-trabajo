package testUI;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.junit4.DisplayName;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pages.*;
import session.Session;

public class LoginTodoistTest {

    SignUpPage signUpPage = new SignUpPage();
    MainPage mainPage = new MainPage();
    AlmostTherePage almostTherePage = new AlmostTherePage();
    LoginPage loginPage = new LoginPage();
    ToDoPage toDoPage = new ToDoPage();

    @Before
    public void before(){
        Session.getInstance().getDriver().get("https://todoist.com/");
    }

    @DisplayName("Verify the Signup and Login using an email and password")
    @Description("This test case is to verify The Login Using Email And Password")
    @Owner("Cecilia Alvarado")
    @Test
    public void verifyTheSignUpUsingEmailAndPassword() throws InterruptedException {
        mainPage.singUpButton.click();

        signUpPage.emailTextBox.type("prueba-modulo4@ucb.com");
        signUpPage.signupButton.click();

        almostTherePage.fullNameTextBox.type("Nombre Completo");
        almostTherePage.passwordTextBox.type("123456789");
        almostTherePage.signupNowButton.click();

        // Verification
        Thread.sleep(4000);
        Assert.assertFalse("ERROR , no se pudo realizar el login!", almostTherePage.signupNowButton.isDisplayedOnPage());
    }

    @DisplayName("Verify the Signup and Login using an email and password")
    @Description("This test case is to verify The Login Using Email And Password")
    @Owner("Cecilia Alvarado")
    @Test
    public void verifyTheLoginUsingEmailAndPassword() throws InterruptedException {
        mainPage.loginButton.click();

        loginPage.emailTextBox.type("prueba-modulo4@ucb.com");
        loginPage.passwordTextBox.type("123456789");
        loginPage.loginButton.click();

        // Verification
        Thread.sleep(4000);
        Assert.assertTrue("ERROR , no se pudo realizar el login!", toDoPage.todayLabel.isDisplayedOnPage());
    }

    @After
    public void after(){
       Session.getInstance().closeBrowser();
    }

}
