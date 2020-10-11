package pages;

import control.Button;
import control.CheckBox;
import control.TextBox;
import org.openqa.selenium.By;

public class SignUpPage {

    public TextBox emailTextBox = new TextBox(By.id("email"),"[email] textbox on Signup Page");
    public Button signupButton = new Button(By.id("step_one_submit"),"[sign up with Email] button on Login Modal Page");

    public SignUpPage(){}

}

