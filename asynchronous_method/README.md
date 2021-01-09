# Creating Asynchronous Methods

- url: <https://spring.io/guides/gs/async-method/>

- aynchronous_method

- Jackson JSON

  - convert JSON response to another object

  - @JsonIgnoreProperties

    - ignoreUnknown = false

    - ignore any attributes listed in the class

- RestTemplate

- RestTemplateBuilder

- @Async

  - indicating that it should run on a seperate thread

- @EnableAsync

- CompletableFuture

  - it makes it easy to pipeline multiple asynchronous operation and merge them into a single asynchronous computation

  - allOf()

  - join()

- CommandLineRunner

- 2개의 Thread로 비동기로 작동한

  - GithubLookup-1 과 GithubLookup-2 Thread
