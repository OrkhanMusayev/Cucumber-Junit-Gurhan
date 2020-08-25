package com.cybertek.step_definitions;

import io.cucumber.java.en.Then;

import java.util.List;

public class DataTableStepDefinitions {

    @Then("User should see nelow words displayed")
    public void user_should_see_nelow_words_displayed(List<String> fruitList) {

        // print out the size of the list
        System.out.println("fruitList = " + fruitList.size()); // fruitList + . + soutv

        System.out.println("fruitList = " + fruitList);

    }
}