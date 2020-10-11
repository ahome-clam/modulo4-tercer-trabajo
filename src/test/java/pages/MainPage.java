package pages;

import control.Button;
import org.openqa.selenium.By;

public class MainPage {
    public Button singUpButton = new Button(By.xpath("//ul/li[2]/a[@href='/users/showregister']"),"[singUp] Button on Main Page");
    public Button loginButton = new Button(By.xpath("//ul/li[1]/a[@href='/users/showlogin']"),"[login] Button on Main Page");

    public MainPage(){}
}
