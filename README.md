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
curl -H "Authorization: bearer ecc3be30-100a-48f2-b45f-93d0868c1df4" localhost:8181/user
```