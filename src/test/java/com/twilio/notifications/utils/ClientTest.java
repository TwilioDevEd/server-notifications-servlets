package com.twilio.notifications.utils;

import org.junit.Test;

import static org.mockito.Mockito.*;

public class ClientTest {
    @Test
    public void sendMessage() {
        // Given
        Credentials credentials = mock(Credentials.class);
        TwilioMessageCreator messageCreator = mock(TwilioMessageCreator.class);

        when(credentials.getPhoneNumber()).thenReturn("twilio-number");

        // When
        Client client = new Client(credentials, messageCreator);
        client.sendMessage("to", "message", "media-url");

        // Then
        verify(messageCreator, times(1)).create("to", "twilio-number", "message", "media-url");
    }
}

