package pages;

import control.Label;
import org.openqa.selenium.By;

public class ToDoPage {

    public Label todayLabel = new Label(By.xpath("//*[@id=\"agenda_view\"]/header/div/h1/span"),"[today] Label on ToDo Page ");

    public ToDoPage(){}

}
