# emailcrawler
An application which can read your mailbox and extract emails according to your query and categorize and label them as well.

## Introduction 
To create this application we will be using Gmail API provided by Google. 

**To use Gmail API we need the following things**

1. You need to create a client application for Gmail API. This can be done by setting up a project at [Google API console](https://console.developers.google.com/).
2. You will have to do setup of your application at this console which involves details of your application and scope.
3. For this project we will be using Gmail scope to view email messages , labels, headers and settings and scope to edit your labels.
4. Now you need to provide a clientId for Oauth [To know more about Oauth 2.0](https://datatracker.ietf.org/doc/html/rfc6749#section-4.1).
5. You can download your client secret as Json File.

### Oauth Authentication

1.After setting up your application you need to do [Authorization Code Grant](https://googleapis.dev/java/google-api-client/latest/com/google/api/client/googleapis/auth/oauth2/GoogleAuthorizationCodeFlow.html).




