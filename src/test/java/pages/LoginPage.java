package pages;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;


public class LoginPage {
    public TextBox emailTextBox = new TextBox(By.id("email"),"[email] textbox on Login Page");
    public TextBox passwordTextBox = new TextBox(By.id("password"),"[password] textbox on Login Page");
    public Button loginButton = new Button (By.xpath("//*[@id=\"login_form\"]/button"),"[login] Button on Login Page");

    public LoginPage(){}


}
