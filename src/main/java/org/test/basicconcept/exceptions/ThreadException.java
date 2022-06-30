package org.test.basicconcept.exceptions;

import net.serenitybdd.core.exceptions.SerenityManagedException;

public class ThreadException extends SerenityManagedException {

    public ThreadException(String message, Throwable testErrorException) {
        super(message, testErrorException);
    }
}
