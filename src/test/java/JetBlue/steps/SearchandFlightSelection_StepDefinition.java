package JetBlue.steps;

import JetBlue.pages.FlightsSelectionPage;
import JetBlue.pages.SearchPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchandFlightSelection_StepDefinition {

    SearchPage searchPage = new SearchPage();
    FlightsSelectionPage flightsSelectionPage = new FlightsSelectionPage();

    @Given("^The user wants to navigate Jetblue$")
  public void the_user_wants_to_navigate_Jetblue()  {
     searchPage.navigateSearchPage();
      //searchPage.setCookies();
    }


    //@Given("^The user wants to handle the pop-up$")
    //public void the_user_wants_to_handle_the_pop_up()  {
    //    searchPage.setCookies();
    //}
    @When("^The user wants to choose from city as \"([^\"]*)\"$")
    public void the_user_wants_to_choose_from_city_as(String arg1)  {
     searchPage.setCity();
    }

    @Then("^The user wants to search flights$")
    public void the_user_wants_to_search_flights()  {
        searchPage.setSearchFlights();
     }

    @And("^The user should get an error message as “Please enter a valid city”$")
    public void the_user_should_get_an_error_message_as_Please_enter_a_valid_city()  {
     searchPage.setCityMessage();
    }





    @When("^The user wants to choose from city as \"([^\"]*)\" and To city as \"([^\"]*)\"$")
    public void the_user_wants_to_choose_from_city_as_and_To_city_as(String arg1, String arg2) {
    searchPage.setToCity();
    }

    @Then("^The user wants to enter Depart date as \"([^\"]*)\"$")
    public void the_user_wants_to_enter_Depart_date_as(String arg1) {
    searchPage.setDepartDate();
    }

    @Then("^The user should not enter the return date as \"([^\"]*)\"$")
    public void the_user_should_not_enter_the_return_date_as (String arg1){
    searchPage.setReturnDate();
    }

        }