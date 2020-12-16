package com.stepDefinitions;

import java.util.List;

import com.TaskPage.TaskPage;
import com.baseClasses.Library;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TaskSteps extends Library {
	TaskPage tpage;
	List<String> taskfromfeature;

	@Given("Launch the tak page")
	public void launch_the_tak_page() {
		tpage = new TaskPage(driver);
		tpage.launchTaskpage();
	}

	@When("To add a new task")
	public void to_add_a_new_task() {
		tpage.createNewTask();
	}

	@When("Enter new tak title and description")
	public void enter_new_tak_title_and_description(io.cucumber.datatable.DataTable dataTable) {
		taskfromfeature = dataTable.asList();
		tpage.newTitleandDescription(taskfromfeature.get(0), taskfromfeature.get(1));
	}

	@When("Enter completion and identifier")
	public void enter_completion_and_identifier(io.cucumber.datatable.DataTable dataTable) {
		taskfromfeature = dataTable.asList();
		tpage.completionAndidentifier(taskfromfeature.get(0), taskfromfeature.get(1));
	}

	@Then("the task page to be saved")
	public void the_task_page_to_be_saved() {
		tpage.saveTeask();
	}

}
