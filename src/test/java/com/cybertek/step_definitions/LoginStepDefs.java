package com.cybertek.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs {


    @Given("librarian is on the login page")
    public void librarian_is_on_the_login_page() {
        System.out.println("Librarian is on the login page");

    }


    //Some other steps were also undefined:

    @When("librarian is enter valid username and password")
    public void librarian_is_enter_valid_username_and_password() {
        System.out.println("Librarian entered valid credentials");

    }
    @Then("librarian login with correct credentials")
    public void librarian_login_with_correct_credentials() {
        System.out.println("librarian  login with correct credentials");
    }
    @Then("librarian should see title is dashboard")
    public void librarian_should_see_title_is_dashboard() {
        System.out.println("Librarian sees the dashboard");
    }



    @Given("student is on the login page")
    public void student_is_on_the_login_page() {
        System.out.println("Student is on the login page");

    }


    //Some other steps were also undefined:

    @When("Student is enter valid username and password")
    public void student_is_enter_valid_username_and_password() {
        System.out.println("Student entered valid credentials");

    }
    @Then("student login with correct credentials")
    public void student_login_with_correct_credentials() {
        System.out.println("student  login with correct credentials");


    }
    @Then("student should see title is dashboard")
    public void student_should_see_title_is_dashboard() {
        System.out.println("Student sees the dashboard");
    }




    @Given("admin is on the login page")
    public void admin_is_on_the_login_page() {
        System.out.println("Admin is on the login page");

    }


    //Some other steps were also undefined:

    @When("Admin is enter valid username and password")
    public void admin_is_enter_valid_username_and_password() {
        System.out.println("Admin entered valid credentials");

    }
    @Then("admin login with correct credentials")
    public void admin_login_with_correct_credentials() {
        System.out.println("admin  login with correct credentials");

    }
    @Then("admin should see title is dashboard")
    public void admin_should_see_title_is_dashboard() {
        System.out.println("Admin sees the dashboard");

    }
}
