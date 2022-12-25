# Portfolio backend

## Spring Boot Backend for the portfolio website

This is hosted in a distributed manner

- Frontend - Netlify
- Backend - AWS EC2
- Database - AWS RDS

APIs exposed:

- GET /registerHit?slug={slugName}
  - Description: increment the number of hits on the website
- POST /contactEmail
  - RequestBody:
    ```
    {
        "from": "from@email.com",
        "body": "My email."
    }
    ```
  - Description: send email to my personal id
- GET /test
  - Description: test API to check if backend is working fine.

Following environment variables need to be set in the EC2 instance:
- DB_URL
- DB_USER
- DB_PASSWORD
- SMTP_LOGIN_USER
- SMTP_LOGIN_PASSWORD
- KEY_STORE_PASSWORD
- KEY_PASSWORD

References used to deploy backend on EC2:
- https://kgaurav23.medium.com/deploying-hosting-spring-boot-applications-on-aws-ec2-7babc15a1ab6
- https://cloudkatha.com/how-to-deploy-spring-boot-application-on-aws-ec2/

SSL/TLS has been set up on EC2 for subdomain ec2.rhish.in using the following references:
- https://medium.com/@michal_4609/amazon-ec2-ssl-from-lets-encrypt-in-spring-boot-application-e29cf9eec02
- https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/SSL-on-amazon-linux-ami.html
- https://certbot.eff.org/instructions?ws=other&os=centosrhel7

Domains/urls set for frontend and backend via GoDaddy are:
- rhish.in
- ec2.rhish.in:8443
