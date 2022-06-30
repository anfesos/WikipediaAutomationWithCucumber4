package org.test.basicconcept.exceptions;

import net.serenitybdd.core.exceptions.SerenityManagedException;

public class OpenBrowserException extends SerenityManagedException {

    public OpenBrowserException(String message, Throwable testErrorException) {
        super(message, testErrorException);
    }
}
