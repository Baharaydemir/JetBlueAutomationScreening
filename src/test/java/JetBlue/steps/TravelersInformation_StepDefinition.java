package JetBlue.steps;

import JetBlue.pages.TravelersInformationPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TravelersInformation_StepDefinition {

    TravelersInformationPage travelersInformationPage = new TravelersInformationPage();


    @When("^The user wants to enter Depart date as \"([^\"]*)\" and enter return date as \"([^\"]*)\"$")
    public void the_user_wants_to_enter_Depart_date_as_and_enter_return_date_as(String arg1, String arg2)  {

    }

    @Then("^The user wants to verify flights selection page$")
    public void the_user_wants_to_verify_flights_selection_page()  {

    }

    @Then("^The user wants to choose the LOWEST fare for Departing flights$")
    public void the_user_wants_to_choose_the_LOWEST_fare_for_Departing_flights()  {

    }

    @Then("^The user wants to choose the LOWEST fare for Returning flights$")
    public void the_user_wants_to_choose_the_LOWEST_fare_for_Returning_flights()  {

    }

    @Then("^The user wants to continue$")
    public void the_user_wants_to_continue()  {

    }

    @Then("^The user wants to verify travelers’ information page$")
    public void the_user_wants_to_verify_travelers_information_page()  {

    }

    @Then("^The user wants to quit session$")
    public void the_user_wants_to_quit_session()  {

    }

}
