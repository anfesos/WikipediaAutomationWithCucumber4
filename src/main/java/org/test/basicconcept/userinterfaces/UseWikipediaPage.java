package org.test.basicconcept.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://es.wikipedia.org/wiki/Wikipedia:Portada")
public class UseWikipediaPage extends PageObject {

    public static Target SEARCH_BOX = Target.the("search box").located(By.xpath("//*[@id='searchInput']"));
    public static Target SEARCH_BUTTON = Target.the("search button").located(By.xpath("//*[@id='searchButton']"));
    public static Target HEADING = Target.the("Heading for the result").located(By.xpath("//*[@id='firstHeading']"));
}
