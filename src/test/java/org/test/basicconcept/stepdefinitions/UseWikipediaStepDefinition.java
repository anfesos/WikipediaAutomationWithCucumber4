package org.test.basicconcept.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.test.basicconcept.modules.SearchToDo;
import org.test.basicconcept.questions.OnTheResult;
import org.test.basicconcept.tasks.InsertInTheBox;
import org.test.basicconcept.tasks.OpenBrowser;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class UseWikipediaStepDefinition {

    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("User");
    }

    @Given("the user open the wikipedia")
    public void theUserOpenTheWikipedia() {
        theActorInTheSpotlight().wasAbleTo(OpenBrowser.on());
    }

    @When("it is enter a word in the finder")
    public void itIsEnterAWordInTheFinder(List<SearchToDo> word) {
        theActorInTheSpotlight().attemptsTo(InsertInTheBox.theWord(word.get(0).getWord()));
    }

    @Then("can see the word in the heading")
    public void canSeeTheWordInTheHeading(List<SearchToDo> word) {
        theActorInTheSpotlight().should(seeThat(OnTheResult.theWordExpectedIs(word.get(0).getResultWord())));
    }

}
