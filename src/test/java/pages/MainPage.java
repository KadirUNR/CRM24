package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MainPage {
    public MainPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath="//*[@id='bx_left_menu_menu_tasks']/a/span[1]")
    public WebElement tasksButton;

    @FindBy (id="tasks-buttonAdd")
    public WebElement newTaskButton;

    @FindBy (id="tasks-task-priority-cb")
    public  WebElement highPriorityCheckbox;

}