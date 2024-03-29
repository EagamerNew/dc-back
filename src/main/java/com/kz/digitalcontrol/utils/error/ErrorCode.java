package com.kz.digitalcontrol.utils.error;

public class ErrorCode {

    // HashMap params;
    public enum ErrorCodes {
        SYSTEM_ERROR,
        AUTH_ERROR,
        PASSWORDS_NOT_MATCH,
        USER_NOT_FOUND,
        EMPTY_CREDENTIALS,
        NOT_AUTHENTICATED,
        INVALID_EMAIL_FORMAT,
        ACCESS_DENIED,
        SCREENING_NOT_FOUND
    }

    public static String toString(ErrorCodes errorRef) {
        return errorRef.toString();
    }
}
