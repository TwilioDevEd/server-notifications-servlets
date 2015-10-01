package com.twilio.notifications.utils;

import com.twilio.exception.TwilioException;
import com.twilio.http.TwilioRestClient;

public class Client {
    private Credentials credentials;
    private TwilioMessageCreator messageCreator;

    public Client() {
        this.credentials = new Credentials();
        TwilioRestClient client = new TwilioRestClient.Builder(
                credentials.getAccountSid(), credentials.getAuthToken()).build();
        this.messageCreator = new TwilioMessageCreator(client);
    }

    public Client(Credentials credentials, TwilioMessageCreator messageCreator) {
        this.credentials = credentials;
        this.messageCreator = messageCreator;
    }

    public void sendMessage(String to, String message, String mediaUrl) {
        try {
            this.messageCreator.create(to, this.credentials.getPhoneNumber(), message, mediaUrl);
        } catch (TwilioException exception) {
            exception.printStackTrace();
        }
    }
}