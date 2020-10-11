package pages;

import control.Button;
import control.CheckBox;
import control.TextBox;
import org.openqa.selenium.By;

public class AlmostTherePage {
    public TextBox fullNameTextBox= new TextBox(By.id("full_name"),"[yourName] textbox on Sign Up Page");
    public TextBox passwordTextBox= new TextBox(By.id("pwd"),"[password] textbox on Sign Up Page");
    public Button signupNowButton= new Button(By.id("step_two_submit"),"[signupNow] button on Sign Up Page");

    public AlmostTherePage(){}
}
