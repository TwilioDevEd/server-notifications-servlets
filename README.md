<a href="https://www.twilio.com">
  <img src="https://static0.twilio.com/marketing/bundles/marketing/img/logos/wordmark-red.svg" alt="Twilio" width="250" />
</a>

# Server Notifications with Servlets

[![Java Servlet CI](https://github.com/TwilioDevEd/server-notifications-servlets/actions/workflows/maven.yml/badge.svg)](https://github.com/TwilioDevEd/server-notifications-servlets/actions/workflows/maven.yml)

Use Twilio to send SMS alerts so that you never miss a critical issue.

[Read the full tutorial here](https://www.twilio.com/docs/tutorials/walkthrough/server-notifications/java/servlets)!

### Local Development

1. First clone this repository and `cd` into it:

   ```bash
   git clone git@github.com:TwilioDevEd/server-notifications-servlets.git
   cd server-notifications-servlets
   ```

2. Export the environment variables:

   You can find the AccountSID and the AuthToken at https://www.twilio.com/user/account/settings.

   ```bash
   export TWILIO_ACCOUNT_SID=your account sid
   export TWILIO_AUTH_TOKEN=your auth token
   ```

   The Twilio Phone Number can be found at https://www.twilio.com/user/account/phone-numbers/incoming.

   ```bash
   export TWILIO_PHONE_NUMBER=your Twilio phone number
   ```

3. Make sure the tests succeed:

   ```bash
   mvn compile test
   ```

4. Run the application. The `--debug` flag is optional, it enables logging of requests, 
   responses and other application events.

   ```bash
   mvn compile && mvn jetty:run --debug
   ```

5. Check it out at [http://localhost:8080](http://localhost:8080)


## Meta

* No warranty expressed or implied. Software is as is. Diggity.
* [MIT License](http://www.opensource.org/licenses/mit-license.html)
* Lovingly crafted by Twilio Developer Education.
