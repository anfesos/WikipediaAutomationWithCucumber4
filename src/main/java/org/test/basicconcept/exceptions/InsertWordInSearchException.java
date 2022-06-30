package org.test.basicconcept.exceptions;

import net.serenitybdd.core.exceptions.SerenityManagedException;

public class InsertWordInSearchException extends SerenityManagedException {

    public InsertWordInSearchException(String failInsertWord, Exception exception) {
        super(failInsertWord,exception);
    }
}
