# Portfolio backend

## Spring Boot Backend for the portfolio website

This is hosted in a distributed manner

- Frontend - Netlify
- Backend - Heroku
- Database - AWS

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
