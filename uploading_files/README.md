# Uploading Files

- url: <https://spring.io/guides/gs/uploading-files/>

- uploading_files

- Spring Boot MVC application

  - spring-boot-starter-thymeleaf

  - spring-boot-starter-web

- MultiparfConfigElement

  - \<multipart-config>

- application.properties

  - 스프링 부트 사용 시 필요한 옵션 설정

  - <https://docs.spring.io/spring-boot/docs/current/reference/html/appendix-application-properties.html>

  - spring.servlet.multipart

    - enabled: 멀티파트 업로드 지원여부 (default: true)

    - file-size-threshold: 파일이 메모리에 기록되는 임계값 (default: 0B)

    - location: 업로드 된 파일의 임시 저장 공간

    - max-file-size: 파일의 최대 사이즈 (default: 1MB)

    - max-request-size: 요청의 최대 사이즈 (default: 10MB)

- CommandLineRunner

  - 구동 시점에 실행되는 코드가 자바문자열 argument 배열에 접근해야할 필요가 있는 경우에 사용하는 인터페이스.

- @AutoConfigureMockMvc
