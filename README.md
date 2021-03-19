Working example of Amazon Cognito Post Confirmation Hook with Java 8 and Serverless Framework

To generate a new user and complete the confirm sign up flow, I used:

```bash
aws cognito-idp \
  sign-up \
  --client-id xxxxxxxxxxxx \
  --username test@test.com \
  --password test@test.com \
  --region us-east-1

aws cognito-idp \
  admin-confirm-sign-up \
  --user-pool-id xxxxxxxxxxxxxx \
  --username test@test.com \
  --region us-east-1
```

Log output in CloudWatch:

```bash
2021-03-18 10:09:04 e52d1586-7627-4187-abfd-3d8046afa0ac INFO  Handler:18 - received: {version=1, region=us-east-1, userPoolId=us-east-1_AKn4tsX5C, userName=10axxx-7dxx-4xxx-xxx1-2xxxxxxxxx, callerContext={awsSdkVersion=aws-sdk-unknown-unknown, clientId=null}, triggerSource=PostConfirmation_ConfirmSignUp, request={userAttributes={sub=10axxx-7dxx-4xxx-xxx1-2xxxxxxxxx, cognito:email_alias=test@test.com, cognito:user_status=CONFIRMED, email_verified=false, email=test@test.com}}, response={}}
```

---

- StackOverflow: https://stackoverflow.com/questions/66684536/not-receiving-user-details-on-cognito-post-confirmation-trigger/66689113#66689113
