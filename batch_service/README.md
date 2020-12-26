# Creating a Batch Service

- url: <https://spring.io/guides/gs/batch-processing/>

- batch_service

- SpringBatch
  
  - SpringBoot Batch

  - backEnd의 배치처리 기능을 구현

  - read - processing - write

    - Job -> Step -> ItemReader, ItemProcessor, ItemWriter

    - Job: 배치 처리 과정을 하나의 단위로 만들어 표현한 객체

      - 여러 step instance를 포함하는 container

    - Step: 실질적인 배치 처리를 정의하고 제어하는데 필요한 모든 정보가 있는 도메인 객체

    - ItemReader: step의 대상이 되는 배치 데이터를 읽어오는 인터페이스

    - ItemProcessor: ItemReader로 읽어 온 배치 데이터를 변환 (logic 처리)

    - ItemWriter: 배치 데이터를 저장 (DB나 파일에 저장)

- schema-@@platform@@.sql

  - Spring Boot 실행 시 자동으로 실행하는 sql 파일 형식

  - -all이 모든 플랫폼의 default 값

- hsqldb (org.hsqldb:hsqldb)

  - HSQLDB - 순수 java로 만들어진 DBMS

  - in-memory and disk-based

- ItemProcessor

  - Spring Batch's interface

  - 배치 로직 처리

- @EnableBatchProcessing

- JobBuilderFactory

- StepBuilderFactory

- FlatFileItemReader

- FlatFileItemReaderBuilder

- BeanWrapperFieldSetMapper

- PersonItemProcessor

- JdbcBatchItemWriter

- JdbcBatchItemWriterBuilder

- BeanPropertyItemSqlParameterSourceProvider
