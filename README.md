# Demo Code for Techevent Session <br> "Serverless Architecture - geht es ganz ohne Server?"
In order to deploy and run this demo you need to have an AWS Lambda account. These examples assume the AWS Region eu-west-1.

## NodeJS mit Serverless Framework
Install Serverless Framework on your local machine and configure credentials for your AWS Lambda account. See configuration guide: 
https://serverless.com/framework/docs/providers/aws/guide/installation/

Then checkout this repository and run the following
```shell
cd nodejs-simplest-api
sls deploy
```

If everything was configured correctly, you should see something like this:
```bash
api keys:
  None
endpoints:
  GET - https://d28b2muepj.execute-api.eu-west-1.amazonaws.com/dev/my-nodejs-service
functions:
  simpleHelloWorld: simplest-hello-world-dev-simpleHelloWorld
```

You can then test the endpoint url by curl or in browser
