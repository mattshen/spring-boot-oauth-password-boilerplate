Spring Boot Boilerplate with Gradle
===================

### Prerequisites
* Gradle 4 +
* JDK 8 +

### Run with DEV env config
```
SPRING_PROFILES_ACTIVE=dev gradle clean bootRun
```

### Run In Debug Mode
```
SPRING_PROFILES_ACTIVE=dev gradle clean bootRun --debug-jvm
```


### Get Access Token (Grant Type: password)
```bash
curl localhost:8181/oauth/token -d "grant_type=password&scope=read&username=user1&password=pass1" -u foo:bar
```

### Access Protected Resource
```bash
curl -H "Authorization: bearer 52f8e9af-de94-41d8-87a4-756d58a51c95" localhost:8181/user
```

### Check Token
```
curl -H "Authorization: bearer 52f8e9af-de94-41d8-87a4-756d58a51c95" localhost:8181/oauth/check_token
```