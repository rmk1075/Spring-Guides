# Accessing Relational Data using JDBC with Spring

- url: <https://spring.io/guides/gs/relational-data-access/>

- relationaldataaccess

- JdbcTemplate

  - SQL 관계형 DB와 JDBC 사용을 지원.
  
  - 자동으로 Connection 생성.

  - spring-jdbc에서 자동으로 JdbcTemplate 생성 -> @Autowired JdbcTemplate field에서 자동으로 load 후 사용 가능.

  - execute: Issue a single SQL execute, typically a DDL statement.
  
  - batchUpdate: Execute a batch using the supplied SQL statement with the batch of supplied arguments.

    - single insert문 실행을 위해서는 JdbcTemplate의 insert method가 더 좋다.

  - query

- H2: in-memory relational database engine
