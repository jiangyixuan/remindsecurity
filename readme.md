## 使用方法
### 获取token 接口
```
curl -X POST \
  http://127.0.0.1:8080/authentication/form \
  -H 'Authorization: Basic cGhhcm1hY2lzdDpwaGFybWFjaXN0U2VjcmV0' \
  -H 'Postman-Token: 67c77d87-317e-4a25-8639-63cff59260b4' \
  -H 'content-type: multipart/form-data; boundary=----WebKitFormBoundary7MA4YWxkTrZu0gW' \
  -F username=admin \
  -F password=admin
```
Authorization  "Basic "+clientId+":"+clientSecret
  
  
### 获取资源接口
```
curl -X GET \
  http://127.0.0.1:8080/user \
  -H 'Authorization: bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJleHAiOjE1Mjg3OTA2ODMsInVzZXJfbmFtZSI6IjEyMyIsImF1dGhvcml0aWVzIjpbImFkbWluIiwiUk9MRV9VU0VSIl0sImp0aSI6IjFiYTYxZjk5LTFmOTYtNDhmNS05MzU3LTNmNzEzMTkzOGFkNSIsImNsaWVudF9pZCI6InBoYXJtYWNpc3QiLCJzY29wZSI6WyJhbGwiXX0.7JLq5Nicafk9sJ_HbjF-IJgSjo9KysU2rS5-e3Xc7Hw' 
```
Authorization "bearer "+返回jwt
  
  
## jwt解密后信息

```json
{
  "exp": 1528800976,
  "user_name": "admin",
  "authorities": [
    "admin",
    "ROLE_USER"
  ],
  "jti": "83273465-48bf-481d-987a-f69db0e24662",
  "client_id": "pharmacist",
  "scope": [
    "all"
  ]
}
```

### 主要执行流程

RemindUserDetailsService

登录成功后 RemindAuthenticationFailureHandler
失败后     RemindAuthenticationFailureHandler

  