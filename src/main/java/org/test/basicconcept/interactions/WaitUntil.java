package org.test.basicconcept.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.waits.Wait;
import org.test.basicconcept.exceptions.ThreadException;

public class WaitUntil implements Interaction {

    private int time;
    private String errorOnThread = "Error executing Wait Until Class";
    public static int THREE_THOUSAND = 3000;

    public WaitUntil(int time) {
        this.time = time;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try{
            Thread.sleep(time);
        }catch (Exception threatException){
            throw new ThreadException(errorOnThread, threatException);
        }
    }

    public static WaitUntil theTime(int time){
        return new WaitUntil(time);
    }
}
