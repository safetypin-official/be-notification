package com.safetypin.notification;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class NotificationApplicationTest {

    @Test
    void testMainDoesNotThrowException() {
        // Calling the main method should load the context without throwing an exception.
        assertDoesNotThrow(() -> AuthenticationApplication.main(new String[]{}));
    }
}
