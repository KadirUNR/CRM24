package step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import pages.LoginPage;
import pages.MainPage;
import utilities.ConfigurationReader;
import utilities.Driver;

import java.util.NoSuchElementException;
import java.util.UUID;

public class AssignTask_step_definitions {
    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();

    String TaskName;
    String TaskCount;

    @When("user goes to login page")
    public void user_goes_to_login_page() {

        String url= ConfigurationReader.getProperty("env");
        Driver.getDriver().get(url);

    }
    @When("user enters valid credentials")
    public void user_enters_valid_credentials() {
        loginPage.emailInput.sendKeys("hr1@cybertekschool.com");
        loginPage.passwordInput.sendKeys("UserUser");

    }
    @When("user click to login button")
    public void user_click_to_login_button() {
        loginPage.loginButton.click();

    }
    @When("user should go to main page")
    public void user_should_go_to_main_page() {
     String Url = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals("https://qa.crmly.net/stream/?login=yes",Url);

    }
    @When("user clicks on the tasks button")
    public void user_clicks_on_the_tasks_button() {

        mainPage.tasksButton.click();
    }
    @Then("user clicks on the New Task button on the tasks page top on the right side")
    public void user_clicks_on_the_new_task_button_on_the_tasks_page_top_on_the_right_side() {
        mainPage.newTaskButton.click();
        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("//iframe[@class='side-panel-iframe']")));


    }
    @When("user clicks the High priority Checkbox in the top right of the New Task page")
    public void user_clicks_the_high_priority_checkbox_in_the_top_right_of_the_new_task_page() {
    mainPage.highPriorityCheckbox.click();


    }
    @When("user types description into Things to do input")
    public void user_types_description_into_things_to_do_input() {
        TaskName=UUID.randomUUID().toString();
        mainPage.inputBox.sendKeys(TaskName);
    }
    @And("user clicks the Add Task button")
    public void user_clicks_the_add_task_button() {
        mainPage.addTaskButton.click();

    }

    @Then("orange Flame sign appears next to task name")
    public void orange_Flame_sign_appears_next_to_task_name(){
        Driver.getDriver().switchTo().parentFrame();

        // Verify the related high priority flame sign is displayed

        Assert.assertTrue(mainPage.highPriorityFlame(TaskName).isDisplayed());

        //Assert.assertTrue(mainPage.flameSign.isDisplayed());
    }


    @When("user clicks in the Add more button in the input box of Responsible person")
    public void user_clicks_in_the_add_more_button_in_the_input_box_of_responsible_person() {
        mainPage.addMoreButton.click();
    }
    @When("user selects more than one person from the list")
    public void user_selects_more_than_one_person_from_the_list() {
       mainPage.firstPerson.click();


    }
    @When("user goes to the main page")
    public void user_goes_to_the_main_page() {
        Driver.getDriver().switchTo().parentFrame();
        try {
            mainPage.closeNewTask.click();
        } catch (ElementNotInteractableException e){
            mainPage.homePageLogo.click();
        }
        mainPage.homePageLogo.click();

    }
    @When("user save the count of the tasks under the My Tasks table")
    public void user_save_the_count_of_the_tasks_under_the_my_tasks_table() {
        TaskCount=mainPage.counter.getText();
        System.out.println("TaskCount = " + TaskCount);


    }


    @Then("get the new number of tasks under the My Tasks table and verify it is different than the saved number")
    public void get_the_new_number_of_tasks_under_the_my_tasks_table_and_verify_it_is_different_than_the_saved_number() {
         String lastCount =mainPage.counter.getText();
        System.out.println("lastCount = " + lastCount);
         Assert.assertNotEquals(TaskCount,lastCount);
    }


    @When("user clicks on the Checklist button and user should see opens a field  with the title Checklist")
    public void user_clicks_on_the_checklist_button_and_user_should_see_opens_a_field_with_the_title_checklist() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user types something to do into input box")
    public void user_types_something_to_do_into_input_box() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user clicks the add button and a numbered check list should be displayed")
    public void user_clicks_the_add_button_and_a_numbered_check_list_should_be_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("user clicks in the input box next to the Deadline title")
    public void user_clicks_in_the_input_box_next_to_the_deadline_title() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user selects a day from the Calendar")
    public void user_selects_a_day_from_the_calendar() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user clicks the select button")
    public void user_clicks_the_select_button() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("user clicks the Add Task button and the selected date appears in the deadline column")
    public void user_clicks_the_add_task_button_and_the_selected_date_appears_in_the_deadline_column() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @When("user selects a day from the Calendar of Start task on menu")
    public void user_selects_a_day_from_the_calendar_of_start_task_on_menu() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("user selects a day from the Calendar of Finish menu")
    public void user_selects_a_day_from_the_calendar_of_finish_menu() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @Then("user clicks on the created task name on the task list and time information of related tasks should be displayed")
    public void user_clicks_on_the_created_task_name_on_the_task_list_and_time_information_of_related_tasks_should_be_displayed() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }



}
