![](https://img.shields.io/badge/Spring_boot_3-blueviolet?style=for-the-badge)
![](https://img.shields.io/badge/Spring_Security_6-blueviolet?style=for-the-badge)
![](https://img.shields.io/badge/Java_17-yellow?style=for-the-badge)
![](https://img.shields.io/badge/Json_web_token-blue?style=for-the-badge)
# $\mathcal{{Spring \ Security \ With \ JWT } \ \}$
### $\ \ {Spring \ Boot \ application \ that \ makes \ use \ of \ JWT \ for \ securing \ an \ exposed \ REST \ API \ }$ 




• $\ \ \textcolor{green}{Authentication }$ : Authentication is 𝘵𝘩𝘦 𝘱𝘳𝘰𝘤𝘦𝘴𝘴 𝘰𝘧 𝘷𝘦𝘳𝘪𝘧𝘺𝘪𝘯𝘨 𝘵𝘩𝘦 𝘪𝘥𝘦𝘯𝘵𝘪𝘵𝘺 𝘰𝘧 𝘢 𝘶𝘴𝘦𝘳 which is 𝘣𝘢𝘴𝘦𝘥 𝘰𝘯 𝘱𝘳𝘰𝘷𝘪𝘥𝘦𝘥 𝘤𝘳𝘦𝘥𝘦𝘯𝘵𝘪𝘢𝘭𝘴.  
• $\ \ \textcolor{green}{Authorization  }$  : Authorization is 𝘵𝘩𝘦 𝘱𝘳𝘰𝘤𝘦𝘴𝘴 𝘰𝘧 checking 𝘪𝘧 𝘢 𝘶𝘴𝘦𝘳 𝘩𝘢𝘴 𝘱𝘳𝘰𝘱𝘦𝘳 𝘱𝘦𝘳𝘮𝘪𝘴𝘴𝘪𝘰𝘯/authority 𝘵𝘰 𝘱𝘦𝘳𝘧𝘰𝘳𝘮 𝘢 𝘱𝘢𝘳𝘵𝘪𝘤𝘶𝘭𝘢𝘳 𝘢𝘤𝘵𝘪𝘰𝘯  pre𝘢𝘴𝘴𝘶𝘮𝘪𝘯𝘨 𝘵𝘩𝘢𝘵 𝘵𝘩𝘦 𝘶𝘴𝘦𝘳 𝘪𝘴 𝘴𝘶𝘤𝘤𝘦𝘴𝘴𝘧𝘶𝘭𝘭𝘺 𝘢𝘶𝘵𝘩𝘦𝘯𝘵𝘪𝘤𝘢𝘵𝘦𝘥

# Calls for Admin

 url: http://localhost:8087/api/user/authenticate
 method: POST
payload : body : raw
 {
     "email": "admin@abc.com",
     "password" : "adminPassword"
  }
  
  response:
  eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZG1pbkBhYmMuY29tIiwicm9sZSI6WyJBRE1JTiJdLCJpYXQiOjE2OTU1OTYyMDksImV4cCI6MTY5NTYyMjIwOX0.NNHUL7qJNZ5Qe7LBJqY3gkyg38X5hXMq9sbp99Y1XVI
  
 url: http://localhost:8087/api/admin/hello
 method: get
 payload: put JWT in Authorisation in header on type Bearer
 
 response:  hello
 
# Calls for SuperAdmin

url: http://localhost:8087/api/user/authenticate
 method: POST
payload : body : raw
 {
     "email": "superadminadmin@abc.com",
     "password" : "superadminPassword"
  }
  
  response:
  eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJzdXBlcmFkbWluYWRtaW5AYWJjLmNvbSIsInJvbGUiOlsiU1VQRVJBRE1JTiJdLCJpYXQiOjE2OTU1OTcxOTUsImV4cCI6MTY5NTYyMzE5NX0.5hCK06ARDf8wqUPCf-PBeM66xM23uGE5d7kJZg9FpSA
  
 url: http://localhost:8087/api/superadmin/hi
 method: get
 payload: put JWT in Authorisation in header on type Bearer
 
 response:  hello
 
# Calls for User
 
   
 url: http://localhost:8087/api/user/register
 method: post
{
    "firstName" : "navneet",
     "lastName" : "tyagi",
     "email": "nav@abc.com",
     "password" : "asd"
  }
 response:  
 "accessToken": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJuYXZAYWJjLmNvbSIsInJvbGUiOlsiVVNFUiJdLCJpYXQiOjE2OTU1OTY4MzYsImV4cCI6MTY5NTYyMjgzNn0.4HeYF6HDxdwHbIwDgCxA_XfQs2fLVpYM1cLEmoeZNdE",
    "tokenType": "Bearer "
 
 url: http://localhost:8087/api/user/authenticate
 method: POST
payload : body : raw
 {
     "email": "nav@abc.com",
     "password" : "asd"
  }
  
  response:
  eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJhZG1pbkBhYmMuY29tIiwicm9sZSI6WyJBRE1JTiJdLCJpYXQiOjE2OTU1OTYyMDksImV4cCI6MTY5NTYyMjIwOX0.NNHUL7qJNZ5Qe7LBJqY3gkyg38X5hXMq9sbp99Y1XVI
