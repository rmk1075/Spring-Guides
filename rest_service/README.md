# RESTful Web Service

- url: <https://spring.io/guides/gs/rest-service/>

- rest_service

- Spring RESTful web service 에서 HTTP requests는 controller에 의해 동작한다.

  - @Controller + @ResponseBody

- @RestController: 해당 class를 Conrtoller로 지정

- @GetMapping: HTTP GET request에 대응하는 method를 mapping 해준다.
  
  - 이 프로젝트에서는 /greeting 요청에 대해 greeting() method를 mapping 해준다.

  - @PostMapping

  - @RequestMapping (e.g. @RequestMapping(method=GET))

- @RequestParam: query parameter를 method parameter에 bind

  - e.g. @RequestParam(value = "name", defaultValue = "World") String name

  - String parameter name을 변수 name에 할당하고 value가 없는 경우 default value "World"를 할당한다.

- @SpringBootApplication: @Configuration + @EnableAutoConfiguration + @ComponentScan

  - @Configuration: 해당 class가 bean의 설정이라는 것을 나타내는 anotation

  - @EnableAutoConfiguration: Spring Boot에 bean 설정들을 등록하는 annotation

  - @ComponentScan: 해당 package에서 @Component bean들을 스캔해서 등록한다.

    - @Configuration, @Repository, @Service, @Controller, @RestController 포함

- SpringApplication.run()을 사용 해서 application 실행함. (xml 설정파일 필요없음)