package org.test.basicconcept.stepdefinitions;

import io.cucumber.java.DataTableType;
import org.test.basicconcept.modules.SearchToDo;

import java.util.Map;

public class ConfigurationDataTable {

    @DataTableType
    public SearchToDo searchToDo(Map<String, String> map) {
        return new SearchToDo(
                map.get("word"),
                map.get("resultWord")
        );
    }
}
