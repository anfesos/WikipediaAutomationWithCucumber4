package org.test.basicconcept.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static org.test.basicconcept.userinterfaces.UseWikipediaPage.HEADING;

public class OnTheResult implements Question<Boolean> {

    private String wordExpected;

    public OnTheResult(String wordExpected) {
        this.wordExpected = wordExpected;
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        String result = HEADING.resolveAllFor(actor).textContents().get(0);

        return wordExpected.equals(result);
    }

    public static OnTheResult theWordExpectedIs(String wordExpected){
        return new OnTheResult(wordExpected);
    }
}
