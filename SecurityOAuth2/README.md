# Getting Started


## Code Understanding

```java
 @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity
                // bypass /unauthorised. Not authentication required
                .authorizeHttpRequests(
                        auth -> auth.requestMatchers("/unauthorised").permitAll()
                )
                .authorizeHttpRequests(
                        auth -> auth.anyRequest().authenticated()
                )
                .oauth2Login(Customizer.withDefaults())
                .build();
    }
```


```yaml
spring:
  security:
  oauth2:
    client:
      registration:
        google:
          client-id: <>
          client-secret: <>
        github:
          client-id: <>
          client-secret: <>

```

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/3.4.5/maven-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/3.4.5/maven-plugin/build-image.html)
* [Spring Web](https://docs.spring.io/spring-boot/3.4.5/reference/web/servlet.html)
* [OAuth2 Client](https://docs.spring.io/spring-boot/3.4.5/reference/web/spring-security.html#web.security.oauth2.client)
