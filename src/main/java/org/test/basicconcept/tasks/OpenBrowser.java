package org.test.basicconcept.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import org.test.basicconcept.exceptions.OpenBrowserException;
import org.test.basicconcept.interactions.WaitUntil;
import org.test.basicconcept.userinterfaces.UseWikipediaPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.test.basicconcept.interactions.WaitUntil.THREE_THOUSAND;

public class OpenBrowser implements Task {

    UseWikipediaPage page;
    String exceptionBrowser = "Error open the page Wikipedia";

    @Override
    public <T extends Actor> void performAs(T actor) {

        try{
            actor.attemptsTo(Open.browserOn(page));
            actor.attemptsTo(WaitUntil.theTime(THREE_THOUSAND));
        }catch (Exception exceptionOpenBrowser){
            throw new OpenBrowserException(exceptionBrowser, exceptionOpenBrowser);
        }

    }

    public static OpenBrowser on(){
        return instrumented(OpenBrowser.class);
    }
}
