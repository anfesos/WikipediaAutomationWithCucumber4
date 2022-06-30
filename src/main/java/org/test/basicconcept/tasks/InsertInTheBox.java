package org.test.basicconcept.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.test.basicconcept.exceptions.InsertWordInSearchException;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.test.basicconcept.interactions.WaitUntil.THREE_THOUSAND;
import static org.test.basicconcept.userinterfaces.UseWikipediaPage.SEARCH_BOX;
import static org.test.basicconcept.userinterfaces.UseWikipediaPage.SEARCH_BUTTON;

public class InsertInTheBox implements Task {

    private String word;
    private String failInsertWord = "Fail to insert the information in the box Search";

    public InsertInTheBox(String word) {
        this.word = word;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try{
            actor.attemptsTo(WaitUntil.the(SEARCH_BOX,isVisible()));
            actor.attemptsTo(Enter.theValue(word).into(SEARCH_BOX));
            actor.attemptsTo(org.test.basicconcept.interactions.WaitUntil.theTime(THREE_THOUSAND));
            actor.attemptsTo(Click.on(SEARCH_BUTTON));
            actor.attemptsTo(org.test.basicconcept.interactions.WaitUntil.theTime(THREE_THOUSAND));

        }catch (Exception exception){

            throw new InsertWordInSearchException(failInsertWord,exception);
        }
    }

    public static InsertInTheBox theWord(String word){
        return new InsertInTheBox(word);
    }
}
