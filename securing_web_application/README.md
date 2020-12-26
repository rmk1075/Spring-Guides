# Securing a Web Application

- url: <https://spring.io/guides/gs/securing-web/>

- securing_web_application

- WebMvcConfigurer

- Spring Security

  - providing both authentication and authorization to Java applications

  - classpath에 존재하는 경우 모든 HTTP endpoint를 basic authentication으로 보호한다.

  - implementation 'org.springframework.boot:spring-boot-starter-security'

  - implementation 'org.springframework.security:spring-security-test'

- @EnableWebSecurity

- WebSecurityConfigurerAdapter
